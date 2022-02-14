public class PrintChar{
 public static void printChar(char ch1, char ch2, int numberPerLine){
  for(int i=(int)ch1,count=1;i<=(int)ch2;i++,count++){
   if(count % numberPerLine == 0)
   System.out.println((char)i);
   else
   System.out.print((char)i+" ");
  }

 }

 public static void main(String[] args){
  System.out.println(" Character between 1 to Z");
  printChar('1','Z',10);

 }
}
