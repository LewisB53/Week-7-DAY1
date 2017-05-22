package com.codeclan.example.toptenmovies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 22/05/2017.
 */

public class RankingTest {
    @Test
    public void rankingsAreNotNull(){
        Ranking ranking = new Ranking();
        assertNotNull(ranking.getRankings());
    }

    @Test
    public void hasTenRankings(){
        Ranking ranking = new Ranking();
        assertNotNull(ranking.countRankings());
    }


    @Test
    public void canGetRankingatIndex(){
        Ranking ranking = new Ranking();
        Movie movie = ranking.getMovieatIndex(1);
        assertNotNull(movie);
    }

    @Test
    public void canReplaceMovieatIndex(){
        Ranking ranking = new Ranking();
        Movie movie = new Movie("Terminator");
        ranking.replace(movie);
        assertEquals(movie,ranking.getMovieatIndex(9));
    }
}
