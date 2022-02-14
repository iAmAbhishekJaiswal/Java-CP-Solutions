import java.util.*;

public class CylinderArea{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    final float pi = 3.14159f;
    float area,radius,length,volume;

    //input radius and length

    System.out.print("\nEnter radius of Cylinder : ");
    radius=input.nextFloat();

    System.out.print("\nEnter length of Cylinder : ");
    length = input.nextFloat();

    area = radius*radius*pi;

    volume = area*length;

    //Result

    System.out.println("\n\n Area : "+
    (int)(area*100)/100.00+ "m²\nVolume : "+(int)(volume*100)/100.00+
    "m³");

    input.close();
  }
}
