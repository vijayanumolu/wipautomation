package wipautomation;

public class sumofeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	        System.out.println("Enter a number larger than 2");
	        int num = input.nextInt();

	        int sum = 0;
	        if (num >= 2) {

	            for (int i = 2; i <= num; i += 2) {
	                sum += i;
	            }
	            System.out
	                    .println("The sum of all even numbers between 2 and the input is "
	                            + sum);
	        } else {
	            System.out.println("Invalid, please enter a number above 2");
	        }
	}

}
