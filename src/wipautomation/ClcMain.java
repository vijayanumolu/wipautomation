package wipautomation;

public class ClcMain {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
       Calc calc = new Calc();
       calc.addition(2, 3);
       calc.modulus(3, 2);
       int subtract = calc.subtraction(5,3);
       System.out.println("Subtraction is: " + subtract);
       calc.multiplication(2,3);
       calc.division(5,3);
       calc.square(5);

       CircleRadius cir = new CircleRadius(3);
       cir.area();
       cir.perimeter();
       double radius = cir.getRadius();
       System.out.println("Radius of the circle is: " + radius);

     }
  }
