package com.auto.controller;

import com.auto.entity.WebRole;
import com.auto.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


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

