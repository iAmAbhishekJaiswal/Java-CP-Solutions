
public class ConvertMillis{

 public static String convertMillis(long millis){
  long sec = millis/1000;
  long min = sec/60;
  long hour = min/60;
  return hour+":"+min+":"+sec;
 }

 public static void main(String[] args){
  System.out.println("5500 milli second = "+convertMillis(5500));
 }

}
