public class Calculator{
 public static void main(String[] args){
  if(args.length != 3){
   System.out.println("\n Usage : java Calculator operand1 operator operand \n");
   System.exit(0);
  }

  int result=0 ;

  switch(args[1].charAt(0))
  {
    case '+' : result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
     		break;
    case '-' : result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                break;
    case 'x' : result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
    case '/' : result = (int)(Integer.parseInt(args[0]) / (float)Integer.parseInt(args[2]));
                break;
    }

  System.out.println("\n\n "+args[0]+ " "+args[1]+" "+args[2]+" = "+result+"\n");
 }
}
