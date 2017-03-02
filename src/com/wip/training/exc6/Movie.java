package com.wip.training.exc6;
import java.time.LocalDate;
public class Movie {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String movieTitle;
    String movieGenre;
    LocalDate movieRelDate;
    int movieLength;

   public Movie(String title, String genre, LocalDate relDate, int length) {
     movieTitle = title;
     movieGenre = genre;
     movieRelDate = relDate;
     movieLength = length;

   }

   public String getTitle() {
     return movieTitle;
   }

   public String getGenre() {
     return movieGenre;
   }

   public LocalDate getRelDate() {
     return movieRelDate;
   }

   public int getLen() {
     return movieLength;
   }

   public void printDetails() {
     System.out.println("Title of the movie is: " + movieTitle);
     System.out.println("Genre is: " + movieGenre);
     System.out.println("Movie Released on " + movieRelDate);
     System.out.println("Duration of the movie is " + movieLength);

   }
 }
  }

}
