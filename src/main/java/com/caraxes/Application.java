package com.caraxes;

import com.caraxes.model.Movie;
import com.caraxes.util.HibernateUtil;
import org.hibernate.Session;

public class Application {
    public static void main(String[] args) {
        Movie movie = null;

        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        try {
            session1.beginTransaction();

            System.out.println("query about to get fired....");
            movie = (Movie) session1.get(Movie.class, Long.valueOf(1));
            System.out.println(movie);

            session1.getTransaction().commit();
            session1.close();

            session2.beginTransaction();

            System.out.println("query about to get fired....");
            movie = (Movie) session2.get(Movie.class, Long.valueOf(1));
            System.out.println(movie);

            session2.getTransaction().commit();
            session2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
