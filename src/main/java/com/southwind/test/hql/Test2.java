package com.southwind.test.hql;

import com.southwind.entity.single.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        //demo
        String hql = "from People";
        Query query = session.createQuery(hql);
        query.setFirstResult(2);    // 起始下标
        query.setMaxResults(2);    // 截取长度
        List<People> list = query.list();
        System.out.println(list);

        session.close();
    }
}
