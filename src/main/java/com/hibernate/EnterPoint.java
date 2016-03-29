package com.hibernate;

import com.hibernate.entity.User;
import com.hibernate.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by Volodymyr Dudas on 29.03.2016.
 */
public class EnterPoint {
    public static void main(String[] args) {
        System.out.println("Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Volodymyr");
        user.setLastName("Dudas");

        session.save(user);
        session.getTransaction().commit();
    }
}
