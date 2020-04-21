package com.idaobin.restaurant.dao;

import com.idaobin.restaurant.model.TShop;
import com.idaobin.restaurant.model.VShop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ShopDao {

    /**
     * 添加商品
     * @param shop
     * @return
     */
    @Insert("insert into t_shop (shopname,price,supplierid,meter,manufacture,guarantee,cgid) values (#{shopname},#{price},#{supplierid},#{meter},#{manufacture},#{guarantee},#{cgid})")
    public int addShop(TShop shop);

    /**
     * 获取所有商品信息
     * @return
     */
    @Select("select * from v_shop where status=0")
    public List<VShop> getShop();

    /**
     * 获取商品编号-名称
     * @return
     */
    @Select("select concat(shopid,'-',shopname) as shopname from t_shop where status=0")
    public List<String> getShopName();

    /**
     * 获取商品价格
     * @param shop
     * @return
     */
    @Select("select price from t_shop where shopid=#{shopid} and status=0")
    public double getShopPrice(TShop shop);

    /**
     * 假删除商品
     * @param shop
     * @return
     */
    @Update("update t_shop set status=1 where shopid=#{shopid} and status=0")
    public int deleteShopF(TShop shop);
}
