package com.auto.service.impl;

import com.auto.components.exception.CustomException;
import com.auto.entity.WebRole;
import com.auto.mapper.WebRoleMapper;
import com.auto.param.WebRoleParam;
import com.auto.service.RoleService;
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
public class RoleServiceImpl implements RoleService {

    @Autowired
    private WebRoleMapper webRoleMapper;


    @Override
    public List<WebRole> list() {
        return webRoleMapper.selectByExample(null);
    }

    @Override
    public WebRoleParam findByIdParam(int id)throws Exception, CustomException {
        return webRoleMapper.selectByPrimaryKey2(id);
    }

}

