package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.CustomDao;
import com.idaobin.restaurant.model.Data;
import com.idaobin.restaurant.model.TCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomService {

    @Autowired
    private CustomDao dao;

    /**
     * 添加客户
     * @param custom
     * @return
     */
    public String addCustom(TCustom custom){
        int row=dao.addCustom(custom);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("添加客户成功");
        }
        else {
            data.setMsg("添加客户失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有客户
     * @return
     */
    public String getCustom(){
        List<TCustom> list=dao.getCustom();
        Data data=new Data();
        data.setMsg("获取所有客户");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有客户编号-名称
     * @return
     */
    public String getCustomName(){
        List<String> list=dao.getCustomName();
        Data data=new Data();
        data.setMsg("获取所有客户名称");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 删除客户
     * @param custom
     * @return
     */
    public String deleteCustomF(TCustom custom){
        int row=dao.deleteCustomF(custom);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("删除客户成功");
        }
        else {
            data.setMsg("删除客户失败");
        }
        return JacksonUtil.beanToJson(data);
    }
}
