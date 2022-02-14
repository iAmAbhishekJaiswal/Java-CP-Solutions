import java.util.*;

public class Power
{
  public static void main(String[] args)
  {
   Scanner scan=new Scanner(System.in);
   int inputSecond,min,sec;
   System.out.print("\nEnter seconds : ");
   inputSecond=scan.nextInt();

   //Calculation
   min= inputSecond / 60;
   sec = inputSecond % 60;

   //Result
   System.out.println("\n\n "+
   inputSecond + " = "+ min+
   " minutes & "+ sec + " seconds.");

  scan.close();
  }

}

