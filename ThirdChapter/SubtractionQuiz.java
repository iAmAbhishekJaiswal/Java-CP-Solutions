import java.util.*;

public class SubtractionQuiz{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   int number1=(int)(Math.random()*10);
   int number2=(int)(Math.random()*10);
   int answer;
   if(number1<number2)
   {
   int temp=number1;
   number1=number2;
   number2=temp;
   }

   System.out.print("\n"+number1+" - "+ number2+" : ");
   answer=input.nextInt();
   if(number1-number2 == answer)
   System.out.println("\nYou're Correct\n");

   else
   {
   System.out.println("\n You're wrong \n");
   System.out.println(number1+" - "+number2+
   " should be " + (number1-number2));
   }
   input.close();
  }
}
