import java.util.*;

public class Format{
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("\nEnter a integer : ");
  int num = input.nextInt();
  System.out.print("\nEnter width : ");
  int width = input.nextInt();

  System.out.println("\n"+format(num,width));

 }

 public static String format(int num, int width){
  String number = num+"";
  String result = number;
   if(number.length()>=width)
    return number;
   else{
    for(int i=0;i<(width-number.length());i++){
    result = '0'+result;
    }

    return result;
   }
 }


}
