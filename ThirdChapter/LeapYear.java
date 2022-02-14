import java.util.*;

public class LeapYear{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter year : ");
  int year = input.nextInt();

  boolean leap= (year%4==0 && year%100 != 0) || year%400==0;
  System.out.println("\n is "+year+
  " leap year? "+ leap);

  input.close();

  }
}
