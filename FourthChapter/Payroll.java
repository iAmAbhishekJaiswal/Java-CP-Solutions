import java.util.*;

public class Payroll{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  String name;
  float hour, payRate, federalTaxRate,stateTaxRate , grossPay, federalTax , stateTax, netPay;

  System.out.print("\nEnter employee's name : ");
  name = input.nextLine();
  System.out.print("\nEnter number of hours worked in a week : ");
  hour = input.nextFloat();
  System.out.print("\nEnter hourly pay rate : ");
  payRate = input.nextFloat();
  System.out.print("Enter federal tax withholding rate( % ) : ");
  federalTaxRate = input.nextFloat();
  System.out.print("Enter state tax withholding rate( % ) : ");
  stateTaxRate = input.nextFloat();
  input.close();

  //Calculation Part
  grossPay=hour*payRate;
  federalTax = grossPay*federalTaxRate/100;
  stateTax = grossPay*stateTaxRate/100;
  netPay = grossPay - federalTax -stateTax;

  System.out.println("\nEmployee Name : "+name);
  System.out.println("Hour Worked : "+hour);
  System.out.println("Pay Rate : $"+payRate);
  System.out.println("Gross Pay : $"+grossPay);
  System.out.println("Deductions :");
  System.out.printf("   Federal Tax( %2.2f%% ) : $%.2f\n",federalTaxRate,federalTax);
  System.out.printf("   State Tax( %2.2f%% ) : $%.2f\n",stateTaxRate, stateTax);
  System.out.printf("   Total Deduction : $%.2f\n",(federalTax+stateTax));
  System.out.printf("Net Pay : $%.2f\n",netPay);

 }
}
