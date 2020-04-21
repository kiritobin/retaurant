package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TWare)实体类
 *
 * @author daobin
 * @since 2020-03-28 01:25:08
 */
public class TWare implements Serializable {
    private static final long serialVersionUID = -63862199864371263L;
    /**
    * 仓库编号
    */
    private Integer wareid;
    /**
    * 仓库名称
    */
    private String warename;
    /**
    * 仓库地址
    */
    private String wareadress;
    /**
    * 备注
    */
    private String remark;
    /**
    * 状态 0存在1删除
    */
    private Integer status;

    public TWare(){
        super();
    }
    
    public TWare(Integer wareid, String warename, String wareadress, String remark, Integer status){
        this.wareid=wareid;
        this.warename=warename;
        this.wareadress=wareadress;
        this.remark=remark;
        this.status=status;
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
    
    public String getWareadress() {
        return wareadress;
    }

    public void setWareadress(String wareadress) {
        this.wareadress = wareadress;
    }
    
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}