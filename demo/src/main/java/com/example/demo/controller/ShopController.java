package com.example.demo.controller;

import com.example.demo.bean.Item;
import com.example.demo.bean.Shop;
import com.example.demo.bean.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -19:15
 * @Description: com.example.demo.controller
 * @version: 1.0
 */
@RestController
public class ShopController {
    @PutMapping("/order/{orderid}/{option}")
    public int updateOrder(HttpSession session, @PathVariable("orderid") int orderid, @PathVariable("option") int status) {
        return 0;
    }

    @PostMapping("/order")
    public int newOrder(HttpSession session) {
        return 0;
    }

    @PutMapping("/cart")
    public int addToCart(HttpSession session, Item item) {
        return 0;
    }

    @GetMapping("/balance/{shopId}")
    public float getBalance(@PathVariable("shopId") int shopId) {
        return 0;
    }

    @GetMapping("/business")
    public User getBusiness(HttpSession session) {
        return null;
    }

    @GetMapping("/shop/{shopId}")
    public Shop getShop(@PathVariable("shopId") int shopId) {
        return null;
    }

    @GetMapping("/shop/{name}")
    public List<Shop> getShop(@PathVariable("name") String name) {
        return null;
    }

    @GetMapping("/shops")
    public List<Shop>getShops(){
        return null;
    }
}
