import java.util.*;

public class FifthPoint_22{
 public static void main(String[] args)
 {
  //Input part
  Scanner input = new Scanner(System.in);
  System.out.print("Enter loan amount : ");
  double loanAmount = input.nextDouble();
  System.out.print("Enter annual interest : ");
  double rate = input.nextDouble();
  double monthlyRate = rate/1200;
  System.out.print("Enter number of year : ");
  int year= input.nextInt();
  input.close();
  double monthlyPayment,totalPayment, interest, principal, balance;
  //Computation part
  monthlyPayment= loanAmount*monthlyRate/(1-(1/Math.pow((1+monthlyRate),year*12)));
  totalPayment = monthlyPayment * 12 * year;
  balance = loanAmount;
  System.out.printf("\nMonthly Payment : %.2f",monthlyPayment);
  System.out.printf("\nTotal Payment : %.2f\n\n",totalPayment);

  System.out.println(" Payment   Interest   Principal   Balance ");
  for(int i=1;i<=year*12;i++){
   interest =  balance * monthlyRate;
   principal = monthlyPayment - interest;
   balance = balance - principal;
   System.out.printf("  %-6d %10.2f %12.2f %9.2f\n",i,interest,principal,balance);
  }
 }
}
