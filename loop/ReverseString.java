import java.util.*;

public class ReverseString{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a string : ");
  String s = input.nextLine();
  input.close();
  String rev = "";
  for(int i=s.length()-1;i>=0;i--)
  rev += s.charAt(i);

  System.out.println("Reverse : "+rev);
 }
}
