package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Author: wangqin
 * @Date: 2021/4/30 0030 - 04 -30 -19:39
 * @Description: com.example.demo.controller
 * @version: 1.0
 */
@RestController
public class UserController {
    @PostMapping("/signin/{signStatus}")
    public int signin(@PathVariable("signStatus") int signStatusOrdinary) {
        return 0;
    }

    @PostMapping("/signup/{signStatus}")
    public int signup(@PathVariable("signStatus") int signStatusOrdinary) {
        return 0;
    }

    @PutMapping("/user/{userId}")
    public int updateUser(@PathVariable("userId") int userId) {
        return 0;
    }

    @PostMapping("/address")
    public int addAddress() {
        return 0;
    }

    @GetMapping("/addresses")
    public int getAddresses(){
        return 0;
    }
    @GetMapping("/address")
    public int getAddress(){
        return 0;
    }
}
