package com.caraxes;

import com.caraxes.dao.MovieDAO;
import com.caraxes.model.Movie;

import java.math.BigDecimal;
import java.time.Year;

public class Application {
    public static void main(String[] args) {
        MovieDAO movieDAO = new MovieDAO();
        Movie movie = new Movie(Long.valueOf(4), "Mystic River", BigDecimal.valueOf(7.3), Year.of(2003));
        movieDAO.saveMovie(movie);
    }
}
