import java.util.*;

public class OrderCityName{

  public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   String city1,city2,city3,order1,order2,order3;

   System.out.print("\nEnter name of first city : ");
   city1 = input.nextLine();

   System.out.print("\nEnter name of second city : ");
   city2 = input.nextLine();

   System.out.print("\nEnter name of third city : ");
   city3 = input.nextLine();

   if(city1.compareToIgnoreCase(city2)<0 && city1.compareToIgnoreCase(city3)<0)
    {
     order1=city1;
     if(city2.compareToIgnoreCase(city3) < 0)
     {
      order2=city2;
      order3=city3;
     }
     else
     {
      order2=city3;
      order3=city2;
     }

    }
  else if(city2.compareToIgnoreCase(city1)<0 && city2.compareToIgnoreCase(city3)<0)
   {
    order1=city2;
    if(city1.compareToIgnoreCase(city3)<0)
    {
     order2=city1;
     order3=city3;
    }
    else
    {
     order2=city3;
     order3=city1;
    }
   }
  else
   {
    order1=city3;
    if(city1.compareToIgnoreCase(city2)<0)
    {
     order2=city1;
     order3=city2;
    }
    else
    {
     order2=city2;
     order3=city1;
    }
   }

   System.out.printf("\nThe three cities in alphabetical order are %s %s %s .\n",order1,order2,order3);
   input.close();
  }
}

