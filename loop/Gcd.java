import java.util.Scanner;

public class Gcd{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  int n1,n2;
  int gcd = 1;
  int k;
  System.out.print("Enter first number : ");
  n1 = input.nextInt();
  System.out.print("Enter second number : ");
  n2 = input.nextInt();
  input.close();
  for(k=2;k <= n1 && k <= n2;k++)
  {
   if(n1 % k == 0 && n2 % k == 0)
   gcd=k;
  }
  System.out.println("\nGreatest Common Division of "+n1 + " and "+n2+ " : "+gcd);
 }
}
