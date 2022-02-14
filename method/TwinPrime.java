public class TwinPrime{
 public static boolean isPrime(int num){
  for(int i=2;i<=num/2;i++){
   if(num % i == 0)
    return false;
  }
  return true;
 }

public static void main(String[] args){
  int i=2;
  while(i<=1000)
   {
   if( isPrime(i) && isPrime(i+2)){
    System.out.println("("+i+","+(i+2)+")");
   }//outer if closed
    i++;
   }//while loop closed
  }//main close

}
