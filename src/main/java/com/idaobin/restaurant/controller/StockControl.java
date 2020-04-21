package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.model.TStock;
import com.idaobin.restaurant.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@RestController
public class StockControl {

    @Autowired
    private StockService ss;

    /**
     * 添加入库信息
     * @param stock
     * @param request
     * @return
     */
    @RequestMapping("/addStock.do")
    public String addStock(TStock stock, HttpServletRequest request){
        HttpSession session=request.getSession();
        stock.setUserid(session.getAttribute("id").toString());
        return ss.addStock(stock);
    }

    /**
     * 获取入库信息
     * @return
     */
    @RequestMapping("/getStock.do")
    public String getStock(){
        return ss.getStock();
    }

    /**
     * 今日-入库总量和成交金额
     * @return
     */
    @RequestMapping("/getStockStatToday.do")
    public String getStockStatToday(){
        return ss.getStockStatToday();
    }

    /**
     * 本月-入库总量和成交金额
     * @return
     */
    @RequestMapping("/getStockStatMonth.do")
    public String getStockStatMonth(){
        return ss.getStockStatMonth();
    }

    /**
     * 本年-入库总量和成交金额
     * @return
     */
    @RequestMapping("/getStockStatYear.do")
    public String getStockStatYear(){
        return ss.getStockStatYear();
    }

    /**
     * 删除库存信息
     * @param stock
     * @return
     */
    @RequestMapping("/deleteStock.do")
    public String deleteStockF(TStock stock){
        return ss.deleteStockF(stock);
    }
}
