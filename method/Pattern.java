import java.util.*;

public class Pattern{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\n Enter number of line : ");
  int n = input.nextInt();
  displayPattern(n);
  input.close();
 }

 public static void displayPattern(int n){
  for(int i=1;i<=n;i++)
  {
    for(int j=n-i;j>=0;j--)
    System.out.print("  ");

    for(int j=i;j>0;j--)
    System.out.print(j+" ");

   System.out.println("");
  }
 }
}
