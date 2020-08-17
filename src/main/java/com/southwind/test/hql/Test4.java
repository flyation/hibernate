package com.southwind.test.hql;

import com.southwind.entity.single.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        // 模糊查询
        String hql = "from People where name like '%三%'";
        Query query = session.createQuery(hql);
        List<People> list = query.list();
        System.out.println(list);

        session.close();
    }
}
