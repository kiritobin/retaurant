package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author daobin
 * @since 2020-04-01 21:47:42
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = -42735015330989730L;
    /**
    * 用户编号
    */
    private String userid;
    /**
    * 用户姓名
    */
    private String username;
    /**
    * 密码
    */
    private String userpwd;
    /**
    * 邮箱
    */
    private String email;
    /**
    * 状态 0存在1删除
    */
    private Integer status;

    public TUser(){
        super();
    }
    
    public TUser(String userid, String username, String userpwd, String email, Integer status){
        this.userid=userid;
        this.username=username;
        this.userpwd=userpwd;
        this.email=email;
        this.status=status;
    }
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}