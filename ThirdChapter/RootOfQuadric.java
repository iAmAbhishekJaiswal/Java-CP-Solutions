import java.util.*;

public class RootOfQuadric{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
  double a,b,c,root1,root2,discriminant;
  System.out.print("\n Enter a,b,c : ");
  a=input.nextDouble();
  b=input.nextDouble();
  c=input.nextDouble();

  discriminant = b * b - 4 * a * c;

  if(discriminant>0)
  {
   root1= (-b+Math.pow(discriminant,0.5))/2*a;
   root2 = (-b-Math.pow(discriminant,0.5))/2*a;
   System.out.println("Quadric equation have 2 roots : "+ root1+ " and " +root2);
  }

  else if(discriminant == 0)
  {
   root1 = -b/2*a;
   System.out.println("\nQuadric equation has one root : "+ root1);
  }

  else
  System.out.println("\nQuadric equation has no real root ! ");

  input.close();
  }
}
