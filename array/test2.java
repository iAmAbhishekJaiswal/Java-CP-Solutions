public class test2{
 public static void main(String[] args){
  int[] list = {1,2,3,4,5};
  reverse(list);
  for(int i=0;i<list.length;i++){
   System.out.print(" "+list[i]);
  }
   System.out.println('a'+2);
 }
 public static void reverse(int[] list){
  int[] result = new int[list.length];
  for(int i=0;i<list.length;i++)
  result[i] = list[list.length-1-i];

  list = result;
 }
}
