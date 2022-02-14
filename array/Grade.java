import java.util.*;

public class Grade{

 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("\nEnter number of student : ");
  int size= input.nextInt();
  int numbers[] = new int[size];

  System.out.print("\nEnter score of "+size+" students : ");
  for(int i=0; i<size;i++)
  numbers[i]=input.nextInt();

  int best = max(numbers);
  for(int i=0;i<size;i++)
  System.out.println(" student "+(i+1)+" score is "+numbers[i]+
  " and grade is "+grade(numbers[i],best));

 input.close();
 }
  public static char grade(int number,int best){
  if(number>=best-10)
  return 'A';
  else if(number>=best-20)
  return 'B';
  else if(number>=best-30)
  return 'C';
  else if(number>=best-40)
  return 'D';
  else
  return 'F';
 }

 public static int max(int[] list){
  int best = list[0];
  for(int i=1;i<list.length;i++){
   if(list[i]>best)
   best=list[i];
  }
  return best;
 }

}
