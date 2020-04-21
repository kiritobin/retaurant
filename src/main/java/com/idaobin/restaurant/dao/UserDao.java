package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TUser;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserDao {

    /**
     * 登录 - 判断账号和密码是否正确
     * @param user
     * @return
     */
    @Select("select count(userid) from t_user where userid=#{userid} and userpwd=#{userpwd} and status=0")
    public int login(TUser user);

    /**
     * 通过编号获取用户信息
     * @param user
     * @return
     */
    @Select("select userid,username,email,status from t_user where userid=#{userid} and status=0")
    public List<TUser> getUserById(TUser user);

    /**
     * 获取所有用户信息
     * @return
     */
    @Select("select userid,username,status from t_user where status=0")
    public List<TUser> getUser();

    /**
     * 修改密码
     * @param user
     * @return
     */
    @Update("update t_user set userpwd=#{userpwd} where userid=#{userid} and status=0")
    public int updatePwd(TUser user);

    /**
     * 查看原密码是否存在
     * @param user
     * @return
     */
    @Select("select count(userid) from t_user where userid=#{userid} and userpwd=#{userpwd} and status=0")
    public int getPwd(TUser user);

    /**
     * 修改用户名和邮箱
     * @param user
     * @return
     */
    @Update("update t_user set username=#{username},email=#{email} where userid=#{userid} and status=0")
    public int updateUserName(TUser user);

    /**
     *
     * 添加用户
     * @param user
     * @return
     */
    @Insert("insert into t_user (userid,username,userpwd,email) values (#{userid},#{username},#{userpwd},#{email})")
    public int addUser(TUser user);

    /**
     * 忘记密码的修改
     * @param user
     * @return
     */
    @Update("update t_user set userpwd=#{userpwd} where userid=#{userid} and email=#{email} and status=0")
    public int forgetPwd(TUser user);

    /**
     * 清空除反馈表之外的所有表数据
     */
    @Select({"call p_emptydata(#{result,mode=OUT,jdbcType=INTEGER})"})
    @Results({
            @Result(column="result", property="result", jdbcType= JdbcType.INTEGER)
    })
    @Options(statementType= StatementType.CALLABLE)
    public void emptyData(Map<String,Object> params);
}
