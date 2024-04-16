package com.example.day11.실습문제;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie m1, Movie m2) {
        return (int) (m1.rate - m2.rate);
    }
}
