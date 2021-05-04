package com.example.demo;

import com.alibaba.druid.pool.DruidDataSource;
import com.example.demo.bean.Item;
import com.example.demo.bean.Shop;
import com.example.demo.dao.InsertDao;
import com.example.demo.dao.ShopDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.Random;
import java.util.UUID;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private ShopDao shopDao;
    @Autowired
    private DruidDataSource dataSource;
    @Autowired
    private InsertDao insertDao;

    @Test
    void contextLoads() {
        char a = '2';
        char b = '0';
        int c = a - b;
        System.out.println(a - b);
    }

    @Test
    void test1() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(shopDao);
        Shop shop = shopDao.getShop(1);
        for (Item item : shop.getItems()) {
            System.out.println(item);
        }
    }

    @Test
    void insertShops() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int ownerId = random.nextInt(5) + 1;
            int price = random.nextInt(100) + 1;
            String name = UUID.randomUUID().toString().substring(0, 5) + i;
            String phone = UUID.randomUUID().toString().substring(0, 8) + i;
            int status = random.nextInt(2);
            int score = random.nextInt(10) + 1;
            int kindId = random.nextInt(5) + 1;
            int shopId = random.nextInt(4) + 1;
            insertDao.insertShops(new Shop(ownerId, name, phone, "/img/立新超市.jpg", status, 0, "0"));
        }
    }

    @Test
    void insertOrders() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            shopDao.createItemsTable(i);
        }
    }
    @Test
    void insertItems(){
        Random random =new Random();
        for (int i = 0; i < 10; i++) {
            String name = UUID.randomUUID().toString().substring(0, 5) + i;
            int score = random.nextInt(10) + 1;
            float price = random.nextFloat() + 1;
            int shopId = random.nextInt(4) + 1;
            insertDao.insertItems(1,new Item(1,name,"/img/立新食品",price));
        }
    }
}
