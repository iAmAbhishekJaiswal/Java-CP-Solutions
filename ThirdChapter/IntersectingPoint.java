import java.util.*;

public class IntersectingPoint{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double x1,x2,x3,x4,y1,y2,y3,y4,x,y;
    double a,b,c,d,e,f;

    System.out.print("\nEnter x1,y1,x2,y2,x3,y3,x4,y4 : ");
    x1=input.nextDouble();
    y1=input.nextDouble();

    x2=input.nextDouble();
    y2=input.nextDouble();

    x3=input.nextDouble();
    y3=input.nextDouble();

    x4=input.nextDouble();
    y4=input.nextDouble();

    a=y1-y2;
    b=x1-x2;
    c=y3-y4;
    d=x3-x4;
    e=(y1 -y2)*x1 -(x1 -x2)*y1;
    f=(y3 -y4)*x3 -(x3 -x4)*y3;


    if(a*d-b*c == 0)
    {
     System.out.println("\nThe two line are parallel\n");
    }
    else
    {
     x= (e*d - b*f)/(a*d-b*c);
     y=(a*f-e*c)/(a*d-b*c);
     System.out.println("\nThe intersecting point at ("+x+","+y+")\n");
    }
     input.close();
 }
}
