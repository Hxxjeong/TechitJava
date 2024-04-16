package com.example.day11.실습문제;

public class Movie implements Comparable<Movie> {
    String title;
    int year;
    double rate;

    public Movie(String title, int year, double rate) {
        this.title = title;
        this.year = year;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rate=" + rate +
                '}';
    }

    @Override
    public int compareTo(Movie other) {
        return this.title.compareTo(other.title);
    }
}