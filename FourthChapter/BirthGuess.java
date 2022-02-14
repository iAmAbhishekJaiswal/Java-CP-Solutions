import java.util.*;

public class BirthGuess{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  byte day=0;
  char answer;

  System.out.print("\nIs your birthday in set 1 ?\n"+
                   "\n 1  3  5  7  9\n"+
                   " 11 13 15 17 19\n"+
 		   " 21 23 25 27 29\n"+
 		   " 31\n "+
   "Enter n for no and y for yes : ");
   answer = input.next().charAt(0);

   if(answer == 'y')
   day += 1;

   System.out.print("\n\nIs your birthday in set 2 ?\n"+
                   "\n 2  3  6  7  10\n"+
                   " 11 14 15 18 19\n"+
                   " 22 23 26 27 30\n"+
                   " 31\n "+
   "Enter n for no and y for yes : ");
   answer = input.next().charAt(0);

   if(answer == 'y')
   day += 2;

   System.out.print("\n\nIs your birthday in set 3 ?\n"+
                   "\n 4  5  6  7 12\n"+
                   " 13 14 15 20 21\n"+
                   " 22 23 28 29 30\n"+
                   " 31\n "+
   "Enter n for no and y for yes : ");
   answer =input.next().charAt(0);

   if(answer == 'y')
   day += 4;

   System.out.print("\n\nIs your birthday in set 4 ?\n"+
                   "\n 8  9 10 11 12\n"+
                   " 13 14 15 24 25\n"+
                   " 26 27 28 29 30\n"+
                   " 31\n "+
   "Enter n for no and y for yes : ");
   answer = input.next().charAt(0);

   if(answer == 'y')
   day += 8;

   System.out.print("\n\nIs your birthday in set 5 ?\n"+
                   "\n 16 17 18 19 20\n"+
                   " 21 22 23 24 25\n"+
                   " 26 27 28 29 30\n"+
                   " 31\n "+ 
   "Enter n for no and y for yes : ");
   answer = input.next().charAt(0);

   if(answer == 'y')
   day += 16;

   System.out.println("\n Your Birthday is "+day+" !\n");
   input.close();

 }
}
