import java.util.Scanner;

public class RockPaperScissor{
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);

  byte x = (byte)(Math.random()*3);
  System.out.print("\n1.Rock\n2.Paper\n3.Scissor"+
   "\nChoose one (eg. 1 for rock) : ");
  byte y= s.nextByte();
  y-=1;
  System.out.println("\n");
  switch(x)
  {
   case 0: if(y==0)
           System.out.println("Computer is Rock and "+
           "You are also Rock !"+
           "\n\n Game Draw ! \n");
           else if(y==1)
	   System.out.println("Computer is Rock and "+
 	   "you are Paper !\n\n You Won\n");
           else
           System.out.println("Computer is Rock and "+
 	   "you are Scissor !\n\n You Loss ! \n");
   	   break;

   case 1:if(y==1)
           System.out.println("Computer is Paper and "+
           "You are also Paper !"+
           "\n\n Game Draw ! \n");
           else if(y==0)
           System.out.println("Computer is Paper and "+
           "you are Rock !\n\n You Loss\n");
           else
           System.out.println("Computer is Papee and "+
           "you are Scissor !\n\n You Won ! \n");
   	   break;

   case 2:if(y==2)
           System.out.println("Computer is Scissor and "+
           "You are also Scissor !"+
           "\n\n Game Draw ! \n");
           else if(y==1)
           System.out.println("Computer is Scissor and "+
           "you are Paper !\n\n You Loss\n");
           else
           System.out.println("Computer is Scissor and "+
           "you are Rock !\n\n You Won ! \n");
	   break;

    default: System.out.println("Logic Error");

  }
 }
}
