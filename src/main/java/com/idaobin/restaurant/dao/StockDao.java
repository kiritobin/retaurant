package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TStock;
import com.idaobin.restaurant.model.VStock;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StockDao {

    /**
     * 添加入库信息
     * @param stock
     * @return
     */
    @Insert("insert into t_stock (shopid,num,price,stocktime,userid,wareid) values (#{shopid},#{num},#{price},#{stocktime},#{userid},#{wareid})")
    public int addStock(TStock stock);

    /**
     * 获取入库信息
     * @return
     */
    @Select("select * from v_stock where status=0")
    public List<VStock> getStock();

    /**
     * 获取入库库存
     * @param stock
     * @return
     */
    @Select("select num from t_Stock where stockid=#{stockid}")
    public int getStockNum(TStock stock);

    /**
     * 今日-入库总量和成交金额
     * @return
     */
    @Select("SELECT SUM(num) as num,SUM(price) as price FROM t_stock where to_days(stocktime) = to_days(now()) and status=0")
    public List<TStock> getStockStatToday();

    /**
     * 本月-入库总量和成交金额
     * @return
     */
    @Select("SELECT SUM(num) as num,SUM(price) as price FROM t_stock where DATE_FORMAT( stocktime, '%Y%m' ) = DATE_FORMAT( CURDATE( ) , '%Y%m' ) and status=0")
    public List<TStock> getStockStatMonth();

    /**
     * 本年-入库总量和成交金额
     * @return
     */
    @Select("SELECT SUM(num) as num,SUM(price) as price FROM t_stock where YEAR(stocktime)=YEAR(NOW()) and status=0")
    public List<TStock> getStockStatYear();

    /**
     * 假删除入库信息
     * @param stock
     * @return
     */
    @Update("update t_stock set status=1 where stockid=#{stockid} and status=0")
    public int deleteStockF(TStock stock);
}
