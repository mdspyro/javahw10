package ru.netology.movie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    @Test
    public void testFindLastDefaultLimit() {
        MovieManager manager = new MovieManager();
        Movie movie1 = new Movie("Movie 1");
        Movie movie2 = new Movie("Movie 2");
        Movie movie3 = new Movie("Movie 3");

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        Movie[] movies = manager.findLast();
        Movie[] expected = {movie3, movie2, movie1}; // По умолчанию выводим последние 5 фильмов

        assertArrayEquals(expected, movies);
    }

    @Test
    public void testFindLastCustomLimit() {
        MovieManager manager = new MovieManager(2); // Указываем лимит 2
        Movie movie1 = new Movie("Movie 1");
        Movie movie2 = new Movie("Movie 2");
        Movie movie3 = new Movie("Movie 3");

        manager.addMovie(movie1);
        manager.addMovie(movie2);
        manager.addMovie(movie3);

        Movie[] movies = manager.findLast();
        Movie[] expected = {movie3, movie2}; // Выводим последние 2 фильма

        assertArrayEquals(expected, movies);
    }
}
