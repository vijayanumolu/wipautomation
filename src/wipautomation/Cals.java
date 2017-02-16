package wipautomation;

import java.util.Scanner;

public class Cals {
  void operate() {
    int num1 = 8;
    int num2 = 3;
    Scanner scan = new Scanner(System.in);
    System.out.print("What operation?(+,*,-,/,%,*2):");
    String operation = scan.next();
    scan.close();

    if (operation.equals("+")) {
      System.out.println(num1 + num2);
    }

    else if (operation.equals("-")) {
      System.out.println(num1 - num2);
    }

    else if (operation.equals("*")) {
      System.out.println(num1 * num2);
    }

    else if (operation.equals("/")) {
      System.out.println(num1 / num2);
    }

    else if (operation.equals("%")) {
      System.out.println(num1 % num2);
    }

    else if (operation.equals("*2")) {
      System.out.println(num1 * num1);
    }

    else {
      System.out.println("The operation is not valid.");

    }

  }

}