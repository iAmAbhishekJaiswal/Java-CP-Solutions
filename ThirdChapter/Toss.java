import java.util.*;

public class Toss{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  byte coin = (byte)(Math.random()*2);

  System.out.print("\n 1. Head\n 2. Tail\n"+
  " Choose head or tail (eg. 1 for head) : ");
  byte choice = input.nextByte();

  if(coin == 0 && choice == 1 )
  System.out.println("\nYou won ! It's Head ! \n");

  else if( coin == 1 && choice == 2)
  System.out.println("\nYou won ! It's Tail !\n");

  else if(coin == 0)
  System.out.println("\nYou loss ! It's Head ! \n");

  else
  System.out.println("\nYou loss ! It's Tail ! \n");

  input.close();
 }
}
