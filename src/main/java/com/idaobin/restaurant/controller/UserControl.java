package com.idaobin.restaurant.controller;

import com.idaobin.restaurant.basic.JacksonUtil;
import com.idaobin.restaurant.model.TUser;
import com.idaobin.restaurant.model.WeChatData;
import com.idaobin.restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserControl {

    @Autowired
    private UserService us;

    /**
     * 登录接口
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/login.do")
    public String login(TUser user, HttpServletRequest request){
        WeChatData data=new WeChatData();
        if(us.isLogin(user)){
            HttpSession session=request.getSession();
            session.setAttribute("id", user.getUserid());
            String sessionId = request.getSession().getId();
            data.setId(sessionId);
            data.setMsg("登录成功");
        }
        else {
            data.setMsg("登录失败");
        }
        return JacksonUtil.beanToJson(data);
    }

    /**
     * 通过编号获取用户信息
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/getUserById.do")
    public String getUserById(TUser user,HttpServletRequest request){
        HttpSession session=request.getSession();
        user.setUserid(session.getAttribute("id").toString());
        return us.getUserById(user);
    }

    /**
     * 修改密码
     * @param oldpwd
     * @param newpwd
     * @param request
     * @return
     */
    @RequestMapping("/updatePwd.do")
    public String updatePWd(String oldpwd,String newpwd, TUser user,HttpServletRequest request){
        HttpSession session=request.getSession();
        user.setUserid(session.getAttribute("id").toString());
        return us.updatePWd(oldpwd,newpwd,user);
    }

    /**
     * 修改用户名和邮箱
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/updateUserName.do")
    public String updateUserName(TUser user,HttpServletRequest request){
        HttpSession session=request.getSession();
        user.setUserid(session.getAttribute("id").toString());
        return us.updateUserName(user);
    }

    /**
     * 添加用户接口
     * @param user
     * @return
     */
    @RequestMapping("/addUser.do")
    public String addUser(TUser user){
        return us.addUser(user);
    }

    /**
     * 忘记密码修改
     * @param user
     * @return
     */
    @RequestMapping("/forgetPwd.do")
    public String forgetPWd(TUser user){
        return us.forgetPwd(user);
    }

    @RequestMapping("/emptyData.do")
    public int foreignKey(){
        return us.emptyData();
    }
}
