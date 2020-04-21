package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TCustom)实体类
 *
 * @author daobin
 * @since 2020-03-28 00:42:22
 */
public class TCustom implements Serializable {
    private static final long serialVersionUID = -18766756789263306L;
    /**
    * 客户编号
    */
    private Integer customid;
    /**
    * 客户名称
    */
    private String customname;
    /**
    * 客户地址
    */
    private String customadress;
    /**
    * 客户号码
    */
    private String customtel;
    /**
    * 状态 0存在1删除
    */
    private Integer status;

    public TCustom(){
        super();
    }
    
    public TCustom(Integer customid, String customname, String customadress, String customtel, Integer status){
        this.customid=customid;
        this.customname=customname;
        this.customadress=customadress;
        this.customtel=customtel;
        this.status=status;
    }
    
    public Integer getCustomid() {
        return customid;
    }

    public void setCustomid(Integer customid) {
        this.customid = customid;
    }
    
    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname;
    }
    
    public String getCustomadress() {
        return customadress;
    }

    public void setCustomadress(String customadress) {
        this.customadress = customadress;
    }
    
    public String getCustomtel() {
        return customtel;
    }

    public void setCustomtel(String customtel) {
        this.customtel = customtel;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}