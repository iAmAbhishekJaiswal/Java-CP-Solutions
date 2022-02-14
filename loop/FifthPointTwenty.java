
public class FiftyPointTwenty{
 public static void main(String[] args){
  int num,d,count=0;
  for(num=2; num<1000;num++){
   boolean isPrime=true;
   for(d=2;d<=num/2 ;d++){
    if(num%d==0){
    isPrime=false;
    break;
    }
   }
    if(isPrime){
      count++;
      if(count % 8 == 0)
      System.out.println(num);
      else
      System.out.print(num + " ");
   }

  }

 }
}
