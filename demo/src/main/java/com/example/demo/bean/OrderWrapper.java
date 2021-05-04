package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: jq
 * @Date: 2021/5/4 - 18:46
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderWrapper {
    private int id;
    private int userid;
    private int shopId;
    private int status;
    private float totalPrice;
    private String idAndCount;
    private String date;
    private String address;
}
