package day05;

import java.time.LocalDate;

public class Movie {

    private String name;
    private LocalDate date;
    private double rating;
    private int sumOfratings = 0;
    private int numberOfRatings = 0;

    public Movie(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public double scoring(int score) {
        sumOfratings += score;
        numberOfRatings++;

        return rating = (double) this.sumOfratings / numberOfRatings;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getRating() {
        return rating;
    }
}
