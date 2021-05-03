package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -18:49
 * @Description: com.example.demo.bean
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Shop {
    private int id;
    private int ownerId;
    private String name;
    private String phone;
    private String pic;
    private List<Item> items;
    private int status;
    private List<Order> curOrders;
    private float curBalance;
    private String creditCard;

    public Shop(int ownerId, String name, String phone, String pic, int status, float curBalance, String creditCard) {
        this.ownerId = ownerId;
        this.name = name;
        this.phone = phone;
        this.pic = pic;
        this.status = status;
        this.curBalance = curBalance;
        this.creditCard = creditCard;
    }
}
