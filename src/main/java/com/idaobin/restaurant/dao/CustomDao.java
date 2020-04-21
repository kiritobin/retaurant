package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TCustom;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface CustomDao {

    /**
     * 添加客户
     * @return
     */
    @Insert("insert into t_custom (customname,customadress,customtel) values (#{customname},#{customadress},#{customtel})")
    public int addCustom(TCustom custom);

    /**
     * 获取所有客户
     * @return
     */
    @Select("select * from t_custom where status=0")
    public List<TCustom> getCustom();

    /**
     * 获取客户编号-名称
     * @return
     */
    @Select("select concat(customid,'-',customname) as customname from t_custom where status=0")
    public List<String> getCustomName();

    /**
     * 假删除客户
     * @return
     */
    @Update("update t_custom set status=1 where customid=#{customid} and status=0")
    public int deleteCustomF(TCustom custom);
}
