import java.util.*;

public class Substring{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  String a,b;
  a = input.next();
  b= input.next();
  if(a.contains(b))
  {
   System.out.println("\n Substring ! \n");
  }
  else
   System.out.println("\n Not a substring ! \n");
  input.close();

 }
}
