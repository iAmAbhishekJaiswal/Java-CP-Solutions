import java.util.*;

public class SumOfDigits{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\n Enter an integer : ");
  long num = input.nextLong();
  System.out.println("\nSum of digits : "+sumDigits(num));
  input.close();
 }

 public static int sumDigits(long n){
  int sum=0;
  while(n>0)
  {
   sum += n%10;
   n = n/10;
  }
   return sum;
 }
 
}
