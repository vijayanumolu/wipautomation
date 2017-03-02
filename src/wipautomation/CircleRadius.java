package wipautomation;

public class CircleRadius {

  public static void main(String[] args)  {
    // TODO Auto-generated method stub

      public double radius;
      public double pi;

      public CircleRadius(double rad) {
        
         pi = 3.1421592;

        radius = rad;
      }

      public double area() {
        return  pi * radius * radius;

      }

      public double perimeter() {
      return pi * 2 * radius;

      }

      public double getRadius() {
        return radius;

      }
