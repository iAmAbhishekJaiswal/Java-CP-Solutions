import java.util.*;

public class Distinct{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int num,distinct=0;
  int numbers[] = new int[10];
  boolean repeat = false;
  for(int i=0;i<10;i++){
   repeat=false;
   num = input.nextInt();
   for(int j=0;j<=i;j++){
    if(numbers[j]==num)
     repeat=true;
   }
  if(repeat)
  continue;
  numbers[distinct]=num;
  distinct++;
  }
  System.out.println("\nTotal distinct number : "+distinct);
  System.out.println(Arrays.toString(numbers));
  input.close();
 }
}
