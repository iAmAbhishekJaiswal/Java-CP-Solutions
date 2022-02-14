import java.util.*;

public class CountNumber{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int[] numbers = new int[100];
  System.out.print("\n Enter number between 1 to 100 : ");
  int num=-1,i=0;
  while(num != 0)
  {
   numbers[i]=input.nextInt();
   num = numbers[i];
   i++;
  }

  countNumber(numbers);
 }

 public static void countNumber(int[] list){
  int num[]=new int[100];
  int count[]=new int[100];
  for(int i=0;i<list.length;i++){
    for(int j=0;j<num.length;j++){
     if(num[j]==list[i]){
     count[j]++;
     continue;
    }
   }
   num[i] = list[i];
   count[i]++;
   }
   for(int i=0;i<num.length;i++)
   System.out.println(num[i]+" = "+count[i]);
  }


}
