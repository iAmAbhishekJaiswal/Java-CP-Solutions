import java.util.*;

public class Palindrome{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a string : ");
  String s = input.nextLine();

  int low=0;
  int high=s.length()-1;
  boolean isPalindrome= true;
  while(low<high)
  {
   if(s.charAt(low) != s.charAt(high)){
   isPalindrome=false;
   break;
   }
   low++;
   high--;
  }
  
   if(isPalindrome)
   System.out.println("\n It's a palindrome ! ");
   else
   System.out.println("\n It's not a palindrome ");

   input.close();
 }
}
