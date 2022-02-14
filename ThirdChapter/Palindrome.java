import java.util.*;

public class Palindrome{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter any number : ");
   int number = input.nextInt();
   int temp=number,reverse=0,digit;
   while(temp>0)
   {
    digit = temp%10;
    reverse = (reverse*10)+digit;
    temp = temp/10;
  }
   if(number == reverse)
   System.out.println("\n "+number + " is a palindrome . \n");

   else
   System.out.println("\n "+number + " is not a palindrome . \n");
   input.close();
}

}
