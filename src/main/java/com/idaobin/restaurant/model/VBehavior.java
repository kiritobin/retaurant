package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (VBehavior)实体类
 *
 * @author daobin
 * @since 2020-03-29 19:43:31
 */
public class VBehavior implements Serializable {
    private static final long serialVersionUID = -27092125228253138L;
    /**
    * 编号
    */
    private Integer id;
    /**
    * 数量
    */
    private Long num;
    /**
    * 单价
    */
    private Double price;
    /**
    * 供应商名称
    */
    private String suppliername;
    /**
    * 商品名称
    */
    private String shopname;
    /**
    * 处理时间
    */
    private String handledate;
    /**
    * 0出库1退货2销售
    */
    private Integer type;
    /**
    * 仓库名称
    */
    private String warename;
    /**
    * 用户姓名
    */
    private String username;
    /**
    * 客户名称
    */
    private String customname;
    /**
    * 状态 0存在1删除
    */
    private Integer warestatus;
    /**
    * 状态 0存在1删除
    */
    private Integer userstatus;
    /**
    * 状态 0存在1删除
    */
    private Integer customstatus;
    /**
    * 状态 0存在1删除
    */
    private Integer supplierstatus;
    /**
    * 状态 0存在1删除
    */
    private Integer shopstatus;

    public VBehavior(){
        super();
    }
    
    public VBehavior(Integer id, Long num, Double price, String suppliername, String shopname, String handledate, Integer type, String warename, String username, String customname, Integer warestatus, Integer userstatus, Integer customstatus, Integer supplierstatus, Integer shopstatus){
        this.id=id;
        this.num=num;
        this.price=price;
        this.suppliername=suppliername;
        this.shopname=shopname;
        this.handledate=handledate;
        this.type=type;
        this.warename=warename;
        this.username=username;
        this.customname=customname;
        this.warestatus=warestatus;
        this.userstatus=userstatus;
        this.customstatus=customstatus;
        this.supplierstatus=supplierstatus;
        this.shopstatus=shopstatus;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    
    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }
    
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
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
    
    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname;
    }
    
    public Integer getWarestatus() {
        return warestatus;
    }

    public void setWarestatus(Integer warestatus) {
        this.warestatus = warestatus;
    }
    
    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }
    
    public Integer getCustomstatus() {
        return customstatus;
    }

    public void setCustomstatus(Integer customstatus) {
        this.customstatus = customstatus;
    }
    
    public Integer getSupplierstatus() {
        return supplierstatus;
    }

    public void setSupplierstatus(Integer supplierstatus) {
        this.supplierstatus = supplierstatus;
    }
    
    public Integer getShopstatus() {
        return shopstatus;
    }

    public void setShopstatus(Integer shopstatus) {
        this.shopstatus = shopstatus;
    }

}