import java.util.*;

public class countNumber{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int[] num= new int[100];

  System.out.print("\nEnter number between 1 to 100 : ");
  int i=0, n=-1;
  while(n!=0){
   num[i]=input.nextInt();
   n=num[i];
   i++;
  }
  countNum(num);
 }

 public static void countNum(int[] list){.
  int[] num = new int[100];
  int[] count = new int[100];
  boolean repeated = false;
  for(int i=0;list[i]!=0;i++){
   for(int j=0;j<i;j++){
    if(num[j]==list[i]){
    count[j]++;
    repeated = true;
    break;
    }
   }
   if(repeated)
   continue;
   num[i]=list[i];
   count[i]++;
  }
  int i=0;
  while(num[i] != 0){
  if(count[i] > 1)
  System.out.println(num[i]+" repeated "+count[i]+" times.");
  else
  System.out.println(num[i]+" repeated "+count[i]+" time. ");
  i++;
  }
 }
}
