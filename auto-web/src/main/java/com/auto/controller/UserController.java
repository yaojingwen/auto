package com.auto.controller;


import com.auto.entity.WebAdmin;
import com.auto.service.LoginService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String add(WebAdmin webAdmin){
        //添加用户
        int acount = loginService.insert(webAdmin);
        return "redirect:/user/list";
    }






}
