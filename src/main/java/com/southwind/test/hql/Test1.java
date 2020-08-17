package com.southwind.test.hql;

import com.southwind.entity.single.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        // 查询
//        String hql = "from com.southwind.entity.single.People";
        String hql = "from com.southwind.entity.single.People"; // 全类名可以省略为普通类名
        Query query = session.createQuery(hql);
        List<People> list = query.list();
        System.out.println(list);

        session.close();
    }
}
