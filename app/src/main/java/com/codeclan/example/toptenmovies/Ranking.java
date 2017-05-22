package com.codeclan.example.toptenmovies;

import java.util.ArrayList;

/**
 * Created by user on 22/05/2017.
 */

public class Ranking {
    private ArrayList<Movie> rankings;

    public Ranking(ArrayList<Movie> rankings){
        this.rankings = rankings;
    }

    public Ranking(){
        this.rankings = new ArrayList<>();
        setupDefaultRankings();
    }

    private void setupDefaultRankings(){
        Movie[] defaultRankings = {};
        for (Movie movie : defaultRankings) {
            this.rankings.add(movie);
        }
    }
    public ArrayList<Movie> getRankings() {
        return new ArrayList<>(this.rankings);
    }

    public int countRankings() {
        return this.rankings.size();
    }

    public Movie getMovieatIndex(int i) {
        return this.rankings.get(i);
    }

    public Movie replace(Movie movie) {
        this.rankings.remove(9);
        this.rankings.add(movie);
        return this.rankings.get(9);
    }
}
