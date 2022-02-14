
import java.util.*;

public class Calender{
 public static void main(String[] args){


  int month, year, choice;
  Scanner input = new Scanner(System.in);
  do{
  System.out.print("\n          Calender App            \n");
  System.out.print("\n 1. Print Whole Year \n 2. Print Specific Month \n 3. Exit \n Choose any option : ");
  choice = input.nextInt();
  switch(choice)
  {
   case 1 : System.out.print("\nEnter a year : ");
  year = input.nextInt();
  for(int i=1;i<=12;i++)
  printMonth(year,i);
  break;
   case 2 : System.out.print("\nEnter a year : ");
  year = input.nextInt();
  System.out.print("\nEnter month ( 1-12 ) : ");
  month = input.nextInt();
  if(year<1800 || month<1 || month>12)
  System.exit(1);
  else
  printMonth(year,month);
 }}while(choice != 3);
 }

 public static void printMonth(int year , int month){
  //it print header part of month and year
  printMonthTitle(year,month);

  //It print body part of month i.e.1-31
  printMonthBody(year,month);

 }

 public static void printMonthTitle(int year, int month){
  //we need to get month name 
  String monthName = getMonthName(month);

  //Now print header part of month

  System.out.printf("\n\n%20s  %s",monthName,year);
  System.out.printf("\n  __________________________________  \n");
  System.out.println("\n   Sun  Mon  Tue  Wed  Thu  Fri  Sat \n");

 }

 public static String getMonthName(int month){
  String monthName= "";
  switch(month){
   case 1:monthName="January"; break;
   case 2:monthName="Febuary"; break;
   case 3:monthName="March"; break;
   case 4:monthName="April"; break;
   case 5:monthName="May"; break;
   case 6:monthName="June"; break;
   case 7:monthName="July"; break;
   case 8:monthName="August"; break;
   case 9:monthName="September"; break;
   case 10:monthName="Octuber"; break;
   case 11:monthName="November"; break;
   case 12:monthName="December";
  }
  return monthName;
 }

 public static void printMonthBody(int year, int month){
  final int START_DAY_OF_JAN_1800 = 3;
  int startDay = (START_DAY_OF_JAN_1800 + getTotalDay(year,month) )%7;
  int i=0;

  //For space which start 1 from specific day
  for(i = 0;i<startDay;i++)
  System.out.printf("%5s","");

  //To print 1 to days is month( get by getTotalDayInMonth() method
  for(i=1;i<=getTotalDayInMonth(year,month);i++){

  System.out.printf("%5d",i);
  if((i+startDay)%7 ==0)
  System.out.println("");
  }
  System.out.println("\n");
 }

 public static int getTotalDay(int year, int month){

 int totalDay = 0,i;
  for(i=1800;i<year;i++){
   if(isLeapYear(i))
   totalDay += 366;
   else
   totalDay += 365;
  }
  //Now add prior days from month
  for(i=1;i<month;i++)
  totalDay = totalDay + getTotalDayInMonth(year,i);

  return totalDay;
 }

 public static int getTotalDayInMonth(int year,int month){
  if(month == 1 || month== 3 ||month == 5 ||
     month == 7 || month == 8 || month == 10 ||
     month == 12 )
   return 31;

  else if(month == 4|| month == 6 || month == 9
          || month == 11)
   return 30;

   else
   {

    if(isLeapYear(year))
    return 29;
    else
    return 28;

   }
  }

  public static boolean isLeapYear(int year){
   return (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0));
  }
}
