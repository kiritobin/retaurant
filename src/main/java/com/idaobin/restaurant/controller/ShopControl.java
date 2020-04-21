package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.model.TShop;
import com.idaobin.restaurant.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopControl {

    @Autowired
    private ShopService ss;

    /**
     * 添加商品接口
     * @param shop
     * @return
     */
    @RequestMapping("/addShop.do")
    public String addShop(TShop shop){
        return ss.addShop(shop);
    }

    /**
     * 获取所有商品接口
     * @return
     */
    @RequestMapping("/getShop.do")
    public String getShop(){
        return ss.getShop();
    }

    /**
     * 获取商品名称接口
     * @return
     */
    @RequestMapping("/getShopName.do")
    public String getShopName(){
        return ss.getShopName();
    }

    /**
     * 删除商品
     * @param shop
     * @return
     */
    @RequestMapping("/deleteShop.do")
    public String deleteShopF(TShop shop){
        return ss.deleteShopF(shop);
    }
}
