package com.idaobin.restaurant.service;

import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.dao.UserDao;
import com.idaobin.restaurant.model.Data;
import com.idaobin.restaurant.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao dao;

    /**
     * 判断账号密码是否正确
     * @param user
     * @return
     */
    public boolean isLogin(TUser user){
        int count=dao.login(user);
        if(count>0){
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 修改密码
     * @param oldpwd
     * @param newpwd
     * @param user
     * @return
     */
    public String updatePWd(String oldpwd,String newpwd,TUser user){
        user.setUserpwd(oldpwd);
        int count=dao.getPwd(user);
        Data data=new Data();
        if(count>0){
            user.setUserpwd(newpwd);
            int row=dao.updatePwd(user);
            data.setSize(row);
            if(row>0){
                data.setMsg("修改密码成功");
            }
            else {
                data.setMsg("修改密码失败");
            }
        }
        else {
            data.setSize(count);
            data.setMsg("原密码错误");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 通过编号获取用户信息
     * @param user
     * @return
     */
    public String getUserById(TUser user){
        Data data=new Data();
        List<TUser> list=dao.getUserById(user);
        data.setSize(list.size());
        data.setMsg("获取用户信息");
        data.setData(list);
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 修改用户名和邮箱
     * @param user
     * @return
     */
    public String updateUserName(TUser user){
        int row=dao.updateUserName(user);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("修改成功");
        }
        else{
            data.setMsg("修改失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public String addUser(TUser user){
        int row=dao.addUser(user);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("添加用户成功");
        }
        else{
            data.setMsg("添加用户失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 忘记密码的修改
     * @param user
     * @return
     */
    public String forgetPwd(TUser user){
        int row=dao.forgetPwd(user);
        Data data=new Data();
        data.setSize(row);
        if(row>0){
            data.setMsg("修改密码成功");
        }
        else{
            data.setMsg("修改密码失败，请再次确认账号和邮箱");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 清空表
     * @return
     */
    public int emptyData(){
        Map<String,Object> params=new HashMap<>();
        dao.emptyData(params);
        int row=Integer.parseInt(params.get("result").toString());
        return row;
    }

}
