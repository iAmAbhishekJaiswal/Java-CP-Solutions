public class SumSeries{
 public static double sumOfSeries(int num){
  double sum = 0;
  for(int i=1;i<=num;i++)
  sum+= i/(i+1.0);
  return sum;
 }
 public static void main(String[] args){
  System.out.println(" i           m(i) ");
  System.out.println("                  ");
  for(int i= 1;i<=20;i++)
  System.out.printf(" %-11d %-9.4f\n",i,sumOfSeries(i));

 }
}
