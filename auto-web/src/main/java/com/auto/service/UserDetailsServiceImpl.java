package com.auto.service;

import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/10/20 17:43
 */
public class UserDetailsServiceImpl implements UserDetailsService {
     @Autowired
     private LoginService loginService;


@Override
    public UserDetails loadUserByUsername(String user_Admin) throws UsernameNotFoundException {

    WebAdminExample example = new WebAdminExample();
    WebAdminExample.Criteria criteria = example.createCriteria();
    criteria.andUserAdminEqualTo(user_Admin);
    //执行查询
    List<WebAdmin> webAdminList = loginService.selectByExample(example);
   try {
       for (WebAdmin webAdmin : webAdminList) {
           List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
           authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
           System.out.println("用户名"+webAdmin.getUserAdmin()+"密码"+webAdmin.getUserPass());
           return new User(user_Admin, "{noop}" + webAdmin.getUserPass(), authorities);
       }
   }catch (Exception e){
       System.out.println("这里出问题了.........");
   }
       return null;
   }



}
