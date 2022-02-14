import java.util.*;

public class HexToDeci{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.print("\nEnter a hex digit : ");
   String hexString= input.nextLine();

   if(hexString.length() != 1)
   {
    System.out.println("\nYou must enter exactly one character ! \n");
    System.exit(1);
   }

   char ch = Character.toUpperCase(hexString.charAt(0));

   if(ch >= 'A' && ch<= 'F')
   {
   int value = ch - 'A' + 10;
   System.out.println("Decimal number for hex digit "+ch+
   " is "+value);
  }

  else if(Character.isDigit(ch))
 {
  System.out.println("Decimal number for hex digit "+ch+
   " is "+ch);
 }

  else
  System.out.println("\nInvalid input ! \n");

  input.close();


  }
}
