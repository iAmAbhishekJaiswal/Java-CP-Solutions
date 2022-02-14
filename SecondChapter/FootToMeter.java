import java.util.*;

public class FootToMeter{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   float foot,meter;
   System.out.print("\nEnter foot : ");
   foot=input.nextFloat();

   meter=foot * 0.305F;

   System.out.println("\n"+foot+" Foot = "+
   meter+ " m ");

   input.close();
  }
}
