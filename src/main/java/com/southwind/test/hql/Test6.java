package com.southwind.test.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test6 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        // 查询某个属性
        String hql = "select name from People where id = 2";
        Query query = session.createQuery(hql);
        String name = (String) query.uniqueResult();
        System.out.println(name);

        session.close();
    }
}
