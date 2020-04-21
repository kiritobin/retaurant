package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.model.TBehavior;
import com.idaobin.restaurant.model.TStock;
import com.idaobin.restaurant.service.BehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class BehaviorControl {

    @Autowired
    private BehaviorService bs;

    /**
     * 添加出库接口
     * @param behavior
     * @param request
     * @return
     */
    @RequestMapping("/addOutWare.do")
    public String addOutWare(TBehavior behavior,TStock stock, HttpServletRequest request){
        HttpSession session=request.getSession();
        behavior.setUserid(session.getAttribute("id").toString());
        behavior.setType(0);
        return bs.addBehaviors(behavior,stock);
    }

    /**
     * 添加退货接口
     * @param behavior
     * @param request
     * @return
     */
    @RequestMapping("/addReturn.do")
    public String addReturn(TBehavior behavior,TStock stock, HttpServletRequest request){
        HttpSession session=request.getSession();
        behavior.setUserid(session.getAttribute("id").toString());
        behavior.setType(1);
        return bs.addBehaviors(behavior,stock);
    }

    /**
     * 添加退货接口
     * @param behavior
     * @param request
     * @return
     */
    @RequestMapping("/addSale.do")
    public String addSale(TBehavior behavior, TStock stock,HttpServletRequest request){
        HttpSession session=request.getSession();
        behavior.setUserid(session.getAttribute("id").toString());
        behavior.setType(2);
        return bs.addBehaviors(behavior,stock);
    }

    /**
     * 获取出库记录接口
     * @return
     */
    @RequestMapping("/getOutWare.do")
    public String getOutWare(){
        return bs.getOutWare();
    }

    /**
     * 获取退货记录接口
     * @return
     */
    @RequestMapping("/getReturnGoods.do")
    public String getReturnGoods(){
        return bs.getReturnGoods();
    }

    /**
     * 获取销售记录接口
     * @return
     */
    @RequestMapping("/getSale.do")
    public String getSale(){
        return bs.getSale();
    }

    /**
     * 今日-出库的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/outGetBehaviorStatToday.do")
    public String outGetBehaviorStatToday(TBehavior behavior){
        behavior.setType(0);
        return bs.getBehaviorStatToday(behavior);
    }
    /**
     * 今日-退货的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/returnGetBehaviorStatToday.do")
    public String returnGetBehaviorStatToday(TBehavior behavior){
        behavior.setType(1);
        return bs.getBehaviorStatToday(behavior);
    }
    /**
     * 今日-销售的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/saleGetBehaviorStatToday.do")
    public String saleGetBehaviorStatToday(TBehavior behavior){
        behavior.setType(2);
        return bs.getBehaviorStatToday(behavior);
    }

    /**
     * 本月-出库的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/outGetBehaviorStatMonth.do")
    public String outGetBehaviorStatMonth(TBehavior behavior){
        behavior.setType(0);
        return bs.getBehaviorStatMonth(behavior);
    }
    /**
     * 本月-退货的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/returnGetBehaviorStatMonth.do")
    public String returnGetBehaviorStatMonth(TBehavior behavior){
        behavior.setType(1);
        return bs.getBehaviorStatMonth(behavior);
    }
    /**
     * 本月-销售的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/saleGetBehaviorStatMonth.do")
    public String saleGetBehaviorStatMonth(TBehavior behavior){
        behavior.setType(2);
        return bs.getBehaviorStatMonth(behavior);
    }

    /**
     * 本年-出库的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/outGetBehaviorStatYear.do")
    public String outGetBehaviorStatYear(TBehavior behavior){
        behavior.setType(0);
        return bs.getBehaviorStatYear(behavior);
    }
    /**
     * 本年-退货的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/returnGetBehaviorStatYear.do")
    public String returnGetBehaviorStatYear(TBehavior behavior){
        behavior.setType(1);
        return bs.getBehaviorStatYear(behavior);
    }
    /**
     * 本年-销售的总量和成交金额
     * @param behavior
     * @return
     */
    @RequestMapping("/saleGetBehaviorStatYear.do")
    public String saleGetBehaviorStatYear(TBehavior behavior){
        behavior.setType(2);
        return bs.getBehaviorStatYear(behavior);
    }
}
