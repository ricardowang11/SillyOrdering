package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -18:52
 * @Description: com.example.demo.bean
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Item {
    private int id;
    private int shopId;
    private String name;
    private String pic;
    private float price;

    public Item(int shopId, String name, String pic, float price) {
        this.shopId = shopId;
        this.name = name;
        this.pic = pic;
        this.price = price;
    }
}
