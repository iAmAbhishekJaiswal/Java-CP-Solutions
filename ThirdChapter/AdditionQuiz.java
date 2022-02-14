import java.util.*;

public class AdditionQuiz{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   byte a = (byte)(Math.random()*10);
   byte b = (byte)(Math.random()*10);
   byte c = (byte)(Math.random()*10);

   System.out.print("\n "+a+" + "+b+" + "+c+ " : ");
   byte answer = input.nextByte();

   if(a+b+c == answer)
    System.out.println("\nYou are Correct ! ");

   else
   {
   System.out.println("\nYou are wrong ! ");
   System.out.println("\n Correct answer is : "+ (a+b+c) );
   }
  }
}
