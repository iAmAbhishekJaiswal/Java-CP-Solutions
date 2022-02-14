import java.util.*;

public class PoundToKg{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    float pound,kg;

    System.out.print("Enter weight in pound : ");
    pound = input.nextFloat();

    kg = pound*0.454F;

    System.out.println("\n "+pound+" pound = "+
    kg + " Kg");

    input.close();
  }
}
