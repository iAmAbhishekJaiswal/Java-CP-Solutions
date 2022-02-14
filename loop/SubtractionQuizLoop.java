import java.util.*;

public class SubtractionQuizLoop{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  long startTime=System.currentTimeMillis();
  final byte TOTAL_QUESTION = 5;
  byte correctAnswer = 0;
  byte count = 0;
  String output ="";
  byte number1 , number2, answer;
  while(count < TOTAL_QUESTION)
  {
   number1=(byte)(Math.random()*10);
   number2=(byte)(Math.random()*10);

   if(number1<number2)
   {
    byte temp=number1;
    number1=number2;
    number2=temp;
   }

   System.out.print("\n"+number1+" - "+
   number2+" : ");
   answer = input.nextByte();

   if(answer == (number1-number2))
   {
    System.out.println("You're correct !");
    correctAnswer++;
   }
   else
    System.out.println("You're wrong ! \n"+
    number1 + " - "+number2+ " should be "+
    (number1-number2));

   count++;

   output += "\n "+number1+" - "+number2+
   " : "+answer+" --> "+((number1-number2 == answer)?"correct":"wrong");
  }
  long endTime=System.currentTimeMillis();
  long gameTime=(endTime-startTime)/1000;

  System.out.println("\n\nYour Score : "+correctAnswer+" out of "+TOTAL_QUESTION+
  "\nTotal time : "+gameTime+" seconds\n\nYour responses :-\n "+output);

  input.close();
 }
}
