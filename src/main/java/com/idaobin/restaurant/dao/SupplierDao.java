package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TSupplier;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface SupplierDao {

    /**
     * 添加供应商
     * @param supplier
     * @return
     */
    @Insert("insert into t_supplier (suppliername,address,contact) values (#{suppliername},#{address},#{contact})")
    public int addSupplier(TSupplier supplier);

    /**
     * 获取所有供应商
     * @return
     */
    @Select("select * from t_supplier where status=0")
    public List<TSupplier> getSupplier();

    /**
     * 获取供应商编号-名称
     * @return
     */
    @Select("select concat(supplierid,'-',suppliername) as suppliername from t_supplier where status=0")
    public List<String> getSupplierName();

    /**
     * 假删除供应商
     * @param supplier
     * @return
     */
    @Update("update t_supplier set status=1 where supplierid=#{supplierid} and status=0")
    public int deleteSupplierF(TSupplier supplier);
}
