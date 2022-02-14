import java.util.*;

public class SortQues{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  // Taking input for size of array
  System.out.print("\nEnter size of array : ");
  int size = input.nextInt();

  int numbers[] = new int[size];

  System.out.print("\nEnter "+size+" numbers : ");
  for(int i= 0; i<size; i++)
   numbers[i] = input.nextInt();

  //checking array is sorted or not
  for(int i=1;i<size;i++){
   if(numbers[i-1]>numbers[i])
   {
    System.out.println("Array is not sorted in ascending order ! ");
    Arrays.sort(numbers);
   }
  }

  System.out.println(Arrays.toString(numbers));

 }

}
