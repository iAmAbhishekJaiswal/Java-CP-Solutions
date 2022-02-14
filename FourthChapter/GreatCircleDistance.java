import java.util.*;

public class GreatCircleDistance{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double x1,x2,y1,y2,d;
    final float radius = 6371.01f;

    //input 
    System.out.print("Enter point 1 ( Latitude and Longitude) : ");
    x1 = input.nextDouble();
    y1 = input.nextDouble();

   System.out.print("Enter point 1 ( Latitude and Longitude) : ");
    x2 = input.nextDouble();
    y2 = input.nextDouble();

    x1 = Math.toRadians(x1);
    y1 = Math.toRadians(y1);
    x2 = Math.toRadians(x2);
    y2 = Math.toRadians(y2);

    d = radius * Math.acos(Math.sin(x1)*Math.sin(x2)+
        Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    System.out.println("\nThe distance between two point is "+ 
    d + " km.\n");

    input.close();
  }
}
