import java.util.*;

public class MinuteToYear{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Minutes : ");
    long minute=input.nextLong();

    double year,days;

    year=minute/(60*24*365.0);
    days=(year-(int)year)*365;

    System.out.println("Year : "+(int)year+
   " \n Days : " + (int)days);

   input.close();
  }

}
