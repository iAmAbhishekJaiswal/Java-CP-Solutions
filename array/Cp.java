 import java.util.*;

public class Cp{
 public static void main(String[] args){
Scanner input = new Scanner(System.in);

   // Taking input for size of array
   System.out.print("\nEnter size of array : ");
 int input1 = input.nextInt();

  int numbers[] = new int[input1];

  System.out.print("\nEnter "+input1 +" numbers : ");
 for(int i= 0; i<input1; i++)
   numbers[i] = input.nextInt();
  SelectionSort.selectionSort(numbers);

   System.out.print("\nEnter value of K (Third input) : ");
   int k = input.nextInt();

  if(k>0){
  int si= findMinDifference(numbers);
  System.out.print("{");
    for(int i=si+k-1; i>=si;i--){
   System.out.print(numbers[i]);
   if(i> si)
   System.out.print(",");
  }
  System.out.println("}");

  }

  else if(k==1)
  System.out.println("{"+numbers[0]+"}");
  }

  static int findMinDifference(int[] ar){
   int minDifference=Math.abs(ar[0]-ar[1]);
   int indx=0;
   for(int i=1; i<ar.length-1;i++)
   {
     if(Math.abs(ar[i] - ar[i+1])<minDifference)
      {
       minDifference=Math.abs(ar[i]-ar[i+1]);
       indx=i;

     }

  }
  return indx;
 }
}

class SelectionSort{
 public static void selectionSort(int[] ar){
  for(int i=0;i<ar.length;i++){
   int max = ar[i];
   int maxIndex=i;

    for(int j=i+1;j<ar.length;j++){
     if(ar[j]>max){
      max=ar[j];
      maxIndex=j;
     }
    }
   if(maxIndex!=i)
   {
    ar[maxIndex]=ar[i];
    ar[i]=max;
   }
  }
 }
}

