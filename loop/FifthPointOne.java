import java.util.*;

public class FifthPointOne{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  int positiveCount=0,negativeCount=0,num;
  float sum=0,average; 
  System.out.print("Enter an integer, the"+
    " input ends if it 0 : ");
    num = input.nextInt();

 while(num!=0){
    if(num>0)
    positiveCount++;
    else
    negativeCount++;

    sum += num;
    System.out.print("Enter an integer, the"+
    " input ends if it 0 : ");
    num = input.nextInt();
   }
   average = sum/(positiveCount+negativeCount);
   System.out.println("\nThe number "+
   "of positives is "+positiveCount);
   System.out.println("The number of negatives is "+
   negativeCount);
   System.out.println("The total is "+sum);
   System.out.println("The average is "+average);
   input.close();
 }
}
