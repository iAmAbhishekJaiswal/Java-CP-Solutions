import java.util.*;

public class Average{
 public static int average(int[] list){
  int ave=0;
  double ave1=0;
  for(int i=0;i<list.length;i++)
  ave += list[i];
  ave/= list.length;
  return ave;
 }
 public static double average(double[] list){
  double ave=0;
  for(int i=0;i<list.length;i++)
  ave += list[i];
  ave /= list.length;
  return ave;
 }

 public static void main(String[] args){
  int ave;
  double ave1;
  Scanner input = new  Scanner(System.in);
  System.out.print("\nEnter length of array : ");
  int n = input.nextInt();
  int[] num = new int[n];
  double[] num1 = new double[n];
  System.out.print("\n Enter "+n+" integer numbers : ");
  for(int i=0;i<n;i++)
  num[i]=input.nextInt();

  System.out.print("\n Enter "+n+" floating numbers : ");
  for(int j=0; j<n; j++)
  num1[j] = input.nextDouble();

  ave=average(num);
  ave1=average(num1);

  System.out.println("\n Double average : "+ave1+
   "\n Interger average : "+ave);
 }


}

