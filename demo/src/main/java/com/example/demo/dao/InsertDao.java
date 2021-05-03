package com.example.demo.dao;

import com.example.demo.bean.Item;
import com.example.demo.bean.Shop;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: jq
 * @Date: 2021/5/3 - 20:18
 */
public interface InsertDao {
    void insertShops(Shop shop);
    void insertItems(@Param("shopId") int shopId,@Param("item") Item item);
}
