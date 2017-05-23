package com.codeclan.example.toptenmovies;

/**
 * Created by user on 22/05/2017.
 */

public class Movie {
    private String title;
    private String genre;
    private String ranking;

    public String toString() {
        return "Title: '" + this.title + "', Genre: '" + this.genre + "', Ranking: '" + this.ranking + "'";
    }

    public Movie(String name) {
        this.title= name;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre(String genre) {
        return genre;
    }

    public int getRanking(int i) {
        return i;
    }
}
