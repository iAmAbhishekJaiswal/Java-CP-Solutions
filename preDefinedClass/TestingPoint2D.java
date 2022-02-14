import java.util.Scanner;
import javafx.geometry.Point2D;

class TestingPoint2D{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter first co-ordinate : ");
   double x1=input.nextDouble();
   double y1=input.nextDouble();
  
   System.out.print("Enter second co-ordinate : ");
   double x2=input.nextDouble();
   double y2=input.nextDouble();

   Point2D p1 = new Point2D(x1,y1);
   Point2D p2 = new Point2D(x2,y2);

  System.out.println(p1.toString());
  System.out.println(p2.toString());
  System.out.println("Distance :- " + p1.distance(p2));
  input.close();
 }
}
