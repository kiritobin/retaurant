package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.model.TSupplier;
import com.idaobin.restaurant.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupplierControl {

    @Autowired
    private SupplierService ss;

    /**
     * 添加供应商接口
     * @param supplier
     * @return
     */
    @RequestMapping("/addSupplier.do")
    public String addSupplier(TSupplier supplier){
        return ss.addSupplier(supplier);
    }

    /**
     * 获取所有供应商接口
     * @return
     */
    @RequestMapping("/getSupplier.do")
    public String getSupplier(){
        return ss.getSuppiler();
    }

    /**
     * 获取所有供应商编号-名称接口
     * @return
     */
    @RequestMapping("/getSupplierName.do")
    public String getSupplierName(){
        return ss.getSuppilerName();
    }

    /**
     * 删除供应商接口
     * @param supplier
     * @return
     */
    @RequestMapping("/deleteSupplier.do")
    public String deleteSupplierF(TSupplier supplier){
        return ss.deleteSupplierF(supplier);
    }
}
