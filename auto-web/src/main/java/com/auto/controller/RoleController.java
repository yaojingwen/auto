package com.auto.controller;

import com.auto.entity.WebPermission;
import com.auto.entity.WebRole;
import com.auto.service.PermissionService;
import com.auto.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/11/16 15:36
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {

        @Autowired
        private RoleService roleService;
        @Autowired
        private PermissionService permissionService;

    /****
     * 添加角色权限
     * /role/permission/add--->Method.POST
     * 接收前台出入参数   角色ID,添加的权限(菜单)的ID集合
     * 保存---->角色权限中间表
     * 响应用户添加成功   success:true->成功     : false->失败,
     *                   message:"添加权限成功" : "添加权限失败"
     */
    @ResponseBody
    @RequestMapping(value = "/permission/add",method = RequestMethod.POST)
    public Map<String,Object> add(@RequestParam(value = "ids")List<Integer> ids, Integer roleId){
        //定义Map通知用户
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("message","授权成功！");
        result.put("success",true);

        try {
            //添加角色权限
            int acount = roleService.addRolePermission(ids,roleId);

            if(acount>0){
                return result;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //发生异常或者执行受影响行数为0，则授权失败
        result.put("message","授权失败！");
        result.put("success",false);
        return result;
    }
    /****
     * 加载所有权限(菜单)
     * /role/permission/add--->Method.GET
     */
    @RequestMapping(value = "/permission/add")
    public String add(Integer id,Model model){
        //加载所有菜单，用于页面显示
        List<WebPermission> permissions = permissionService.list();

        //查询用户所有的权限
        List<WebPermission> rolePermissions = permissionService.rolePermission(id);
        StringBuffer buffer = new StringBuffer();
        for (WebPermission rolePermission : rolePermissions) {
            buffer.append("["+rolePermission.getId()+"]");
        }
        model.addAttribute("rolePermissions",buffer.toString());

        //存储所有菜单，用于回显
        model.addAttribute("permissions",permissions);
        //将角色的id存储到model中，主要用于识别给哪个角色添加权限
        model.addAttribute("id",id);
        return "role-permission-add";
    }
        /***
         * 角色列表
         * @param model
         * @return
         */
        @RequestMapping(value = "/list")
        public String list (Model model){
            List<WebRole> roles = roleService.list();
            for (WebRole role : roles) {
                System.out.println(role);
            }
            model.addAttribute("roles",roles);
            return "role-list";
        }
    }

