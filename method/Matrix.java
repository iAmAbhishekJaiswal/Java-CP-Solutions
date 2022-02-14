import java.util.*;

public class Matrix{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter n : ");
  int n = input.nextInt();
  input.close();
  printMatrix(n);
 }

 public static void printMatrix(int n){
  for(int i=1;i<=n*n;i++)
  {
   if(i%n==0)
   System.out.println((int)(Math.random()*2));
   else
   System.out.print((int)(Math.random()*2)+"  ");
  }
 }
}
