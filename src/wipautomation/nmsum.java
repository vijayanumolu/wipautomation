package wipautomation;

import java.util.Scanner;


public class nmsum {


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n;
    System.out.print("Enter a integer: ");
    n = in.nextInt();
    System.out.println(n);
    if (n <= 0)
      System.out.println("Integer you've entered is nonpositive.");
    else {
      int sum = 0;

      while (n != 0) {

        sum += n % 10;

        n /= 10;
      }
      System.out.println("Sum of digits: " + sum);
    }
  }
}
