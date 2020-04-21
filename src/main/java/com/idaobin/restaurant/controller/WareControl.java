package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.model.TWare;
import com.idaobin.restaurant.service.WareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WareControl {

    @Autowired
    private WareService ws;

    /**
     * 添加仓库接口
     * @param ware
     * @return
     */
    @RequestMapping("/addWare.do")
    public String addWare(TWare ware){
        return ws.addWare(ware);
    }

    /**
     * 获取所有仓库接口
     * @return
     */
    @RequestMapping("/getWare.do")
    public String getWare(){
        return ws.getWare();
    }

    /**
     * 获取所有仓库名称接口
     * @return
     */
    @RequestMapping("/getWareName.do")
    public String getWareName(){
        return ws.getWareName();
    }

    /**
     * 删除仓库接口
     * @param ware
     * @return
     */
    @RequestMapping("/deleteWare.do")
    public String deleteWareF(TWare ware){
        return ws.deleteWareF(ware);
    }
}
