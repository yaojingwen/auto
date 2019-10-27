package com.auto.entity;

import java.util.List;

/**
 * @Author: wangdawei
 * @Description:
 * @Date: 2019/10/27 15:34
 */
public class WebPermisson {
    private Long id;
    private String permissionName;
    private String url;
    private Long pid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public List<WebRole> getRols() {
        return rols;
    }

    public void setRols(List<WebRole> rols) {
        this.rols = rols;
    }

    //一个权限可以授予多个角色，权限和角色之间属于一对多关系，彼此之间属于多对多关系
    private List<WebRole> rols;
//get..set...
}
