import java.util.Scanner;

public class DecToHex{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  int decimal ,deciDigit;
  System.out.print("Enter a number : ");
  decimal = input.nextInt();
  String hexCode = "";
  char hexDigit;
  while(decimal>0)
  {
   deciDigit = decimal%16;
   hexDigit = (deciDigit <= 9 && deciDigit >= 0?(char)(deciDigit+'0'):(char)(deciDigit-10+'A'));
   hexCode = hexDigit+hexCode;
   decimal/=16;
  }
  System.out.println("Hex Code : "+ hexCode);
  input.close();
 }
}
