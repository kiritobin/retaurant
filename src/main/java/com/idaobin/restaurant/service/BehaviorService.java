package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.GetSystemTime;
import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.BehaviorDao;
import com.idaobin.restaurant.dao.ShopDao;
import com.idaobin.restaurant.dao.StockDao;
import com.idaobin.restaurant.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BehaviorService {

    @Autowired
    private BehaviorDao dao;
    @Autowired
    private StockDao sdao;
    @Autowired
    private ShopDao shopdao;

    /**
     * 获取所有出库记录
     * @return
     */
    public String getOutWare(){
        List<VBehavior> list=dao.getOutWare();
        Data data=new Data();
        data.setMsg("获取所有出库记录");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有退货记录
     * @return
     */
    public String getReturnGoods(){
        List<VBehavior> list=dao.getReturnGoods();
        Data data=new Data();
        data.setMsg("获取所有退货记录");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取所有销售记录
     * @return
     */
    public String getSale(){
        List<VBehavior> list=dao.getSale();
        Data data=new Data();
        data.setMsg("获取所有销售记录");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 添加出库、退货、销售记录并减去库存数量
     * @param behavior
     * @param stock
     * @return
     */
    public String addBehaviors(TBehavior behavior,TStock stock){
        int stocknum=sdao.getStockNum(stock);
        Data data=new Data();
        if(stocknum-behavior.getNum()>=0){ //库存充足
            behavior.setHandledate(GetSystemTime.getNow());
            TShop shop=new TShop();
            shop.setShopid(behavior.getShopid());
            double price=shopdao.getShopPrice(shop);
            behavior.setPrice(behavior.getNum()*price);

            Map<String,Object> params=new HashMap<>();
            params.put("inshopid",behavior.getShopid());
            params.put("innum",behavior.getNum());
            params.put("inprice",behavior.getPrice());
            params.put("inuserid",behavior.getUserid());
            params.put("insupplierid",behavior.getSupplierid());
            params.put("incustomid",behavior.getCustomid());
            params.put("inwareid",behavior.getWareid());
            params.put("inhandledate",behavior.getHandledate());
            params.put("intype",behavior.getType());
            params.put("instockid",stock.getStockid());
            params.put("result",0);
            dao.addBehaviors(params);
            int row=Integer.parseInt(params.get("result").toString());
            data.setSize(row);
            if(row>1){
                data.setMsg("添加成功");
            }
            else {
                data.setMsg("添加失败");
            }
        }
        else {
            data.setSize(stocknum);
            data.setMsg("库存不足");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 今日-统计出库、退货、销售的总量和成交金额
     * @param behavior
     * @return
     */
    public String getBehaviorStatToday(TBehavior behavior){
        List<TBehavior> list=dao.getBehaviorStatToday(behavior);
        Data data=new Data();
        data.setMsg("今日统计成交量和金额");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 本月-统计出库、退货、销售的总量和成交金额
     * @param behavior
     * @return
     */
    public String getBehaviorStatMonth(TBehavior behavior){
        List<TBehavior> list=dao.getBehaviorStatMonth(behavior);
        Data data=new Data();
        data.setMsg("本月统计成交量和金额");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 本年-统计出库、退货、销售的总量和成交金额
     * @param behavior
     * @return
     */
    public String getBehaviorStatYear(TBehavior behavior){
        List<TBehavior> list=dao.getBehaviorStatYear(behavior);
        Data data=new Data();
        data.setMsg("本月统计成交量和金额");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }
}
