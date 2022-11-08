package com.caraxes;

import com.caraxes.model.Movie;
import com.caraxes.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {
    public static void main(String[] args) {
        Movie movie = null;

        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();

            System.out.println("query about to get fired....");
            movie = (Movie) session.get(Movie.class, Long.valueOf(1));
            System.out.println(movie);

            System.out.println("query about to get fired....");
            movie = (Movie) session.get(Movie.class, Long.valueOf(2));
            System.out.println(movie);

            session.getTransaction().commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
