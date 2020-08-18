package com.southwind.test;

import com.southwind.entity.single.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSingle {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        //demo
        // 创建people
        People people = new People();
        people.setName("王五");
        people.setMoney(2000.0);
        // 保存
        session.save(people);
        // 提交事务
        session.beginTransaction().commit();
        session.close();
    }
}
