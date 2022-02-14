public class OverloadingExample{
 public static void main(String[] args){
  System.out.println("The maximum of 3 and 4 is "+max(3,4));

  System.out.println("The maximum of 5.6 and 6.5 is "+max(5.6,6.5));

 }

 public static double max(int a , double b){
  System.out.println("hey");
  if(a > b)
  return a;
  else
  return b;
 }
 public static double max(double a , double b){
  if(a > b)
  return a;
  else
  return b;

 }

}
