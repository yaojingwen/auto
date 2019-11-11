package com.auto.service.impl;

import com.auto.entity.WebAdmin;
import com.auto.entity.WebAdminExample;
import com.auto.mapper.WebAdminMapper;
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


    @Override
    public List<WebAdmin> selectByExample(WebAdminExample example) {
        return webAdminMapper.selectByExample(null);
    }

    @Override
    public WebAdmin selectByName(@Param("userAdmin")String userAdmin) {
        return webAdminMapper.selectByName(userAdmin);
    }

    @Override
    public WebAdminParam selectByPrimaryKey2(Integer operatorId) {
        return webAdminMapper.selectByPrimaryKey2(operatorId);
    }

    @Override
    public int deleteByExample(WebAdminExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer operatorId) {
        return 0;
    }

    @Override
    public int insert(WebAdmin record) {
        return webAdminMapper.insertSelective(record);
    }

    @Override
    public int insertSelective(WebAdmin record) {
        return 0;
    }

    @Override
    public WebAdmin selectByPrimaryKey(Integer operatorId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(WebAdmin record, WebAdminExample example) {
        return 0;
    }

    @Override
    public int updateByExample(WebAdmin record, WebAdminExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(WebAdmin record) {
        return webAdminMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WebAdmin record) {
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

}

