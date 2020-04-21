package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TStock)实体类
 *
 * @author daobin
 * @since 2020-04-05 15:23:04
 */
public class TStock implements Serializable {
    private static final long serialVersionUID = -27970902654045324L;
    /**
    * 入库编号
    */
    private Integer stockid;
    /**
    * 商品编号-外键
    */
    private Integer shopid;
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
    * 验收人-外键
    */
    private String userid;
    /**
    * 仓库编号-外键
    */
    private Integer wareid;
    /**
    * 状态 0存在1删除
    */
    private Integer status;

    public TStock(){
        super();
    }
    
    public TStock(Integer stockid, Integer shopid, Long num, Double price, String stocktime, String userid, Integer wareid, Integer status){
        this.stockid=stockid;
        this.shopid=shopid;
        this.num=num;
        this.price=price;
        this.stocktime=stocktime;
        this.userid=userid;
        this.wareid=wareid;
        this.status=status;
    }
    
    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }
    
    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
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
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public Integer getWareid() {
        return wareid;
    }

    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}