package com.example.demo.dao;

import com.example.demo.bean.Order;
import com.example.demo.bean.OrderWrapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: wangqin
 * @Date: 2021/5/1 0001 - 05 -01 -15:30
 * @Description: com.example.demo.dao
 * @version: 1.0
 */
public interface OrderDao {
    int updateOrder(@Param("orderId") int orderId,@Param("newOrder") Order newOrder);

    int addOrder(@Param("idAndCount") String idAndCount,@Param("order") Order order);


    int addCurOrderToShop(@Param("orderId") int orderId,@Param("shopId")int shopId);
    int addCurOrderToUser(@Param("orderId") int orderId,@Param("userId")int userId);

    int addHisOrderToUser(@Param("orderId") int orderId,@Param("userId")int userId);

    int deleteCurOrderFromUser(@Param("orderId") int orderId,@Param("userId")int userId);
    int deleteCurOrderFromBusiness(@Param("orderId") int orderId,@Param("shopId")int shopId);

    List<OrderWrapper> getUserCurOrders(@Param("userId")int userId);
    List<OrderWrapper> getShopCurOrders(@Param("shopId")int shopId);
    List<OrderWrapper> getUserHisOrders(@Param("userId")int userId);
}
