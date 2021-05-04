package com.example.demo.dao;

import com.example.demo.bean.Address;
import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: wangqin
 * @Date: 2021/5/1 0001 - 05 -01 -15:29
 * @Description: com.example.demo.dao
 * @version: 1.0
 */
public interface UserDao {
    int addNormalUser(User user);
//    User getNormalUserWithName(String username);
    User getNormalUserWithId(int id);
    int updateNormalUser(User user);
    int addAddr(@Param("address") Address address,@Param("userId") int userId);
    void createAddressTable(int userId);
    void createHistoryOrders(@Param("userId") int userId);
    void createUserCurOrders(@Param("userId")int userId);
    void deleteAddressTable(int userId);
    void deleteHistoryOrders(int userId);
    void deleteUserCurOrders(int userId);

    int addBusinessUser(User user);
//    User getBusinessUserWithName(String username);
    User getBusinessUserWithId(int id);
    int updateBusinessUser(User user);
    void createShopCurOrders(int userId);
    void deleteShopCurOrders(int userId);
}
