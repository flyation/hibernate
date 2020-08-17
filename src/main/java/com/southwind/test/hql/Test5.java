package com.southwind.test.hql;

import com.southwind.entity.single.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        // 排序
        String hql = "from People order by money desc ";
        Query query = session.createQuery(hql);
        List<People> list = query.list();
        list.forEach(System.out::println);

        session.close();
    }
}
