import java.util.Scanner;

public class CircleArea
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius : ");
    double radius=input.nextDouble();
    double area=radius*radius*3.14159;
    System.out.println("The area of circle of radius "+
    radius+ "is" + area);
    input.close();
  }
}
