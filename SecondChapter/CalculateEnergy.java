import java.util.*;

public class CalculateEnergy{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  float amount, initialTemp,finalTemp,energy;

  System.out.print("Enter amount of water(in Kg) : ");
  amount=input.nextFloat();

  System.out.print("Enter initial temperature : ");
  initialTemp=input.nextFloat();

  System.out.print("Enter final temperature : ");
  finalTemp=input.nextFloat();

  energy=amount*(finalTemp-initialTemp)*4184;

  System.out.println("\nEnergy : "+
  (int)(energy*100)/100.0);

  input.close();
 }

}
