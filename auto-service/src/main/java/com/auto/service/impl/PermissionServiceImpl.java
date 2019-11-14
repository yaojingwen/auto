package com.auto.service.impl;

import com.auto.components.exception.CustomException;
import com.auto.entity.WebPermission;
import com.auto.mapper.WebPermissionMapper;
import com.auto.service.PermissionService;
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
    public WebPermission findById(int id)throws Exception, CustomException {
        return webPermissionMapper.selectByPrimaryKey(id);
    }
}

