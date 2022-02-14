import java.util.*;

public class FifthPointTwo{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   int num1,num2,answer,correctCount=0;
   long startTime = System.currentTimeMillis();
   String output = "";

   for(int i=0;i<10;i++)
   {
    num1 = (int)(Math.random()*16);
    num2 = (int)(Math.random()*16);
    System.out.print("\n"+num1+" + "+
    num2+ " : ");
    answer = input.nextInt();
    if(num1 + num2 == answer){
    correctCount++;
    System.out.println("\nYou're Correct ! ");
    }
    else
    System.out.println("\nYou're Wrong ! "+
    "\n"+num1+" + "+num2+" should be "+(num1+num2)+" !");

    output += "\n "+num1+" + "+
    num2+ " : "+answer+"("+
    ((num1+num2 == answer)?"Correct":"Wrong")+")";
   }
   long endTime = System.currentTimeMillis();
   System.out.println("\n You scored "+correctCount+" Out of 10 ! ");
   System.out.println("\n Total time : "+(endTime-startTime)/1000+" second");
   input.close();
  }
}
