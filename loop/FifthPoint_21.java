import java.util.*;

public class FifthPoint_21{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter loan amount : ");
  double loanAmount = input.nextDouble();

  System.out.print("Enter number of year : ");
  int year = input.nextInt();
  input.close();

  double interestRate = 5.000;
  double monthlyPayment, totalPayment;
  System.out.println(" Interest Rate    Monthly Payment    Total Payment");
  for(interestRate = 5.000;interestRate<=8.000;interestRate = interestRate+0.125)
  {
   double monthlyRate = interestRate/1200;
   monthlyPayment = loanAmount * monthlyRate/(1- 1/Math.pow(1+monthlyRate,year*12));
   totalPayment = monthlyPayment*12*year;
   System.out.printf("%-16.3f %-17.2f %13.2f\n",interestRate,monthlyPayment,totalPayment);
  }
 }
}
