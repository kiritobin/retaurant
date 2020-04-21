package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TBehavior;
import com.idaobin.restaurant.model.VBehavior;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface BehaviorDao {

    /**
     * 添加出库、退货、销售记录
     * @param behavior
     * @return
     */
    @Insert("insert into t_behavior (shopid,num,price,userid,supplierid,customid,wareid,handledate,type) values (#{shopid},#{num},#{price},#{userid},#{supplierid},#{customid},#{wareid},#{handledate},#{type})")
    public int addBehavoir(TBehavior behavior);

    /**
     * 获取出库记录
     * @return
     */
    @Select("select id,shopname,num,price,username,warename,handledate from v_behavior where type=0 and warestatus=0")
    public List<VBehavior> getOutWare();

    /**
     * 获取退货记录
     * @return
     */
    @Select("select id,shopname,num,price,username,suppliername,handledate from v_behavior where type=1 and supplierstatus=0")
    public List<VBehavior> getReturnGoods();

    /**
     * 获取销售记录
     * @return
     */
    @Select("select id,shopname,num,price,username,customname,handledate from v_behavior where type=2  and customstatus=0")
    public List<VBehavior> getSale();

    /**
     * 添加出库、退货、销售记录并减去库存数量
     * @param params
     * @return
     */
    @Select({ "call p_stock(" +
            "#{inshopid,mode=IN,jdbcType=INTEGER},"
            + "#{innum,mode=IN,jdbcType=BIGINT},"
            + "#{inprice,mode=IN,jdbcType=DOUBLE},"
            + "#{inuserid,mode=IN,jdbcType=VARCHAR},"
            + "#{insupplierid,mode=IN,jdbcType=INTEGER},"
            + "#{incustomid,mode=IN,jdbcType=INTEGER},"
            + "#{inwareid,mode=IN,jdbcType=INTEGER},"
            + "#{inhandledate,mode=IN,jdbcType=VARCHAR},"
            + "#{intype,mode=IN,jdbcType=INTEGER},"
            + "#{instockid,mode=IN,jdbcType=INTEGER},"
            + "#{result,mode=OUT,jdbcType=INTEGER})"})
    @Results({
            @Result(column="result", property="result", jdbcType= JdbcType.INTEGER)
    })
    @Options(statementType= StatementType.CALLABLE)
    public void addBehaviors(Map<String,Object> params);

    /**
     * 今日-统计出库、退货、销售的总量和成交金额
     * @param behavior
     * @return
     */
    @Select("select SUM(num) as num,SUM(price) as price FROM t_behavior where type=#{type} and to_days(handledate) = to_days(now()) and status=0")
    public List<TBehavior> getBehaviorStatToday(TBehavior behavior);

    /**
     * 本月-统计出库、退货、销售的总量和成交金额
     * @param behavior
     * @return
     */
    @Select("select SUM(num) as num,SUM(price) as price FROM t_behavior where type=#{type} and DATE_FORMAT( handledate, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) and status=0")
    public List<TBehavior> getBehaviorStatMonth(TBehavior behavior);

    /**
     * 本年-统计出库、退货、销售的总量和成交金额
     * @param behavior
     * @return
     */
    @Select("select SUM(num) as num,SUM(price) as price FROM t_behavior where type=#{type} and YEAR(handledate)=YEAR(NOW()) and status=0")
    public List<TBehavior> getBehaviorStatYear(TBehavior behavior);
}
