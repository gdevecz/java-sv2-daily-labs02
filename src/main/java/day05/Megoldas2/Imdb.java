package day05.Megoldas2;

public class Imdb {

    public static void main(String[] args) {

        day05.Megoldas.Movie movie = new day05.Megoldas.Movie("Titanic", 1992);

        System.out.println(movie.getTitle());
        System.out.println(movie.rateMovie(4));
        System.out.println(movie.rateMovie(5));

        day05.Megoldas.Viewer viewer = new day05.Megoldas.Viewer();
        viewer.watchMovie(movie, 5);

        System.out.println(movie.getAverageRating());
    }
}

