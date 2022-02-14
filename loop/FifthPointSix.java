public class FifthPointSix{
 public static void main(String[] args){
  System.out.println("Miles\t\tKilometers  |  Kilometers\t\tMiles");
  for(int i=1,j=20;i<=10;i++,j+=5)
  System.out.printf("%-5d\t\t%-10.3f  |  %-10d\t\t%-5.3f\n",i,(i*1.609f),j,(j*0.6215f));

 }
}

