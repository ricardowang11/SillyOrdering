package com.example.demo.dao;

import com.example.demo.bean.Item;
import com.example.demo.bean.Shop;
import org.apache.ibatis.annotations.Mapper;

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

    int addItem(Item item);

    int getBalance(int shopId);

    Shop getShop(int id);

    List<Shop> getShops(int begin);

    List<Shop> getShops(String name);

    int addItem(int shopId, Item item);

    int updateItem(int shopId, int itemId, Item newItem);

    int deleteItem(int shopId, int itemId);

}
