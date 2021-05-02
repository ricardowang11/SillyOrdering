package com.example.demo.dao;

import com.example.demo.bean.Item;
import com.example.demo.bean.Shop;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wangqin
 * @Date: 2021/5/1 0001 - 05 -01 -15:28
 * @Description: com.example.demo.dao
 * @version: 1.0
 */

public interface ShopDao {
    int addShop(Shop shop);

    void createItemsTable(int shopId);

    int getBalance(int shopId);

    int updateBalance(@Param("shopId") int shopId, @Param("newBalance") int newBalance);
    Shop getShop(int shopId);

    List<Shop> getShops(int page);

//    List<Shop> getShops(String name);

    int addItem(@Param("shopId") int shopId,@Param("item") Item item);

    int updateItem(@Param("shopId") int shopId,@Param("itemId") int itemId,@Param("newItem") Item newItem);

    int deleteItem(@Param("shopId") int shopId,@Param("itemId") int itemId);

}
