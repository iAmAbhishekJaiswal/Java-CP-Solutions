import java.util.*;

public class BinarySearch{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\n Enter number to find : ");
  int n=input.nextInt();
  int[] ar = {2,4,5,7,10,12,25,29,33,54,78,112,161};
  int i=binarySearch(ar,n);
  if(i>=0)
  System.out.println("data is available at "+i+" index !");
  else
  System.out.println("Data not found but data can insert at "+ (-1*(i+1))+" index ! ");

 }

 public static int binarySearch(int[] arr,int num){
  int low = 0;
  int high = arr.length-1;
  while(high>=low){
  int mid = (low+high)/2;
  if(num<arr[mid])
  high=mid-1;
  else if(num == arr[mid])
  return mid;
  else
  low = mid+1;
  }
  return -low-1;
  
 }
}
