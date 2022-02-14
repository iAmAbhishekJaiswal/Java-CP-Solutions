public class RandomMonth{
   public static void main(String[] args)
   {
    byte month=(byte)(Math.random()*12);
    switch(month)
    {
     case 0: System.out.println("\nJanuary");
             break;
     case 1: System.out.println("\nFebuary");
             break;
     case 2: System.out.println("\nMarch");
             break;
     case 3: System.out.println("\nApril");
             break;
     case 4: System.out.println("\nMay");
             break;
     case 5: System.out.println("\nJune");
             break;
     case 6: System.out.println("\nJuly");
             break;
     case 7: System.out.println("\nAugust");
             break;
     case 8: System.out.println("\nSeptember");
             break;
     case 9: System.out.println("\nOctuber");
             break;
     case 10: System.out.println("\nNovember");
             break;
     case 11: System.out.println("\nDecember");
             break;
     default: System.out.println("\nLogic Error");

     }
   }
}
