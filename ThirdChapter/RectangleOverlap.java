import java.util.*;

public class RectangleOverlap
{
  public static void main(String[] args)
  {

   Scanner input = new Scanner(System.in);

   double x1,y1,x2,y2,width1,width2,height1,height2,centerDistance;

   System.out.print("\n Enter center of first rectangle (x,y) : ");
   x1 = input.nextDouble();
   y1 = input.nextDouble();

   System.out.print("\nEnter width of first rectangle : ");
   width1 = input.nextDouble();

   System.out.print("\nEnter height of first rectangle : ");
   height1 = input.nextDouble();

   System.out.print("\n Enter center of second rectangle (x,y) : " );
   x2 = input.nextDouble();
   y2 = input.nextDouble();

   System.out.print("\nEnter width of second  rectangle : ");
   width2 = input.nextDouble();

   System.out.print("\nEnter height of second rectangle : ");
   height2 = input.nextDouble();

   input.close();

   centerDistance = Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1) , 0.5);


   if(centerDistance <= width1/2 || centerDistance <= height1/2)
   System.out.println("\n r2 is inside r1");

   else if(centerDistance >= (width1/2)+(width2/2) || centerDistance >= (height1/2)+(height2/2) )
   System.out.println("\n r2 does not overlap r1");

   else
   System.out.println("\n r2 overlap r1");


  }
}
