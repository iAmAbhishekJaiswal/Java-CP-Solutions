import java.util.*;

public class FifthPointSeventeen{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int n = input.nextInt();
  input.close();
  for(int i=n;i>=1;i--){
   for(int k=n;k>=i;k--)
    System.out.print("  ");
   for(int j=1;j<=i;j++){
   System.out.print(" "+j);
  }
  System.out.println("");
  }
 }
}
