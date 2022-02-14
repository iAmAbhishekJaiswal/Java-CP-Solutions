import java.util.*;

public class Reverse{
 public static void reverse(int[] list){
  int temp;
  for(int i=0,j=list.length-1;i<j;i++,j--){
   temp = list[i];
   list[i]=list[j];
   list[j]=temp;
  }
 }

 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int[] numbers = new int[10];
  System.out.print("\nEnter 10 numbers : ");
  for(int i=0;i<10;i++)
  numbers[i]=input.nextInt();

  input.close();
  System.out.println("\nBefore reverse :- \n"+
  Arrays.toString(numbers));

  reverse(numbers);

  System.out.println("\nAfter reverse :- \n"+
  Arrays.toString(numbers));
 }
}
