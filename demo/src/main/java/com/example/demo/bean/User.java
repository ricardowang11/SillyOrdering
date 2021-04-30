package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -19:03
 * @Description: com.example.demo.bean
 * @version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private int id;
    private int shopId;
    private String name;
    private String phone;
    private String password;
    private List<Address> addresses;
    private List<Integer> historyOrdersId;
    private List<Integer> curOrdersId;
    private List<Item> items;

}
