package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (VShop)实体类
 *
 * @author daobin
 * @since 2020-04-05 12:44:23
 */
public class VShop implements Serializable {
    private static final long serialVersionUID = 898076228801624435L;
    /**
    * 商品编号
    */
    private Integer shopid;
    /**
    * 商品名称
    */
    private String shopname;
    /**
    * 商品价格
    */
    private Double price;
    /**
    * 供应商编号-外键
    */
    private Integer supplierid;
    /**
    * 计量单位
    */
    private String meter;
    /**
    * 生产日期
    */
    private String manufacture;
    /**
    * 保质期
    */
    private String guarantee;
    /**
    * 状态 0存在1删除
    */
    private Integer status;
    /**
    * 供应商名称
    */
    private String suppliername;
    /**
    * 采购编号
    */
    private String cgid;

    public VShop(){
        super();
    }
    
    public VShop(Integer shopid, String shopname, Double price, Integer supplierid, String meter, String manufacture, String guarantee, Integer status, String suppliername, String cgid){
        this.shopid=shopid;
        this.shopname=shopname;
        this.price=price;
        this.supplierid=supplierid;
        this.meter=meter;
        this.manufacture=manufacture;
        this.guarantee=guarantee;
        this.status=status;
        this.suppliername=suppliername;
        this.cgid=cgid;
    }
    
    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }
    
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }
    
    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }
    
    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
    
    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }
    
    public String getCgid() {
        return cgid;
    }

    public void setCgid(String cgid) {
        this.cgid = cgid;
    }

}