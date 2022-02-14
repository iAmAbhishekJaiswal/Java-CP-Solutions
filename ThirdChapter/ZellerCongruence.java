
import java.util.*;

public class ZellerCongruence{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  int year,h,q,m,k,j;

  System.out.print("\nEnter year (eg. 2021) : ");
  year=input.nextInt();

  j=year/100;
  k=year%100;

  System.out.print("\nEnter month (1-12) : ");
  m=input.nextInt();
  if(m==1 || m==2)
  m+=12;

  System.out.print("\nEnter the day of the month (1-31) : ");
  q=input.nextInt();

  h=(q+(26*(m+1)/10)+k+(k/4)+(j/4)+(5*j))%7;

  System.out.println("\n");

  switch(h)
  {
   case 0: System.out.println("Day of the week is " +
    	   "Saturday ! \n");
	   break;

   case 1: System.out.println("Day of the week is " +
           "Sunday ! \n");
           break;

   case 2: System.out.println("Day of the week is " +
           "Monday ! \n");
           break;

   case 3: System.out.println("Day of the week is " +
           "Tuesday ! \n");
           break;

   case 4: System.out.println("Day of the week is " +
           "Wednesday! \n");
           break;

   case 5: System.out.println("Day of the week is " +
           "Thursday ! \n");
           break;

   case 6: System.out.println("Day of the week is " +
           "Friday ! \n");
           break;
  }
  input.close();
 }
}
