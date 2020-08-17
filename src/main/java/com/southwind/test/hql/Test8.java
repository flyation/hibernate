package com.southwind.test.hql;

import com.southwind.entity.one2many.Customer;
import com.southwind.entity.one2many.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        // 级联查询
        String hql1 = "from Customer where id = :id";
        Query query1 = session.createQuery(hql1);
        query1.setParameter("id", 1);
        Customer customer = (Customer) query1.uniqueResult();

        String hql2 = "from Order where customer = :customer";
        Query query2 = session.createQuery(hql2);
        query2.setParameter("customer", customer);
        List<Order> list = query2.list();
        list.forEach(System.out::println);

        session.close();
    }
}
