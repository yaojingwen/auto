package com.auto.controller;


import com.auto.entity.WebAdmin;
import com.auto.entity.WebPermission;
import com.auto.entity.WebRole;
import com.auto.param.WebAdminParam;
import com.auto.param.WebRoleParam;
import com.auto.service.LoginService;
import com.auto.service.PermissionService;
import com.auto.service.RoleService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/10/27 15:44
 */
@Controller
@RequestMapping(value ="/user")
public class UserController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;

    /***
     * 集合查询
     * 映射地址  /user/list
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(@RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
                       @RequestParam(value = "rows",required = false,defaultValue = "5")Integer rows,
                       Model model){
        //调用Service实现集合查询
        PageInfo<WebAdmin> pageInfo = loginService.list(pageNum, rows);

        //将界面存储到Model中
        model.addAttribute("pageInfo",pageInfo);
        return "user-list";
    }
    /**
     * 用户添加
     * @param
     * @return
     */
    @RequestMapping(value = "/add")
    public String add(WebAdmin webAdmin,RedirectAttributes attr){
        //添加用户
        if(0<loginService.insert(webAdmin)) {
            return "redirect:/user/list";
        }
            return "404";
    }

    @RequestMapping(value = "/delAdmin")
    public String delAdmin(int id){
        //删除用户
        if(0<loginService.deleteByPrimaryKey(id)) {
            return "redirect:/user/list";
        }
        return "404";
    }

    @RequestMapping(value = "/selectAdminByRole")
    public String selectAdminByRole(int id,Model model){
        //用户详情
        WebAdminParam admin=loginService.selectByPrimaryKey2(id);
        WebRoleParam  role=roleService.findByIdParam(id);
        WebPermission permission=permissionService.findById(id);
        if(null!=admin) {
            role.setPermissions(permission);
            admin.setRoles(role);
            model.addAttribute("admin",admin);
            return "user-show";
        }
        return "404";
    }

    @RequestMapping(value = "/selectAdminById")
    public String selectAdminById(int id,Model model){
        //用户详情
        WebAdminParam admin=loginService.selectByPrimaryKey2(id);
        if(null!=admin) {
            model.addAttribute("admin",admin);
            return "user-update";
        }
        return "404";
    }

    @RequestMapping(value = "/updateAdmin")
    public String updateAdmin(WebAdmin admin){
        System.out.println(admin.getOperatorId());
        //删除用户
        if(0<loginService.updateByPrimaryKey(admin)) {

            return "redirect:/user/list";
        }
        System.out.println("111");
        return "404";
    }
}
