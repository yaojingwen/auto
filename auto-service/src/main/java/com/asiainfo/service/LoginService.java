package com.asiainfo.service;

import com.asiainfo.entity.WebAdmin;


public interface LoginService {
     //根据名字查找用户
     WebAdmin findByName(String name) throws Exception;

     //保存用户登录信息
     void save(WebAdmin userlogin) throws Exception;

     //根据姓名删除
     void removeByName(String name) throws Exception;

     //根据用户名更新
     void updateByName(String name, WebAdmin userlogin);
     //根据名字查找用户
     WebAdmin getUserByUsername(String userAdmin);
}
