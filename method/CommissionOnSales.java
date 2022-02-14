public class CommissionOnSales{
 public static double computeCommission(double salesAmount){
  double commission;
  if(salesAmount<=5000)
  commission= salesAmount*0.08;
  else if(salesAmount<10000){
  commission=5000*0.08;
  commission += (salesAmount-5000)*0.10;
  }
  else{
  commission = 5000*0.08;
  commission += 5000*0.10;
  commission += (salesAmount-10000)*0.12;
  }
  return commission;
 }

 public static void main(String[] args){
  System.out.println(" Sales Amount     Commission ");
  System.out.println("                             ");
  for(int i=10000;i<=100000;i+=5000)
  System.out.printf(" %-12d     %-10.1f\n ",i,computeCommission(i));
 }


}
