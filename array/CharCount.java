public class CharCount{
 public static void main(String[] args){
  char arr[];
  arr=createCharArray(100);
  System.out.println("\nRandom 100 character :- \n");
  printCharArray(arr);
  int[] count = countChar(arr);
  System.out.println("\n\nCharacter count :- ");
  printCount(count);
 }

 public static char[] createCharArray(int n){
  char[] ar=new char[n];
  for(int i=0;i<n;i++)
  ar[i]=RandomCharacter.getRandomLowerCaseLetter();
  return ar;
 }

 public static void printCharArray(char[] ar){
  for(int i=0;i<ar.length;i++)
  {
   if(i+1 % 20 == 0)
   System.out.println(ar[i]);
   else
   System.out.print(ar[i]+" ");
  }
 }

 public static int[] countChar(char[] ar){
  int count[] = new int[26];
  for(int i=0;i<ar.length;i++)
  count[ar[i]-'a']++;
  return count;
 }

 public static void printCount(int[] ar){
  for(int i= 0;i<ar.length;i++)
  System.out.println((char)(i +'a')+" = "+ar[i]);
 }
}
