import java.util.*;

public class DeciToHex{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("\n Enter a decimal between 0 to 15 : ");
  byte deci = input.nextByte();
  if(deci > 15)
  {
   System.out.println("\n Invalid input !\n");
   System.exit(1);
  }
  else if(deci >= 9)
  {
   System.out.println("\n Hex code : "+(char)(deci+55));
 }
  else
  System.out.println("\n Hex code : "+deci);
  input.close();
}
}
