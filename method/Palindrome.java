
import java.util.*;

public class Palindrome{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int num;
  System.out.print("\n Enter a integer : ");
  num = input.nextInt();
  input.close();

  System.out.println("Is "+ num +
  " a palindrome ? " + isPalindrome(num));

 }

 public static boolean isPalindrome(int number){
  if( reverse(number) == number)
  return true;
  else
  return false;
 }

 public static int reverse(int number){
  int rev = 0;
  while(number>0){
   rev *= 10;
   rev += number%10;
   number /= 10;
  }
  return rev;
 }
}
