package com.auto.controller;

import com.auto.entity.WebPermission;
import com.auto.service.PermissionService;
import com.auto.util.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/11/16 17:03
 */
@Controller
@RequestMapping(value = "/permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    /****
     * 权限资源查询
     * @param model
     * @return
     */
    @RequestMapping(value = "/list")
    public String list(Model model){
        //集合查询
        List<WebPermission> permissions = permissionService.list();

        //存储permission页面回显
        model.addAttribute("permissions",permissions);
        return "permission-list";
    }

    /***
     * 添加权限配置
     * @param model
     * @return 跳转到列表页
     */
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(Model model){
        //加载所有权限
        List<WebPermission> permissions = permissionService.list();

        //存储权限到页面回显
        model.addAttribute("permissions",permissions);

        //跳转到页面
        return  "permission-add";
    }

    /***
     * 权限资源的增加
     * @param permission
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(WebPermission permission){
        //增加操作
        int acount = permissionService.insert(permission);

        //增加完成，跳转到资源列表页
        return "redirect:/permission/list";
    }
}