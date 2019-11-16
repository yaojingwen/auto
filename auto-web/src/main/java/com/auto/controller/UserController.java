package com.auto.controller;


import com.auto.components.exception.CustomException;
import com.auto.entity.WebAdmin;
import com.auto.entity.WebPermission;
import com.auto.entity.WebRole;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * 查询用户信息
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/one")
    public String findOne(Integer id,Model model){
        //根据ID查询用户信息
        WebAdmin webAdmin = loginService.findById(id);

        //将信息存入Model
        model.addAttribute("webAdmin",webAdmin);
        return "user-show";
    }
    /***
     * 添加用户角色
     * /user/role/add--->Method.POST
     */
    @ResponseBody
    @RequestMapping(value = "/role/add",method = RequestMethod.POST)
    public Map<String,Object> add(@RequestParam List<Integer> ids,Integer operatorId){
        //添加用户角色
        loginService.addUserRole(ids,operatorId);

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("success",true);
        resultMap.put("message","添加角色成功");
        return resultMap;
    }
    /***
     * 给用户添加角色页面跳转
     * @param operatorId    用户ID
     * @return
     */
    @RequestMapping(value = "/role/add",method = RequestMethod.GET)
    public String add(Integer operatorId,Model model){
        //查询所有角色
        List<WebRole> roles = roleService.list();

        //查询用户所有的角色记录
        List<WebRole> WebRoles = roleService.userRoleList(operatorId);
        if(WebRoles!=null && WebRoles.size()>0){
            //定义一个StringBuffer，拼接用户角色ID :[1][2][4]
            StringBuffer buffer = new StringBuffer();
            for (WebRole webRole : WebRoles) {
                buffer.append("["+webRole.getId()+"]");
            }
            //存储用户的角色信息
            model.addAttribute("userRoles",buffer.toString());
        }

        //将角色信息存入到Model中,页面回显
        model.addAttribute("roles",roles);

        //将用户ID存入到Model中用于添加用户角色
        model.addAttribute("operatorId",operatorId);
        return "user-role-add";
    }
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
