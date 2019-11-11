package com.auto.service;

import com.auto.entity.WebRole;
import com.auto.param.WebRoleParam;

import java.math.BigDecimal;

/**
 *  Role 权限表Service层
 */
public interface RoleService {

    WebRoleParam findByIdParam(int id) ;

}
