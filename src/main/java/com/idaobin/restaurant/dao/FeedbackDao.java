package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TFeedback;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface FeedbackDao {

    /**
     * 添加反馈
     * @param feedback
     * @return
     */
    @Insert("insert into t_feedback (question,email,tel) values (#{question},#{email},#{tel})")
    public int addFeedback(TFeedback feedback);

    /**
     * 获取所有反馈
     * @return
     */
    @Select("select * from t_feedback")
    public List<TFeedback> getFeedback();
}
