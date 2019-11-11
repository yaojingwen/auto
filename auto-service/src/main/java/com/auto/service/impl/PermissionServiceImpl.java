package com.auto.service.impl;

import com.auto.entity.WebPermission;
import com.auto.entity.WebRole;
import com.auto.mapper.WebPermissionMapper;
import com.auto.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/10/20 17:55
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private WebPermissionMapper webPermissionMapper;

    @Override
    public WebPermission findById(int id){
        return webPermissionMapper.selectByPrimaryKey(id);
    }
}

