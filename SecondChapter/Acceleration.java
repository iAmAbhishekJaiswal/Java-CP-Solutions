import java.util.*;

public class Acceleration{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    float a,v,u;
    int t;

    System.out.print("Enter starting velocity : ");
    u=input.nextFloat();

    System.out.print("Enter ending velocity : ");
    v=input.nextFloat();

    System.out.print("Enter time of change velocity : ");
    t=input.nextInt();

    a=(v-u)/t;
    System.out.println("\nAverage Acceleration : "+
    (int)(a*100)/100.0+ "m/s²");

    input.close();
  }
}
