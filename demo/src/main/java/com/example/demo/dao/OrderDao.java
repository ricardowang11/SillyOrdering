package com.example.demo.dao;

import com.example.demo.bean.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: wangqin
 * @Date: 2021/5/1 0001 - 05 -01 -15:30
 * @Description: com.example.demo.dao
 * @version: 1.0
 */
public interface OrderDao {
    int updateOrder(@Param("orderId") int orderId,@Param("newOrder") Order newOrder);

    int addOrder(Order order);

}
