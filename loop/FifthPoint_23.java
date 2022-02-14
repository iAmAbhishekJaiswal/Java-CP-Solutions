
 public class FifthPoint_23{
  public static void main(String[] args){
   int n=50000;
   double sum = 0;
   
   for(int i=1;i<=n;i++){
    sum += 1.0/i;
   }
   System.out.println("\nLeft to right execution : "+sum);
   for(int i=n;i>=1;i--){
    sum += 1.0/i;
   }
   System.out.println("\nRight to left Execution : "+sum);
  }
 }
