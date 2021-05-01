package com.example.demo.bean;

import com.example.demo.utils.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -18:55
 * @Description: com.example.demo.bean
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    private int id;
    private int userid;
    private int shopId;
    private int status;
    private float totalPrice;
    private HashMap<Integer,Integer> idAndCount;
    private String date;
    private String address;
}
