package com.codeclan.example.toptenmovies;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 22/05/2017.
 */

public class MovieTest {

    @Test
    public void canGetTitle(){
        Movie movie = new Movie("Back to the future");
        assertEquals("Back to the future",movie.getTitle());
    }

    @Test
    public void canGetGenre(){
        Movie movie = new Movie("Back to the future");
        assertEquals("Adventure",movie.getGenre("Adventure"));
    }

    @Test
    public void canGetRanking(){
        Movie movie = new Movie("Back to the future");
        assertEquals(8 ,movie.getRanking(8));
    }

}
