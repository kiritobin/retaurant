package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.GetSystemTime;
import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.ShopDao;
import com.idaobin.restaurant.dao.SupplierDao;
import com.idaobin.restaurant.model.Data;
import com.idaobin.restaurant.model.TShop;
import com.idaobin.restaurant.model.VShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    @Autowired
    private ShopDao dao;
    @Autowired
    private SupplierDao sdao;

    /**
     * 添加商品
     * @param shop
     * @return
     */
    public String addShop(TShop shop){
        shop.setCgid("cg"+(int)((Math.random()*9+1)*100000));
        int row=dao.addShop(shop);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("添加商品成功");
        }
        else {
            data.setMsg("添加商品失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有商品信息
     * @return
     */
    public String getShop(){
        List<Object> list=new ArrayList<>();
        List<VShop> shopList=dao.getShop();
        List<String> supplierList=sdao.getSupplierName();
        list.add(shopList);
        list.add(supplierList);
        Data data=new Data();
        data.setMsg("查询所有商品");
        data.setSize(shopList.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取商品编号-名称
     * @return
     */
    public String getShopName(){
        List<String> list=dao.getShopName();
        Data data=new Data();
        data.setMsg("查询所有商品名称");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 假删除商品
     * @param shop
     * @return
     */
    public String deleteShopF(TShop shop){
        int row=dao.deleteShopF(shop);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("删除商品成功");
        }
        else {
            data.setMsg("删除商品失败");
        }
        return JacksonUtil.beanToJson(data);
    }
}
