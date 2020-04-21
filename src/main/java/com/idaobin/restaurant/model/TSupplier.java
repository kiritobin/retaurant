package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TSupplier)实体类
 *
 * @author daobin
 * @since 2020-03-27 20:48:06
 */
public class TSupplier implements Serializable {
    private static final long serialVersionUID = 996092472670425049L;
    /**
    * 供应商编号
    */
    private Integer supplierid;
    /**
    * 供应商名称
    */
    private String suppliername;
    /**
    * 地址
    */
    private String address;
    /**
    * 联系方式
    */
    private String contact;
    /**
    * 状态 0存在1删除
    */
    private Integer status;

    public TSupplier(){
        super();
    }
    
    public TSupplier(Integer supplierid, String suppliername, String address, String contact, Integer status){
        this.supplierid=supplierid;
        this.suppliername=suppliername;
        this.address=address;
        this.contact=contact;
        this.status=status;
    }
    
    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }
    
    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}