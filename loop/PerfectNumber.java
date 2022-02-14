public class PerfectNumber{
 public static void main(String[] args){

  int num=0;
  System.out.print("\n Perfect number under 1000 : ");
  for(int i=6;i<10000;i++)
  {
   for(int j=1;j<i;j++)
   {
    if(i % j == 0){
    num += j;
    }
   }
   if(num == i){
   System.out.print(" "+i);
   }
   num=0;
  }
 }
}
