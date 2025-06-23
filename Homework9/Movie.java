package Homework9;

import java.util.ArrayList;
import java.util.Comparator;

public class Movie {
    private String title;
    private double rating;
    private int year;

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Spirited Away", 9, 2001));
        movies.add(new Movie("Parasite", 9, 2019));
        movies.add(new Movie("Princess Mononoke", 8.3, 1997));
        movies.add(new Movie("Memories of Murder", 8.1, 2003));
        movies.add(new Movie("Children of Men", 8, 2006));

        Comparator<Movie> byRating = (m1, m2) -> Double.compare(m2.rating, m1.rating);
        Comparator<Movie> byYear = (m1, m2) -> Integer.compare(m1.year, m2.year);
       
        movies.removeIf(movie -> movie.rating < 8);
        movies.sort(byYear.thenComparing(byRating));
        for (Movie movie : movies) {
            System.out.println(movie.title + " (" + movie.year + ") - Rating: " + movie.rating);
        }
    }
    
}
