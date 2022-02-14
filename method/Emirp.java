public class Emirp{

 public static int reverse(int n){
   int rev= 0;
   while(n>0){
    rev *= 10;
    rev += n%10;
    n /= 10;
  }
   return rev;
 }

 public static boolean isPalindrome(int num){
   if(num == reverse(num))
   return true;
   else
   return false;
 }

 public static boolean isPrime(int num){
  for(int i=2;i<=num/2;i++){
   if(num % i == 0)
    return false;
  }
  return true;
 }

 public static void main(String[] args){
  int count = 0,i=2;
  while(count<=100)
   {
   if(!isPalindrome(i) && isPrime(i) && isPrime(reverse(i))){
    count++;
    if(count %10 ==0)
    System.out.println(i);
    else
    System.out.print(i+" ");
   }//outer if closed
   i++;
   }//while loop closed
  }//main cl





}
