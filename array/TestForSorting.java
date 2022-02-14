import java.util.*;

public class TestForSorting{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("\nEnter length of array : ");
  int n = input.nextInt();
  int[] list = new int[n];

  System.out.print("\nEnter "+n+" number for array : ");
  for(int i=0;i<list.length;i++)
  list[i]= input.nextInt();

  //before sorting
  System.out.println("\nBefore Sorting :- ");
  System.out.println(Arrays.toString(list));

  Arrays.sort(list);
  //after sorting
  System.out.println("\nAfter Sorting :- ");
  System.out.println(Arrays.toString(list)+"\n\n");

 }

  public static void printArray(int[] ar){
   System.out.println("\n");
   for(int i=0;i<ar.length;i++)
   System.out.print(ar[i]+"\t");
  }
}
