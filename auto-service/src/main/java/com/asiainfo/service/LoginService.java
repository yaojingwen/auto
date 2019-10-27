package com.asiainfo.service;

import com.asiainfo.entity.WebAdmin;
import com.github.pagehelper.PageInfo;


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
     WebAdmin getByUserName(String user_Admin);

     /**
      * 用户集合查询-接口
      * @return
      * @param page
      * @param size
      */
     PageInfo<WebAdmin> list(int page, int size);


}
