package day05.Megoldas2;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;

    private int yearOfProduction;

    private List<Integer> ratings;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
        ratings = new ArrayList<>();
    }

    public double rateMovie(int rating) {
        ratings.add(rating);
        return getAverageRating();
    }

    private int sumOfRatings(){
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return  sum;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getAverageRating() {
        return (double) sumOfRatings()/ratings.size();
    }
}
