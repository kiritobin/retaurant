package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.model.TCustom;
import com.idaobin.restaurant.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomControl {

    @Autowired
    private CustomService cs;

    /**
     * 添加客户接口
     * @param custom
     * @return
     */
    @RequestMapping("/addCustom.do")
    public String addCustom(TCustom custom){
        return cs.addCustom(custom);
    }

    /**
     * 获取所有客户接口
     * @return
     */
    @RequestMapping("/getCustom.do")
    public String getCustom(){
        return cs.getCustom();
    }

    /**
     * 获取所有客户名称接口
     * @return
     */
    @RequestMapping("/getCustomName.do")
    public String getCustomName(){
        return cs.getCustomName();
    }

    /**
     * 删除客户接口
     * @param custom
     * @return
     */
    @RequestMapping("/deleteCustom.do")
    public String deleteCustomF(TCustom custom){
        return cs.deleteCustomF(custom);
    }
}
