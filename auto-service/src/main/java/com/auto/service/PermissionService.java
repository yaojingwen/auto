package com.auto.service;

import com.auto.entity.WebPermissionExample;
import com.auto.entity.WebPermission;

import java.math.BigDecimal;

/**
 *  Role 权限表Service层
 */
public interface PermissionService {

    WebPermission findById(int id);

}
