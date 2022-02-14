import java.util.*;

public class SentinelValue{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a integer( 0 for terminate) : ");
  int num = input.nextInt();
  int sum=0;
  while(num != 0)
  {
   sum += num;

   System.out.print("Enter a integer( 0 for terminate) : ");
   num = input.nextInt();
  }
  System.out.println("\nSum : "+sum);
  input.close();
 }
}
