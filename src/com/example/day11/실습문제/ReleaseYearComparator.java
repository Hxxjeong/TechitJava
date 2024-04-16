package com.example.day11.실습문제;

import java.util.Comparator;

public class ReleaseYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.year - o2.year;
    }
}
