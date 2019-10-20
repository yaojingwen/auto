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
    public UserDetails loadUserByUsername(String userAdmin) throws UsernameNotFoundException {

          WebAdmin webAdmin= loginService.getUserByUsername(userAdmin);

        List<GrantedAuthority> authorities =new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(userAdmin,"{noop}"+webAdmin.getUserPass(),authorities);
    }
}
