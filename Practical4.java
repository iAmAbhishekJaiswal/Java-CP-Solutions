public class Practical4 implements IF3{
 public static void main(String[] args)
 {
  System.out.println("Inside main()");
 System.out.println("i = "+i);
 System.out.println("j = "+j);
 System.out.println("k = "+k);


  for(int i=0;i<5;i++){
   MultithreadingDemo object =
    new MultithreadingDemo();
   object.start();
  }

 }

}


interface IF1{
  int i=1;
}

interface IF2{
  int j=2;
}

interface IF3 extends IF1,IF2{
 int k=3;
}

class MultithreadingDemo extends Thread{
 public void run(){
   try{
     //displaying the thread that is running
     System.out.println("Thread "+
     Thread.currentThread().getId() + 
     " is runing " );

   }

  catch(Exception e){
    System.out.println("Exception is caught ");
   }
 }

}
