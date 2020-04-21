package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.WareDao;
import com.idaobin.restaurant.model.Data;
import com.idaobin.restaurant.model.TWare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WareService {

    @Autowired
    private WareDao dao;

    /**
     * 添加仓库
     * @param ware
     * @return
     */
    public String addWare(TWare ware){
        int row=dao.addWare(ware);
        Data data=new Data();
        if(row>0){
            data.setMsg("添加仓库成功");
        }
        else {
            data.setMsg("添加仓库失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有仓库
     * @return
     */
    public String getWare(){
        List<TWare> list=dao.getWare();
        Data data=new Data();
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有仓库名称
     * @return
     */
    public String getWareName(){
        List<String> list=dao.getWareName();
        Data data=new Data();
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 删除仓库
     * @param ware
     * @return
     */
    public String deleteWareF(TWare ware){
        int row=dao.deleteWareF(ware);
        Data data=new Data();
        if(row>0){
            data.setMsg("删除仓库成功");
        }
        else {
            data.setMsg("删除仓库失败");
        }
        return JacksonUtil.beanToJson(data);
    }
}
