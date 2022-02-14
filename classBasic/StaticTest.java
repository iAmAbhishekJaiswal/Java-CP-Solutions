class StaticTest{
 public static void main(String[] args){
    StaticTest obj= new StaticTest();
    obj.fun();
 }
 
  void fun(){
    X.display();
    X obj = new X();
    System.out.print(" "+obj.name+"\n");
  }
}
 class X{
  String name="Abhi";
   static void display(){
    System.out.println("hey");
  }

}
