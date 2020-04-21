package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TShop)实体类
 *
 * @author daobin
 * @since 2020-04-05 12:34:48
 */
public class TShop implements Serializable {
    private static final long serialVersionUID = -15027629530263744L;
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
    * 采购编号
    */
    private String cgid;

    public TShop(){
        super();
    }
    
    public TShop(Integer shopid, String shopname, Double price, Integer supplierid, String meter, String manufacture, String guarantee, Integer status, String cgid){
        this.shopid=shopid;
        this.shopname=shopname;
        this.price=price;
        this.supplierid=supplierid;
        this.meter=meter;
        this.manufacture=manufacture;
        this.guarantee=guarantee;
        this.status=status;
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
    
    public String getCgid() {
        return cgid;
    }

    public void setCgid(String cgid) {
        this.cgid = cgid;
    }

}