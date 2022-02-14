import java.util.*;

public class PointInCircle{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   float radius,x2,y2,x1=0,y1=0,distance;

   System.out.print("\nEnter radius of circle centered at 0,0 : ");
   radius = input.nextFloat();

   System.out.print("Enter co-ordinate of any point(eg. 2 3.2) : ");
   x2=input.nextFloat();
   y2=input.nextFloat();

   distance = (float)Math.pow((x2*x2)+(y2*y2),0.5);
   if(distance<=radius)
   System.out.println("\nPoint is inside the circle !");

   else
   System.out.println("\nPoint is outside the circle ! \n");

   input.close();
  }
}
