package com.auto.service;

import com.auto.components.exception.CustomException;
import com.auto.param.WebRoleParam;

/**
 *  Role 权限表Service层
 */
public interface RoleService {

    WebRoleParam findByIdParam(int id) throws Exception, CustomException;

}
