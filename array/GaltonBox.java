import java.util.*;

public class GaltonBox{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\n Enter number of balls : ");
  int numBall=input.nextInt();
  System.out.print("\n Enter number of slot : ");
  int numSlot=input.nextInt();
  beanMachine(numBall,numSlot);

 }
 
 public static void beanMachine(int numBall, int numSlot){
  char[] path=new char[numSlot-1];
  int[] slots=new int[numSlot];
  int k;
  for(int i=0;i<numBall;i++){
   for(int j=0;j<path.length;j++){
    path[j] = findDirection();
   }
   System.out.print("\nPath of ball "+(i+1)+" : ");
   System.out.println(path);
   k=findSlot(path);
   slots[k]++;
  }

  System.out.println("\n Galton Box :- ");
  String temp;
  for(int i=numBall;i>0;i--)
  {
   temp="\t|";
   for(int j=0;j<slots.length;j++)
   {
     if(slots[j]>=i)
     temp+="o";
     else
     temp+=" ";
     temp+="|";
   }
   System.out.println(temp);
  }
 }

 public static char findDirection(){
  int i=(int)(Math.random()*2);
  if(i==0)
  return 'L';
  else
  return 'R';
 }

 public static int  findSlot(char[] path){
   int num=0;
   for(int i=0;i<path.length;i++){
   if(path[i]=='R')
   num++;
  }
  return num;
 }
}
