package com.auto.controller;


import com.auto.components.exception.CustomException;
import com.auto.entity.WebAdmin;
import com.auto.entity.WebPermission;
import com.auto.param.WebAdminParam;
import com.auto.param.WebRoleParam;
import com.auto.service.LoginService;
import com.auto.service.PermissionService;
import com.auto.service.RoleService;
import com.auto.util.StatusCode;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
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
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /***
     * 集合查询
     * 映射地址  /user/list
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(@RequestParam(value = "pageNum",required = false,defaultValue = "1")Integer pageNum,
                       @RequestParam(value = "rows",required = false,defaultValue = "5")Integer rows,
                       Model model)throws Exception, CustomException{
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
    public String add(WebAdmin webAdmin,RedirectAttributes attr) throws Exception, CustomException {
       /* //用户密码加密
        String password = bCryptPasswordEncoder.encode(webAdmin.getUserPass());
        if (StringUtils.isEmpty(password)) {
            throw new CustomException(StatusCode.FAIL, "操作失败");
        }
        webAdmin.setUserPass(password);
*/
        //添加用户
        if (webAdmin.getOperatorId()!=null){
            if(0<loginService.updateByPrimaryKey(webAdmin)) {
                return "redirect:/user/list";
            }
            throw new CustomException(StatusCode.FAIL, "操作失败");
        }else{
            if(0<loginService.insert(webAdmin)) {
                return "redirect:/user/list";
            }
            throw new CustomException(StatusCode.FAIL, "操作失败");
        }
    }

    @RequestMapping(value = "/delAdmin")
    public String delAdmin(int id)throws Exception, CustomException{
        //删除用户
        if(0<loginService.deleteByPrimaryKey(id)) {

            return "redirect:/user/list";
        }
        throw new CustomException(StatusCode.FAIL, "操作失败");
    }

    @RequestMapping(value = "/selectAdminByRole")
    public String selectAdminByRole(int id,Model model)throws Exception, CustomException{
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
        throw new CustomException(StatusCode.FAIL, "操作失败");
    }

    @RequestMapping(value = "/selectAdminById")
    public String selectAdminById(int id,Model model)throws Exception, CustomException{
        //用户详情
        if (id==0){
            return "user-add";
        }
        WebAdminParam admin=loginService.selectByPrimaryKey2(id);
        if(null!=admin) {
            model.addAttribute("admin",admin);

            return "user-add";
        }
        throw new CustomException(StatusCode.FAIL, "操作失败");
    }

    @RequestMapping(value = "/updateAdmin")
    public String updateAdmin(WebAdmin admin)throws Exception, CustomException{
        //删除用户
        if(0<loginService.updateByPrimaryKey(admin)) {
            return "redirect:/user/list";
        }
        throw new CustomException(StatusCode.FAIL, "操作失败");
    }
}
