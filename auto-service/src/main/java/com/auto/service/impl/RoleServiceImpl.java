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

    @Override
    public int addRolePermission(List<Integer> ids, Integer roleId) {
        //删除之前角色所拥有的所有权限
        int dcount = webRoleMapper.deleteRolePermission(roleId);

        //增加新的角色权限
        int acount =0;  //受影响行数
        for (Integer id : ids) {
            acount+=webRoleMapper.addRolePermission(id,roleId);
        }
        return acount;
    }

    /***
     * 实现类
     * 查询用户角色信息
     * @param id
     * @return
     */
    @Override
    public List<WebRole> userRoleList(Integer id) {
        return webRoleMapper.userRoleList(id);
    }

}

