package com.idaobin.restaurant.model;

import java.io.Serializable;

/**
 * (TFeedback)实体类
 *
 * @author daobin
 * @since 2020-04-01 23:12:16
 */
public class TFeedback implements Serializable {
    private static final long serialVersionUID = -23123958282361137L;
    /**
    * 反馈编号
    */
    private Integer id;
    /**
    * 反馈问题
    */
    private String question;
    /**
    * 联系邮箱
    */
    private String email;
    /**
    * 联系电话
    */
    private String tel;

    public TFeedback(){
        super();
    }
    
    public TFeedback(Integer id, String question, String email, String tel){
        this.id=id;
        this.question=question;
        this.email=email;
        this.tel=tel;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}