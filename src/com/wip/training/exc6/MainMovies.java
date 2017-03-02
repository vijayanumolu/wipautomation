package com.wip.training.exc6;

import java.time.LocalDate;
import java.time.Month;

public class MainMovies {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Movie movies[] = new Movie[5];
    movies[0] = new Movie("Passenger", "Drama", LocalDate.of(2014, Month.APRIL, 10), 2);
    movies[1] = new Movie("Arrival", "SciFi", LocalDate.of(2017, Month.FEBRUARY, 20), 200);
    movies[2] = new Movie("Trolls", "Comedy", LocalDate.of(2012, Month.JANUARY, 15), 500);
    movies[3] = new Movie("The Accountant", "Drama", LocalDate.of(2016, Month.DECEMBER, 25), 800);
    movies[4] = new Movie("The Book of Life", "Comedy", LocalDate.of(2016, Month.JUNE, 10), 700);

    int index = getLatestMovies(movies);
    int counter = getOldestMovies(movies);
    String Genre = "Comedy";
    int count = getCountGenre(movies, Genre);

    for (int i = 0; i < movies.length; i++) {
      movies[i].printDetails();
    }

    System.out.println("total time to watch all movies " + totalTime(movies));
    System.out.println("Latest Released movie is " + movies[index].getTitle());
    System.out.println("Oldest Released movie is " + movies[counter].getTitle());
    System.out.println("number of movies with Genre " + Genre + "is " + count);
  }

  private static int totalTime(Movie movies[]) {
    int len = 0;
    for (int i = 0; i < movies.length; i++) {
      len = len + movies[i].movieLength;
    }
    return (len);
  }

  public static int getLatestMovies(Movie movies[]) {
    LocalDate Latest = movies[0].getRelDate();
    int index = 0;
    for (int i = 1; i < movies.length; i++) {
      LocalDate NewDate = movies[i].getRelDate();
      if (Latest.compareTo(NewDate) < 0) {
        Latest = NewDate;
        index = i;
        System.out.println("Latest" + Latest);
      }
    }
    return index;
  }

  public static int getOldestMovies(Movie movies[]) {
    LocalDate Oldest = movies[0].getRelDate();
    int counter = 0;
    for (int j = 1; j < movies.length; j++) {
      LocalDate NewDate = movies[j].movieRelDate;
      if (Oldest.compareTo(NewDate) > 0) {
        NewDate = Oldest;
        counter = j;
      }
    }
    return counter;
  }

  public static int getCountGenre(Movie movies[], String Genre) {
    int count = 0;
    for (int k = 0; k < movies.length; k++) {
      String gen = movies[k].getGenre();
      if (gen.equals(Genre)) {
        count++;
      }
    }
    return count;
  }
}
  }

}
