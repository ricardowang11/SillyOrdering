package com.example.demo.controller;

import com.example.demo.bean.Item;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -19:34
 * @Description: com.example.demo.controller
 * @version: 1.0
 */
@RestController
public class ItemController {
    @GetMapping("/item/{itemId}/{shopId}")
    public Item getItem(@PathVariable("itemId") int itemId, @PathVariable("shopId") int shopId) {
        return null;
    }

    @PutMapping("/item/{itemId}")
    public int updateItem(@PathVariable("itemId") int id, HttpSession session) {
        return 0;
    }
    @DeleteMapping("/item/{itemId}")
    public int deleteItem(@PathVariable("itemId") int id, HttpSession session) {
        return 0;
    }
    @PostMapping("/item")
    public int addItem(HttpSession session) {
        return 0;
    }
}
