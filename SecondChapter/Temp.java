import java.util.*;

public class Temp{

  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
    double celcius,fahrenheit;
    System.out.print("\nEnter temperature"+
  " in Celcius : ");
    celcius=input.nextDouble();

    fahrenheit=(9.0/5)*celcius+32;

    //Result
    System.out.println("\n\n"+celcius+
    " Celcius is "+(int)(fahrenheit*100)/100.00+" Fahrenheit.");

    input.close();
  }
}
