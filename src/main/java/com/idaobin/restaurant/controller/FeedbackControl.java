package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.model.TFeedback;
import com.idaobin.restaurant.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackControl {

    @Autowired
    private FeedbackService fs;

    /**
     * 添加反馈接口
     * @param feedback
     * @return
     */
    @RequestMapping("/addFeedback.do")
    public String addFeedback(TFeedback feedback){
        return fs.addFeedback(feedback);
    }

    /**
     * 获取反馈信息接口
     * @return
     */
    @RequestMapping("/getFeedback.do")
    public String getFeedback(){
        return fs.getFeedback();
    }
}
