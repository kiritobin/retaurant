package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.GetSystemTime;
import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.ShopDao;
import com.idaobin.restaurant.dao.StockDao;
import com.idaobin.restaurant.model.Data;
import com.idaobin.restaurant.model.TShop;
import com.idaobin.restaurant.model.TStock;
import com.idaobin.restaurant.model.VStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    @Autowired
    private StockDao dao;
    @Autowired
    private ShopDao sdao;

    /**
     * 添加入库信息
     * @param stock
     * @return
     */
    public String addStock(TStock stock){

        TShop shop=new TShop();
        shop.setShopid(stock.getShopid());
        double price=sdao.getShopPrice(shop);
        stock.setPrice(stock.getNum()*price);
        stock.setStocktime(GetSystemTime.getNow());

        int row=dao.addStock(stock);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("入库成功");
        }
        else {
            data.setMsg("入库失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取入库信息
     * @return
     */
    public String getStock(){
        List<VStock> list=dao.getStock();
        Data data=new Data();
        data.setMsg("获取入库报表");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 今日-入库总量和成交金额
     * @return
     */
    public String getStockStatToday(){
        List<TStock> list=dao.getStockStatToday();
        Data data=new Data();
        data.setMsg("今日统计成交量和金额");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 本月-入库总量和成交金额
     * @return
     */
    public String getStockStatMonth(){
        List<TStock> list=dao.getStockStatMonth();
        Data data=new Data();
        data.setMsg("本月统计成交量和金额");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 本年-入库总量和成交金额
     * @return
     */
    public String getStockStatYear(){
        List<TStock> list=dao.getStockStatYear();
        Data data=new Data();
        data.setMsg("本年统计成交量和金额");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 假删除入库信息
     * @param stock
     * @return
     */
    public String deleteStockF(TStock stock){
        int row=dao.deleteStockF(stock);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("删除库存成功");
        }
        else {
            data.setMsg("删除库存失败");
        }
        return JacksonUtil.beanToJson(data);
    }
}
