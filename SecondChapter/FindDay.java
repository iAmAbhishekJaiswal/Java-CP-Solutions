import java.util.Scanner;

public class FindDay
{
  public static void main(String[] args)
  {
    Scanner input= new Scanner(System.in);
    int today, days;

    System.out.print("Enter today : ");
    today=input.nextInt();

    System.out.print("Enter days : ");
    days=input.nextInt();

    System.out.println((today+days)%7);
    input.close();
   }
}
