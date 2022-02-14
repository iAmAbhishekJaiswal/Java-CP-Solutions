import java.util.*;

public class FifthPointSixteen{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int num = input.nextInt();
  int i=2;
  while(i<= num)
  {
  if(num % i == 0 )
  {
  num = num/i;
  System.out.print(" "+i);
  continue;
  }
  i++;
  }
 }
}
