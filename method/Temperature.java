

 public class Temperature{

  public static double fahrenheitToCalcius(double fahrenheit){
   double calcius;
   calcius = (5.0/9)*(fahrenheit-32);
   return calcius;
  }

  public static double calciusToFahrenheit(double calcius){
   double fahrenheit;
   fahrenheit= (9.0/5)*calcius+32;
   return fahrenheit;
  }

  public static void main(String[] args){
   System.out.println(" Calcius    Fahrenheit  |  Fahrenheit    Calcius");
   System.out.println("______________________________________________");
   for(float i=40,j=120;i>30 && j>20;i--,j-=10)
   System.out.printf(" %-7.1f    %-10.1f  |  %-10.1f    %-7.2f\n",i,calciusToFahrenheit(i),j,fahrenheitToCalcius(j));

  }
 }
