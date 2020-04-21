package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (VStock)实体类
 *
 * @author daobin
 * @since 2020-04-05 16:39:57
 */
public class VStock implements Serializable {
    private static final long serialVersionUID = 487412123736271765L;
    /**
    * 入库编号
    */
    private Integer stockid;
    /**
    * 入库数量
    */
    private Long num;
    /**
    * 单价
    */
    private Double price;
    /**
    * 入库时间
    */
    private String stocktime;
    /**
    * 仓库编号
    */
    private Integer wareid;
    /**
    * 仓库名称
    */
    private String warename;
    /**
    * 用户编号
    */
    private String userid;
    /**
    * 用户姓名
    */
    private String username;
    /**
    * 供应商编号
    */
    private Integer supplierid;
    /**
    * 供应商名称
    */
    private String suppliername;
    /**
    * 商品编号
    */
    private Integer shopid;
    /**
    * 商品名称
    */
    private String shopname;
    /**
    * 状态 0存在1删除
    */
    private Integer status;

    public VStock(){
        super();
    }
    
    public VStock(Integer stockid, Long num, Double price, String stocktime, Integer wareid, String warename, String userid, String username, Integer supplierid, String suppliername, Integer shopid, String shopname, Integer status){
        this.stockid=stockid;
        this.num=num;
        this.price=price;
        this.stocktime=stocktime;
        this.wareid=wareid;
        this.warename=warename;
        this.userid=userid;
        this.username=username;
        this.supplierid=supplierid;
        this.suppliername=suppliername;
        this.shopid=shopid;
        this.shopname=shopname;
        this.status=status;
    }
    
    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }
    
    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    public String getStocktime() {
        return stocktime;
    }

    public void setStocktime(String stocktime) {
        this.stocktime = stocktime;
    }
    
    public Integer getWareid() {
        return wareid;
    }

    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }
    
    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
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
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}