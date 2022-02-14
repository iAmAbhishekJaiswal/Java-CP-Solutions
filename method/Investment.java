import java.util.*;

public class Investment{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\n The amount invested : ");
  double amount = input.nextDouble();
  System.out.print("\n  Interest rate : ");
  double rate = input.nextDouble();
  rate /= 1200;
  input.close();

  System.out.println(" Years   Future Values");
  for(int i=1;i<=30;i++)
  System.out.printf(" %-5d   %11.2f\n",i,futureInvestmentValue(amount,rate,i));

 }

 public static double futureInvestmentValue(double amount,double monthlyRate,int year){
  double futureInvestment;
  futureInvestment = amount * Math.pow((1+monthlyRate),year*12);
  return futureInvestment;

 }



}
