package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TWare;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WareDao {

    /**
     * 添加仓库
     * @param ware
     * @return
     */
    @Insert("insert into t_ware (warename,wareadress,remark) values (#{warename},#{wareadress},#{remark})")
    public int addWare(TWare ware);

    /**
     * 获取所有仓库
     * @return
     */
    @Select("select * from t_ware where status=0")
    public List<TWare> getWare();

    /**
     * 获取所有仓库名称
     * @return
     */
    @Select("select concat(wareid,'-',warename) as warename from t_ware where status=0")
    public List<String> getWareName();

    /**
     * 假删除仓库
     * @param ware
     * @return
     */
    @Update("update t_ware set status=1 where wareid=#{wareid} and status=0")
    public int deleteWareF(TWare ware);
}
