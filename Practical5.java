public class Main{
 public static void main(String[] args){
  Base b = new Derived();
  b.fun();

  Demo obj= new Demo();
  obj.fun1();

}
}

abstract class Base{
 abstract void fun();
}

final class Demo{
 void fun1(){
   System.out.println("Access final class " );
 }
}


class Derived extends Base{
 void fun(){

  System.out.println("Derived fun() called");

 }

}


