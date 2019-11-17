package com.auto.service.impl;

import com.auto.components.exception.CustomException;
import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import com.auto.entity.WebPermission;
import com.auto.entity.WebRole;
import com.auto.mapper.WebAdminMapper;
import com.auto.mapper.WebPermissionMapper;
import com.auto.mapper.WebRoleMapper;
import com.auto.param.WebAdminParam;
import com.auto.service.LoginService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/10/20 17:55
 */
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private WebAdminMapper webAdminMapper;
    @Autowired
    private WebRoleMapper webRoleMapper;
    @Autowired
    private WebPermissionMapper webPermissionMapper;


    @Override
    public List<WebAdmin> selectByExample(WebAdminExample example)throws CustomException {
        return webAdminMapper.selectByExample(null);
    }

    @Override
    public WebAdmin selectByName(@Param("userAdmin")String userAdmin)throws Exception, CustomException {
        return webAdminMapper.selectByName(userAdmin);
    }

    @Override
    public WebAdminParam selectByPrimaryKey2(Integer operatorId)throws Exception, CustomException {
        return webAdminMapper.selectByPrimaryKey2(operatorId);
    }

    @Override
    public int deleteByExample(WebAdminExample example)throws Exception, CustomException {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer operatorId)throws Exception, CustomException {
        return webAdminMapper.deleteByPrimaryKey(operatorId);
    }

    @Override
    public int insert(WebAdmin record)throws Exception, CustomException {
        return webAdminMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(WebAdmin record)throws Exception, CustomException {
        return 0;
    }

    /***
     * 根据operatorId查询用户信息
     * @param operatorId
     * @param
     * @return
     */
    @Override
    public WebAdmin selectByPrimaryKey(Integer operatorId)throws Exception, CustomException {
        WebAdmin webAdmin = webAdminMapper.selectByPrimaryKey(operatorId);
        //然后根据webadmin查角色
        List<WebRole> webRoleList = webRoleMapper.userRoleList(operatorId);
        for (WebRole webRole : webRoleList) {
            List<WebPermission> webPermissions = webPermissionMapper.rolePermissionList(webRole.getId());
            webRole.setWebPermissions(webPermissions);
        }
        webAdmin.setWebRoles(webRoleList);
        return webAdmin;
    }

    @Override
    public int updateByExampleSelective(WebAdmin record, WebAdminExample example)throws Exception, CustomException {
        return 0;
    }

    @Override
    public int updateByExample(WebAdmin record, WebAdminExample example)throws Exception, CustomException {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(WebAdmin record) throws Exception, CustomException{
        return webAdminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WebAdmin record)throws Exception, CustomException {
        return webAdminMapper.updateByPrimaryKey(record);
    }

    /***
     * 实现类
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo<WebAdmin> list(int page, int size) {
        //分页
        PageHelper.startPage(page, size);
        //集合查询
        List<WebAdmin> users = webAdminMapper.selectByExample(null);
        System.out.println(users);
        for (WebAdmin user : users) {
            System.out.println(user);
        }
        return new PageInfo<WebAdmin>(users);
    }


    /***
     * 实现类
     * 添加用户角色
     * @param ids
     * @param operatorId
     * @return
     */
    @Override
    public int addUserRole(List<Integer> ids, Integer operatorId) {
        //删除用户角色
        int dcount = webAdminMapper.deleteUserRole(operatorId);
        //新增用户角色
        int acount = 0; //记录受影响行数
        for (Integer id : ids) {
            acount+=webAdminMapper.addUserRole(operatorId,id);
        }
        return acount;
    }


}

