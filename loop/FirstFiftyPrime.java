public class FirstFiftyPrime{
 public static void main(String[] args){
  int number=2,count=0;
  final int TOTAL_PRIME_NUMBER=50;
  final int TOTAL_PRIME_NUMBER_IN_LINE = 10;

  while(count != TOTAL_PRIME_NUMBER){
   boolean isPrime=true;
   for(int divisor=2;divisor <= number/2 ; divisor++){
    if(number % divisor == 0){
     isPrime=false;
     break;
    }
   }
   if(isPrime){
    count++;
    if(count % TOTAL_PRIME_NUMBER_IN_LINE == 0)
    System.out.println(number);
    else
    System.out.print(number+" ");
   }
   number++;
  }
 }
}
