public class FifthPoint_26{
 public static void main(String[] args){
  double pi ,sum=0;

  for(int i=1;i<=100000;i++)
  sum  += Math.pow(-1,i+1)/(2.0*i-1);

  pi= 4 * sum;
  System.out.println(" π : "+pi);
 }
}
