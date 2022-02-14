import java.util.*;

public class CreditValidation{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\n Enter a credit card number : ");
  long cardNumber = input.nextLong();
  if(isValid(cardNumber))
  System.out.println("\n "+cardNumber+" is Valid ! ");
  else
  System.out.println("\n "+cardNumber+" is Invalid ! ");

 }
 public static boolean isValid(long cardNum){
  int size = getSize(cardNum);

  boolean validity;
  if(size<13 || size>16)
  validity = false;

  else if(!(prefixMatch(cardNum,4) || prefixMatch(cardNum,5) || prefixMatch(cardNum,6) || prefixMatch(cardNum,37)))
  validity = false;

  else if((sumOfDoubleEvenPlace(cardNum)+sumOfOddPlace(cardNum) )% 10 != 0)
  validity = false;

  else
  validity = true;

  return validity;
 }

 public static int sumOfDoubleEvenPlace(long num){
  int count=0, sum=0;
  while(num>0)
   {
    count++;
    if(count%2==0)
    sum += getDigit((int)num%10*2);
    num/=10;
   }
  return sum+1;
 }

 public static int getDigit(int num){
  if(num <10)
   return num;
  else
   return num-9;
 }


 public static int sumOfOddPlace(long num){
  int count=1,sum=0;
  while(num>0)
 {
  if((count-1)%2 ==0)
  sum += num%10;
  count++;
  num/=10;
 }
  return sum;

 }

 public static boolean prefixMatch(long num,int n){
  String number = num+"";
  String prefix = n+"";
  if(number.startsWith(prefix))
  return true;
  else
  return false;

 }

 public static int getSize(long d){
  int size=0;
  while(d>0){
  d/=10;
  size++;
  }
  return size;
 }

}
 
