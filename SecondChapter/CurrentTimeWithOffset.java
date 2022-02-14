import java.util.*;

public class CurrentTimeWithOffset{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    byte offsetHour, offsetMinute;
    System.out.print("Enter offset hour : ");
    offsetHour=input.nextByte();

    System.out.print("Enter offset minute : ");
    offsetMinute=input.nextByte();
    
    long totalSecond=System.currentTimeMillis()/1000;
    long currentSecond=totalSecond%60;

    long totalMinute=totalSecond/60;
    long currentMinute=totalMinute%60+offsetMinute;

    long totalHour=totalMinute/60;
    long currentHour=totalHour%24+offsetHour;

    System.out.println("\nCurrent Time :- "+
    currentHour+ ":"+currentMinute+":"+
    currentSecond);

    input.close();
  }
}
