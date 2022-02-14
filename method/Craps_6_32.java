
public class Craps_6_32{
 public static int dice(){
  return  1+(int)(Math.random()*7);
 }

 public static boolean craps(){
  int dice1=dice();
  int dice2=dice();
  if(dice1+dice2 == 2 || dice1+dice2 == 3 || dice1+dice2 == 12)
  return false;
  else if(dice1+dice2 == 7 || dice1+dice2 == 11)
  return true;
  else
  return crapsOrWin(dice1+dice2);

 }

 public static boolean crapsOrWin(int n){
  int dice1 = dice();
  int dice2 = dice();
  boolean result;
  if((dice1+dice2)==n)
  result=true;
  else if((dice1+dice2)==7)
  result=false;
  else{
  result=crapsOrWin(n);
  }
  return result;
 }
  public static void main(String[] args){
   int count=0;
   for(int i=0;i<10000;i++){
   if(craps())
    count++;
   }
   System.out.println("\n "+count+" games won in 10000 game");
  }

}
