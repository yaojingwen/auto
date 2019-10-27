package com.auto.service;

import com.auto.entity.WebRole;

import java.math.BigDecimal;

/**
 *  Role 权限表Service层
 */
public interface RoleService {

    WebRole findByid(BigDecimal id) throws Exception;

}
