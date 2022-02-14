import java.util.*;

public class Saving{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  float amount,sum=0,interest;
  byte month;

  System.out.print("\nEnter saving amount : ");
  amount=input.nextFloat();

  System.out.print("\nEnter annual rate of interest : ");
  interest=input.nextFloat();

  System.out.print("\nEnter month : ");
  month=input.nextByte();

  for(int i=0;i<month;i++)
  {
   sum= (sum+amount)*(1+(interest/1200));
  }
  //result print

  System.out.println("\n\nYou saved total "+(int)(sum*100)/100.0+" rupees\n");

  input.close();
 }
}
