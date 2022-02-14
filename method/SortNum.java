import java.util.*;

public class SortNum{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\n Enter three interger : ");
  int num1 = input.nextInt();
  int num2 = input.nextInt();
  int num3 = input.nextInt();
  input.close();
  displaySorted(num1,num2,num3);

 }
 public static void displaySorted(int a, int b, int c){
  int x,y,z;
  if(a>b && a>c){
  x=a;
   if(b>c){
   y=b;
   z=c;
   }
   else{
   z=b;
   y=c;
   }
  }

  else if(b>a && b>c)
  {
    x=b;
    if(a>c){
    y=a;
    z=c;
     }
    else{
    y=c;
    z=a;
   }
  }
  else{
   x=c;
   if(a>b){
   y=a;
   z=b;
   }
   else{
   y=b;
   z=a;
   }
  }
  System.out.println("\nSorted Number : "+z+","+y+","+x);
 }

}

