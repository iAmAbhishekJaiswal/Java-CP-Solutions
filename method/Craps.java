
public class Craps{
 public static int dice(){
  return  1+(int)(Math.random()*7);
 }

 public static void craps(){
  int dice1=dice();
  int dice2=dice();
  System.out.println("\nYou rolled "+dice1+ "+"+dice2+" : "+(dice1+dice2));
  if(dice1+dice2 == 2 || dice1+dice2 == 3 || dice1+dice2 == 12)
  System.out.println("\nYou lose ! ");
  else if(dice1+dice2 == 7 || dice1+dice2 == 11)
  System.out.println("\nYou win !");
  else{
  System.out.println("\nPoint is "+(dice1+dice2));
  crapsOrWin(dice1+dice2);
   }

 }

 public static void crapsOrWin(int n){
  int dice1 = dice();
  int dice2 = dice();
  if((dice1+dice2)==n){
  System.out.println("\nYou rolled "+dice1+ "+"+dice2+" : "+(dice1+dice2));
  System.out.println("\nYou won !");
  }
  else if((dice1+dice2)==7){
  System.out.println("\nYou rolled "+dice1+ "+"+dice2+" : "+(dice1+dice2));
  System.out.println("\nYou loss !");
  }
  else{
  System.out.println("\nPoint is "+(dice1+dice2));
  crapsOrWin(n);
  }
 }
  public static void main(String[] args){
   craps();
  }

}
