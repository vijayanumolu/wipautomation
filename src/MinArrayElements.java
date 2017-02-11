import java.util.Arrays;

public class MinArrayElements {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] tab = {12, 1, 21, 8};
    int min = Arrays.stream(tab).min().getAsInt();
    System.out.println("Min = " + min);
  }

}
