public class FifthPointSeven{
 public static void main(String[] args){
  double tuition = 10000;
  for(int i=0;i<10;i++){
   tuition = tuition * 1.05;
  }
  System.out.printf("Tuition after ten years : %.2f\n",tuition);
  double sum=0;
  for(int i=0;i<4;i++){
   sum += tuition;
   tuition = tuition * 1.05;
  }
  System.out.printf("Total cost of four year : %.2f ",sum);

 }
}
