import java.util.Scanner;

public class Average
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    System.out.print("Enter three number : ");

    //Input 3 number

    double a=input.nextDouble();
    double b=input.nextDouble();
    double c=input.nextDouble();

    double aver= (a + b + c)/3;

   //Result Print

   System.out.println("Average of " + a + ","+b+" & "+c+" is "+aver);
   input.close();
  }

}
