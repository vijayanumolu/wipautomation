
public class CommaSeparated {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s1 = "VJ";
    char[] ch = s1.toCharArray();
    for (int i = 0; i < ch.length; i++) {
      System.out.print(ch[i]);
      if (i < ch.length - 1)
        System.out.print(',');
    }
  }
}

