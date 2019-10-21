package com.asiainfo.service.impl;

import com.asiainfo.entity.WebAdmin;
import com.asiainfo.mapper.WebAdminMapper;
import com.asiainfo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
