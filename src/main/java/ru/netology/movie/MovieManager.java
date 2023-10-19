package ru.netology.movie;
import java.util.Arrays;

public class MovieManager {
    private Movie[] movies;
    private int limit;

    public MovieManager() {
        this.limit = 5; //
        this.movies = new Movie[0];
    }

    public MovieManager(int limit) {
        this.limit = limit;
        this.movies = new Movie[0];
    }

    public void addMovie(Movie movie) {
        Movie[] newMovies = new Movie[movies.length + 1];
        System.arraycopy(movies, 0, newMovies, 1, movies.length);
        newMovies[0] = movie;
        movies = newMovies;
    }

    public Movie[] findAll() {
        return Arrays.copyOf(movies, movies.length);
    }

    public Movie[] findLast() {
        int resultLength = Math.min(limit, movies.length);
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = movies[resultLength - 1 - i];
        }
        return result;
    }
}
