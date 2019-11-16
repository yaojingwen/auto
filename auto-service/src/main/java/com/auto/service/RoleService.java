package com.auto.service;

import com.auto.components.exception.CustomException;
import com.auto.entity.WebRole;
import com.auto.entity.WebRoleExample;
import com.auto.mapper.WebRoleMapper;
import com.auto.param.WebRoleParam;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 *  Role 权限表Service层
 */
public interface RoleService {

    //集合查询
    List<WebRole> list();


    WebRoleParam findByIdParam(int id) throws Exception, CustomException;

    int addRolePermission(List<Integer> ids, Integer roleId);
    /***
     * 接口
     * 查询用户角色信息
     * @param operatorId
     * @return
     */
    List<WebRole> userRoleList(Integer operatorId);
}
