package com.caraxes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Year;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Table(name = "movie", schema = "caraxes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", unique = true)
    private String title;

    @Column(name = "imdb_rating")
    private BigDecimal imdbRating;

    @Column(
            name = "year_of_release",
            columnDefinition = "smallint"
    )
    @Convert(
            converter = YearAttributeConverter.class
    )
    private Year yearOfRelease;
}
