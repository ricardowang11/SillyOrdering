package com.example.demo.service;

import com.example.demo.bean.Item;
import com.example.demo.bean.Shop;
import com.example.demo.bean.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -19:51
 * @Description: com.example.demo.service
 * @version: 1.0
 */
@Service
public class ShopService {
   public int refund(int orderId) {
       return 0;
   }

    public int confirm(int orderId) {
       return 0;
    }

    public int createOrder(HttpSession session) {
       return 0;
    }

    public int addToCart(HttpSession session) {
       return 0;
    }

    public float getBalance(HttpSession session) {
       return 0;
    }

    public User getBusiness(int id) {
       return null;
    }

    public Shop getShop(int id) {
       return null;
    }

    public List<Shop> getShops(String name) {
       return null;
    }

    public List<Shop> getShops(int page) {
       return null;
    }

    public int addItem(HttpSession session, Item item) {
       return 0;
    }

    public int updateItem(HttpSession session, int itemId, Item newItem) {
       return 0;
    }

    public int deleteItem(HttpSession session, int itemId) {
       return 0;
    }

}
