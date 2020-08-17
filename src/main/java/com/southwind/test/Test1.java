package com.southwind.test;

import com.southwind.entity.one2many.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        //demo
        Customer customer = session.get(Customer.class, 1);
        System.out.println(customer.getOrders().size());
        session.close();
    }
}
