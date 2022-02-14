public class MersennePrime{

 public static boolean isPrime(long num){
  for(int i=2;i<=num/2;i++){
   if(num % i == 0)
    return false;
  }
  return true;
 }

 public static void main(String[] args){
  int i=2;
  System.out.println(" i      2^p-1 \n________________\n");
  while(i<=31)
   {
    if(isPrime((long)Math.pow(2,i)-1)){
     System.out.printf(" %-6d %-6d\n",i,(long)Math.pow(2,i)-1);
    }//outer if closed
   i++;
   }//while loop closed
  }//main close


}
