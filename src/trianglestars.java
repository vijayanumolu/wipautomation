import java.util.Scanner;

public class trianglestars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int rows, i, j; 
	       Scanner in = new Scanner(System.in);
	       System.out.println("Enter number of rows in pattern");
	       rows = in.nextInt();
	       for(i = 1; i <= rows; i++) {      
	           for(j = 1; j <= i; ++j) {
	               System.out.print("* ");
	           }

	           System.out.print("\n");
	       }
	}

}
