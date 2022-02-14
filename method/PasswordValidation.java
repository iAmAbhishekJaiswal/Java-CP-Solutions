import java.util.*;

public class PasswordValidation{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("\nEnter a password : ");
  String pass = input.nextLine();
  input.close();

  if(isValid(pass))
  System.out.println("\nValid Password \n");
  else
  System.out.println("\nInvalid Password\n");

 }//main() close

 public static boolean isValid(String password){
 boolean validation=true;  
 int digitCount=0;
if(password.length() < 8)
  return false;
  else{
   for(int i=0;i<=password.length()-1;i++){
    if(password.charAt(i) >= '0' && password.charAt(i)<= '9')
    digitCount++;
    if(! isCharValid(password.charAt(i)))
    return false;
   }//for loop close
   if(digitCount>=2)
   return true;
   else
   return false;
  }//else close
 }//isValid() close

 public static boolean isCharValid(char ch){
  if((ch>='0'&&ch<='9') ^ (ch>='A' && ch<='Z') ^ (ch>='a' && ch <= 'z'))
  return true;
  else
  return false;
 }
}//class close

