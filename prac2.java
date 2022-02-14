public class Practical3{

 int a,b;

 void increment(int x, int y){
  x++;
  y++;
 }

 void increment(Practical3 obj){
  obj.a++;
  obj.b++;
 }

 public static void main(String[] args){
  int a=4;
  int b=5;
  Practical3 obj1= new Practical3();
  obj1.increment(a,b);
  System.out.println(a +" , " + b);
  obj1.a=2;
  obj1.b=3;
  obj1.increment(obj1);
  System.out.println(obj1.a +" , " + obj1.b);




 }
}
