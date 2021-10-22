package day05;

import java.time.LocalDate;

public class MovieMain {

    public static void main(String[] args) {

        Movie movie = new Movie("Film", LocalDate.of(2011,10,12));
        Viewer viewer1 = new Viewer();
        Viewer viewer2 = new Viewer();
        Viewer viewer3 = new Viewer();
        viewer1.watchMovie(movie,3);
        viewer2.watchMovie(movie,5);
        viewer3.watchMovie(movie,4);

        System.out.println(movie.getRating());

    }
}
