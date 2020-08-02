package com.southwind.test;

import com.southwind.entity.many2many.Account;
import com.southwind.entity.many2many.Course;
import com.southwind.entity.one2many.Customer;
import com.southwind.entity.one2many.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;

public class TestMany2Many {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        //demo
        // 创建account
        Account account = new Account();
        account.setName("李四");
        // course
        Course course = new Course();
        course.setName("C++");
        // 建立account和course的关联关系（两张表地位相同，用任一表去关联另一表都可以）
        HashSet<Account> accounts = new HashSet<>();
        accounts.add(account);
        course.setAccounts(accounts);
        // 保存
        session.save(account);
        session.save(course);
        // 提交事务
        session.beginTransaction().commit();
        session.close();
    }
}
