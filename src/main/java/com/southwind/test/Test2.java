package com.southwind.test;

import com.southwind.entity.one2many.Order;
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
        Order order = session.get(Order.class, 1);
        System.out.println(order);
//        System.out.println(order.getCustomer());
        session.close();
    }
}
