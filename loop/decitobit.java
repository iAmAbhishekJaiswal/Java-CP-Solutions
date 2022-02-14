import java.util.*;
public class decitobit{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String s="";
  System.out.print("Enter a integer : ");
  short num = input.nextShort();
  byte bit;
  for(int i=1;i<=16;i++)
  {
   bit = (byte) (num&1);
   s = bit+s;
   num >>= 1;
  }
  System.out.println(" In 16 bit : "+s);
  input.close();
 }
}
