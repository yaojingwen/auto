package com.auto.service.impl;

import com.auto.entity.WebAdmin;
import com.auto.mapper.WebAdminMapper;
import com.auto.service.LoginService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/10/20 17:55
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private WebAdminMapper webAdminMapper;
    @Override
    public WebAdmin findByName(String name) throws Exception {
        return null;
    }

    @Override
    public void save(WebAdmin userlogin) throws Exception {

    }

    @Override
    public void removeByName(String name) throws Exception {

    }

    @Override
    public void updateByName(String name, WebAdmin userlogin) {

    }

    @Override
    public WebAdmin getByUserName(String user_Admin) {
        return webAdminMapper.getByUserName(user_Admin);
    }

    /***
     * 实现类
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<WebAdmin> list(int page, int size) {
        //分页
        PageHelper.startPage(page,size);
        //集合查询
        List<WebAdmin> users = webAdminMapper.list();
        System.out.println(users);
        for (WebAdmin user : users) {
            System.out.println(user);
        }
        return new PageInfo<WebAdmin>(users);
    }
}
