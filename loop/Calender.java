import java.util.*;

public class Calender{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  System.out.print("\n\nEnter a year : ");
  int year = input.nextInt();

  System.out.print("Enter day of 1 January ( eg. 0 for sunday) : ");
  byte startDay= input.nextByte();
  input.close();

  System.out.printf("\n\n%24s\n","January "+year);//January
  for(int i=0;i<36;i++)
  System.out.print("_");
  System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

  for(int i=1;i<=startDay;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=31;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
 }

 System.out.printf("\n\n\n\n%24s\n","Febuary "+year);//Febuary
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=28;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");}
}


 System.out.printf("\n\n\n\n%24s\n","March "+year);//March
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=31;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
}


 System.out.printf("\n\n\n\n%24s\n","April "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=30;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
}


  System.out.printf("\n\n\n\n%24s\n","May "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=31;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
  }


  System.out.printf("\n\n\n\n%24s\n","June "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=30;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
  }


  System.out.printf("\n\n\n\n%24s\n","July "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=31;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
}

  System.out.printf("\n\n\n\n%24s\n","August "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=31;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
 if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
}

  System.out.printf("\n\n\n\n%24s\n","September "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=30;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
  }


  System.out.printf("\n\n\n\n%24s\n","Octuber "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=31;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
  }


  System.out.printf("\n\n\n\n%24s\n","November "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=30;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
  }

 System.out.printf("\n\n\n\n%24s\n","December "+year);
 for(int i=0;i<36;i++)
  System.out.print("_");
 System.out.printf("\n\n%5s%5s%5s%5s%5s%5s%5s\n","Sun", "Mon","Tue","Wed","Thu","Fri","Sat");

 for(int i=1;i<=startDay%7;i++)
  {
   System.out.printf("%5s","");
  }
  for(int i=1;i<=31;i++)
  {
  System.out.printf("%5d",i);
  startDay++;
  if(startDay == 7){
  startDay=0;
  System.out.println("");
  }
 }
 System.out.println("\n\n");
 }
}
