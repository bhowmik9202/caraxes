package com.caraxes.dao;

import com.caraxes.model.Movie;
import com.caraxes.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MovieDAO {
    public void saveMovie(Movie movie) {
        Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session.beginTransaction();
            session.save(movie);

            session.flush();
            session.clear();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
