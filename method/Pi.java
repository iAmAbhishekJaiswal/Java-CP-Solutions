public class Pi{

 public static double computePi(int n)
 {
  double pi = 0;
  for(int i= 1; i<=n;i++)
  pi += Math.pow(-1,i+1)/(2*i-1);
  return pi*4;
 }

 public static void main(String[] args){
  System.out.printf(" %-10s %-5s\n","i","m(i)");
  for(int i=1;i<1000;i+=100)
  System.out.printf(" %-10d %-5.4f \n",i,computePi(i));
 }
}
