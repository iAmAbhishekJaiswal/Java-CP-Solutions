import java.util.*;

public class SortCharacter{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter a string : ");
  String msg=input.next();
  input.close();
  int chInt[]=new int[msg.length()];
  char ch[]=new char[msg.length()];
  for(int i=0;i<msg.length();i++){
   chInt[i]=(int)msg.charAt(i);
  }
  SelectionSort.selectionSort(chInt);
  for(int i=0;i<chInt.length;i++){
  ch[i]=(char)chInt[i];
  }
  String output = new String(ch);
  System.out.println("Sorted string : "+output);

 }
}
