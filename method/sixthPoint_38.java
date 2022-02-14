public class sixthPoint_38{
 public static void main(String[] args){
  final int TOTAL_CHAR = 100;
  final int PER_LINE = 10;

  for(int i=1;i<=TOTAL_CHAR ;i++)
  {
   if(i%PER_LINE==0)
    System.out.println(RandomCharacter.getRandomUpperCaseLetter());
   else
    System.out.print(RandomCharacter.getRandomUpperCaseLetter());
 }
  System.out.println("\n");
  for(int i=1;i<=TOTAL_CHAR ;i++)
  {
   if(i%PER_LINE==0)
    System.out.println(RandomCharacter.getRandomDigitCharacter());
   else
    System.out.print(RandomCharacter.getRandomDigitCharacter());
 }
 }


}
