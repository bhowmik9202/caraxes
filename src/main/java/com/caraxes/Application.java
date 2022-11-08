package com.caraxes;

import com.caraxes.dao.MovieDAO;
import com.caraxes.model.Movie;
import com.caraxes.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.time.Year;

public class Application {
    public static void main(String[] args) {
        //Movie movie = new Movie(Long.valueOf(4), "Mystic River", BigDecimal.valueOf(7.3), Year.of(2003));

        Movie movie = null;

        Transaction transaction = null;
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        try {
            transaction = session1.beginTransaction();
            movie = (Movie) session1.get(Movie.class, 1);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
