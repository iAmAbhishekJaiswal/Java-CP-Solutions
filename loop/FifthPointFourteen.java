import java.util.*;

public class FifthPointFourteen{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int n1,n2, d,gcd=1;

  System.out.print("Enter firsr number  ");
  n1 = input.nextInt();

  System.out.print("Enter second number : ");
  n2 = input.nextInt();
  input.close();

  d = n1<n2 ? n1 : n2;
  while(d > 1){
  if(n1%d==0 && n2 % d ==0){
  gcd = d;
  break;
  }
  d--;
  }
  System.out.println("\nGreatest Common Divisor : "+gcd);
 }
}
