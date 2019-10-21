package com.asiainfo.service;

import com.asiainfo.entity.WebAdmin;
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

          WebAdmin webAdmin= loginService.getByUserName(user_Admin);

        List<GrantedAuthority> authorities =new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
    System.out.println(webAdmin.getUserPass()+user_Admin+"这里出问题了.........");
    System.out.println("{noop}"+webAdmin.getUserPass()+"这里出问题了.........");
        return new User(user_Admin,"{noop}"+webAdmin.getUserPass(),authorities);
    }
}
