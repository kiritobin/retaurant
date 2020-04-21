package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.FeedbackDao;
import com.idaobin.restaurant.model.Data;
import com.idaobin.restaurant.model.TFeedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackDao dao;

    /**
     * 添加反馈
     * @param feedback
     * @return
     */
    public String addFeedback(TFeedback feedback){
        int row=dao.addFeedback(feedback);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("反馈成功");
        }
        else {
            data.setMsg("反馈失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 获取反馈
     * @return
     */
    public String getFeedback(){
        List<TFeedback> list=dao.getFeedback();
        Data data=new Data();
        data.setMsg("查询所有反馈");
        data.setSize(list.size());
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }
}
