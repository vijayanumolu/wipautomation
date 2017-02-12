
public class PrintEachDigit {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] originalArray = {};
    int n = 3456;
    int number = n;
    int k = 0;
    while (n != 0) {
      n = n / 10;
      k++;
    }

    int[] copyArray;
    copyArray = new int[k];
    int j = 0;
    while (number != 0) {

      int d = number % 10;
      copyArray[j] = d;

      number = number / 10;
      j++;
    }

    for (int i = copyArray.length - 1; i >= 0; i--) {
      if (copyArray[i] == 0)
        System.out.println("zero");
      else if (copyArray[i] == 1)
        System.out.println("one");
      else if (copyArray[i] == 2)
        System.out.println("two");
      else if (copyArray[i] == 3)
        System.out.println("three");
      else if (copyArray[i] == 4)
        System.out.println("four");
      else if (copyArray[i] == 5)
        System.out.println("five");
      else if (copyArray[i] == 6)
        System.out.println("six");
      else if (copyArray[i] == 7)
        System.out.println("seven");
      else if (copyArray[i] == 8)
        System.out.println("eight");
      else if (copyArray[i] == 9)
        System.out.println("nine");

    }
  }

}
