import java.util.Scanner;

public class SumOfDigit{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);

  int digit,sum=0;
  System.out.print("Enter any digit(1-1000) : ");
  digit=input.nextInt();
  while(digit>0)
  {
  sum+=digit%10;
  digit=digit/10;
  }

  System.out.println("Sum of Digit : "+
  sum);
  input.close();
  }
}
