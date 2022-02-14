import java.util.*;

public class DecToHex{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter a hex code : ");
  String hexCode = input.nextLine();
  input.close();
  System.out.println("Decimal for "+hexCode + " is "+hexToDec(hexCode.toUpperCase()));

 }

 public static int hexToDec(String hex){
  int deciNumber=0;
  for(int i=0;i<=hex.length()-1;i++){
   deciNumber = deciNumber*16+hexCharToDec(hex.charAt(i)); 
  }
  return deciNumber;
 }

 public static int hexCharToDec(char hexChar){
  if(hexChar>='A' && hexChar <= 'F')
  return hexChar-'A'+10;
  else
  return hexChar - '0';

 }

}
