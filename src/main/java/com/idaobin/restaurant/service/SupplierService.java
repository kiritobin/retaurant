package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.SupplierDao;
import com.idaobin.restaurant.model.Data;
import com.idaobin.restaurant.model.TSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierDao dao;

    /**
     * 添加供应商
     * @param supplier
     * @return
     */
    public String addSupplier(TSupplier supplier){
        int row=dao.addSupplier(supplier);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("添加供应商成功");
        }
        else {
            data.setMsg("添加供应商失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有供应商
     * @return
     */
    public String getSuppiler(){
        List<TSupplier> list=dao.getSupplier();
        Data data=new Data();
        data.setMsg("获取所有供应商");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有供应商编号-名称
     * @return
     */
    public String getSuppilerName(){
        List<String> list=dao.getSupplierName();
        Data data=new Data();
        data.setMsg("获取所有供应商名称");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 删除供应商
     * @param supplier
     * @return
     */
    public String deleteSupplierF(TSupplier supplier){
        int row=dao.deleteSupplierF(supplier);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("删除供应商成功");
        }
        else {
            data.setMsg("删除供应商失败");
        }
        return JacksonUtil.beanToJson(data);
    }
}
