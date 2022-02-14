public class PentagonalNumber{
 public static void main(String[] args){
  final int NUMBER_PER_LINE = 10;
  for(int i = 1 ; i<=100 ; i++){
  if(i%NUMBER_PER_LINE == 0)
  System.out.println(getPentagonalNumber(i));
  else
  System.out.print(" "+getPentagonalNumber(i));
  }
 }

 public static int getPentagonalNumber(int n){
  return n*(3*n-1)/2;
 }


}
