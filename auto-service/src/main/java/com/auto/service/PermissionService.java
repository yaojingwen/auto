package com.auto.service;

import com.auto.components.exception.CustomException;
import com.auto.entity.WebPermission;

import java.util.List;

/**
 *  Role 权限表Service层
 */
public interface PermissionService {

    WebPermission findById(int id)throws Exception, CustomException;

    //集合查询
    List<WebPermission> list();


    int insert(WebPermission record);

    List<WebPermission> rolePermission(Integer id);

}
