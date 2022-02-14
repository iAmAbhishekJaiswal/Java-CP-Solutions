import java.util.*;

public class distanceBetweenPoint{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  float x1,y1,x2,y2;
  double distance;

  System.out.print("\nEnter co-ordinate of first"+
  " point (x1 and y1) : ");
  x1=input.nextFloat();
  y1=input.nextFloat();

  System.out.print("\nEnter co-ordinate of second"+
  " point (x2 and y2) : ");
  x2=input.nextFloat();
  y2=input.nextFloat();

  distance=Math.pow((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)), 0.5);
  System.out.println("\nDistance between point : "+
  distance+"\n");

  input.close();
 }
}
