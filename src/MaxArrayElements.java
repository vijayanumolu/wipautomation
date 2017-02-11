import java.util.Arrays;

public class MaxArrayElements {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] tab = {12, 1, 21, 8};
    int max = Arrays.stream(tab).max().getAsInt();
    System.out.println("Max = " + max);
  }

}
