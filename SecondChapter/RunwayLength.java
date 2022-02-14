import java.util.*;

public class RunwayLength{
  public static void main(String[] args)
  {
   Scanner input=new Scanner(System.in);
   float length,speed, acceleration;
   System.out.print("Enter speed of aeroplane(in m/s) : ");
   speed = input.nextFloat();

   System.out.print("Enter acceleration(in m/s²) : ");
   acceleration = input.nextFloat();

   length= speed*speed/(2*acceleration);
   System.out.println("\n\nLength of runway : "+
   length+" m ");

   input.close();
  }
}
