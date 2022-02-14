import java.util.*;

public class AreaOfPentagon{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.print("\n Enter the length "+
   "from the center to a vertex : ");
   float r = input.nextFloat();
   input.close();

  //Computing side of pentagon
   double side = 2*r*Math.sin(Math.PI/5);

  //Computing area of pentagon

   double area = 5 * Math.pow(side,2) / (4 * Math.tan(Math.PI/5)) ;

   System.out.printf(" The area of pentagon is %5.2f\n",area);


  }
}
