
public class MinMax {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] InitialArray = new int[] {1, 3, 5, 7,};

    int result = sumArray(InitialArray);
    System.out.println("sum = " + result);


    int minimum = minimum(InitialArray);
    System.out.println("Minimum value= " + minimum);

    int max = maximum(InitialArray);
    System.out.println("Maximum value= " + max);

    int[] copiedArray = copytoArray(InitialArray);
    System.out.println("copied array: ");
    for (int i = 0; i < copiedArray.length; i++) {
      System.out.println(copiedArray[i]);
    }

    int[] copyArrayEnd = copytoArrayEnd(InitialArray);
    for (int i = 0; i < copyArrayEnd.length; i++) {
      System.out.println(copyArrayEnd[i]);
    }

  }

  static int sumArray(int[] InitialArray) {
    int sum = 0;
    for (int i = 0; i < InitialArray.length; i++)
      sum += InitialArray[i];
    return sum;
  }

  static int minimum(int[] InitialArray) {
    int minimum = InitialArray[0];
    for (int i = 1; i < InitialArray.length; i++)
      if (minimum > InitialArray[i])
        minimum = InitialArray[i];
    return minimum;
  }


  static int maximum(int[] InitialArray) {
    int max = InitialArray[0];
    for (int i = 1; i < InitialArray.length; i++)
      if (max < InitialArray[i])
        max = InitialArray[i];
    return max;
  }
  static int[] copytoArrayEnd(int[] InitialArray) {
    int[] copyArrayEnd = new int[InitialArray.length];
    for (int i = InitialArray.length - 1, j = 0; i >= 0; i--, j++) {
      copyArrayEnd[j] = InitialArray[i];
    }
    return copyArrayEnd;
  }
  static int[] copytoArray(int[] InitialArray) {
    int[] copyArray = new int[InitialArray.length];
    for (int i = 0; i < InitialArray.length; i++) {
      copyArray[i] = InitialArray[i];
    }
    return copyArray;
  }

}
