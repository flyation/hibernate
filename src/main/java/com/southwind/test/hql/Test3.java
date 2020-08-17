package com.southwind.test.hql;

import com.southwind.entity.single.People;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Test3 {
    public static void main(String[] args) {
        // 创建configuration（通过hibernate.cfg.xml）
        Configuration configuration = new Configuration().configure();
        // 获取sessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        // 获取session
        Session session = sessionFactory.openSession();

        //demo
        String hql = "from People where id = 14";
        Query query = session.createQuery(hql);
//        People people = (People) query.list().get(0); // 当查询结果集为空时，此时会抛出异常 数组下标越界java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        People people = (People) query.uniqueResult(); // 当查询结果集为空时，此时会返回null，不会抛出异常
        System.out.println(people);

        session.close();
    }
}
