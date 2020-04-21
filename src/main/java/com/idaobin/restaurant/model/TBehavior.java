package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TBehavior)实体类
 *
 * @author daobin
 * @since 2020-03-28 03:06:34
 */
public class TBehavior implements Serializable {
    private static final long serialVersionUID = 753240532007746738L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 商品编号-外键
    */
    private Integer shopid;
    /**
    * 数量
    */
    private Long num;
    /**
    * 单价
    */
    private Double price;
    /**
    * 处理人-外键
    */
    private String userid;
    /**
    * 供应商-外键
    */
    private Integer supplierid;
    /**
    * 客户编号-外键
    */
    private Integer customid;
    /**
    * 出库仓库地址-外键
    */
    private Integer wareid;
    /**
    * 处理时间
    */
    private String handledate;
    /**
    * 0出库1退货2销售
    */
    private Integer type;
    /**
    * 状态 0存在1删除
    */
    private Integer status;

    public TBehavior(){
        super();
    }
    
    public TBehavior(Integer id, Integer shopid, Long num, Double price, String userid, Integer supplierid, Integer customid, Integer wareid, String handledate, Integer type, Integer status){
        this.id=id;
        this.shopid=shopid;
        this.num=num;
        this.price=price;
        this.userid=userid;
        this.supplierid=supplierid;
        this.customid=customid;
        this.wareid=wareid;
        this.handledate=handledate;
        this.type=type;
        this.status=status;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }
    
    public Integer getCustomid() {
        return customid;
    }

    public void setCustomid(Integer customid) {
        this.customid = customid;
    }
    
    public Integer getWareid() {
        return wareid;
    }

    public void setWareid(Integer wareid) {
        this.wareid = wareid;
    }
    
    public String getHandledate() {
        return handledate;
    }

    public void setHandledate(String handledate) {
        this.handledate = handledate;
    }
    
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}