import java.util.*;

public class LogicalOperator{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   int num;
   boolean result;
   System.out.print("\nEnter a integer : ");
   num = input.nextInt();
   result=(num%5==0 && num%6==0);
   System.out.println("\nIs "+ num + " divisible by 5 and 6 ? "+ result);
   result=num%5==0 || num%6==0;
   System.out.println("\nIs "+ num + " divisible by 5 or 6 ? "+ result);
   result=num%5==0 ^ num%6==0;
   System.out.println("\nIs "+ num + " divisible by 5 or 6 , but not both ? "+ result);

   input.close();
  }

}
