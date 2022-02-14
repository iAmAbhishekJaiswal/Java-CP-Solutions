import java.util.*;

public class BabylonianMethodForSqrt{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter a number to find sqrt : ");
  long num = input.nextLong();
  input.close();

  System.out.println("\nApproximate Square root of "+num+" : "+(int)sqrt(num));
 }

 public static double sqrt(long n){
   double lastGuess=1, nextGuess;
   while(true){
    nextGuess = (lastGuess+n/lastGuess)/2;
    if(nextGuess-lastGuess < 0.000001)
    return nextGuess;
    else
    lastGuess = nextGuess;
  }
 }
}
