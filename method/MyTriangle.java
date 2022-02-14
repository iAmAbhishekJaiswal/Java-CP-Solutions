import java.util.*;

public class MyTriangle{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print(" Enter three sides of a triangle : ");
  double side1 = input.nextDouble();
  double side2 = input.nextDouble();
  double side3 = input.nextDouble();

  if(isValid(side1,side2,side3))
  System.out.println("Area of triangle : "+area(side1,side2,side3));
  else
  System.out.println("\n Invalid input for triangle ");

 }

 public static boolean isValid(double side1, double side2, double side3){
  if((side1+side2>side3) && (side2+side3>side1) && (side1+side3>side2))
  return true;
  else
  return false;
 }

 public static double area(double side1, double side2, double side3){
   double s = ( side1 + side2 + side3)/2;
   double areaOfTriangle = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
   return areaOfTriangle;
 }
}
