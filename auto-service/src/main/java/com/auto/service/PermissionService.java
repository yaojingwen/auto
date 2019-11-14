package com.auto.service;

import com.auto.components.exception.CustomException;
import com.auto.entity.WebPermission;

/**
 *  Role 权限表Service层
 */
public interface PermissionService {

    WebPermission findById(int id)throws Exception, CustomException;

}
