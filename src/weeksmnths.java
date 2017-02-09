import java.util.Scanner;

public class weeksmnths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m, year, week, day;
	       Scanner s = new Scanner(System.in);
	       System.out.print("Enter the number of days:");
	       m = s.nextInt();
	       year = m / 365;
	       m = m % 365;
	       System.out.println("No. of years:"+year);
	       week = m / 7;
	       m = m % 7;
	       System.out.println("No. of weeks:"+week);
	       day = m;
	       System.out.println("No. of days:"+day);
	}

}
