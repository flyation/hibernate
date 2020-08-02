package com.southwind.test;

import com.southwind.entity.Customer;
import com.southwind.entity.Order;
import com.southwind.entity.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        //demo
        // 创建customer
        Customer customer = new Customer();
        customer.setName("张三");
        // 创建order
        Order order = new Order();
        order.setName("订单1");
        // 建立customer和order的关联关系
        order.setCustomer(customer);
        // 保存
        session.save(customer);
        session.save(order);
        // 提交事务
        session.beginTransaction().commit();
        session.close();
    }
}
