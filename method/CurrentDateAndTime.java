public class CurrentDateAndTime{
 public static void main(String[] args){
  printCurrentTimeAndDate() ;
 }
 public static void printCurrentTimeAndDate(){
  long totalMillis = System.currentTimeMillis();
  long totalSec = totalMillis/1000;
  long currentSec = totalSec % 60;
  long totalMin = totalSec/60;
  long currentMin = totalMin %60+30;
  long totalHour = totalMin/60;
  long currentHour = totalHour % 24+5;
  long totalDay = totalHour/24;

  System.out.println("\n "+currentDate(totalDay)+
  " "+currentHour+":"+currentMin+":"+currentSec);
 }

 public static String currentDate(long totalDay){
  int totalLeapYear=0;
  int currentYear=1970;
  long totalYear = (long)(totalDay/365.25);
  for(int i=1;i<=(int)totalYear;i++)
  currentYear++;
  long remainDay=totalDay+1;
  for(int i=1970;i<2021;i++){
   if(isLeapYear(i))
   remainDay -= 366;
   else
   remainDay -=365;
  }
  String currentMonth ;
  long currentDay;
  if(remainDay<=31){
  currentMonth = "January";
  currentDay = remainDay;
  }
 else if(remainDay <= 59){
   currentMonth = "Febuary";
   currentDay = remainDay-31;
   }

  else if(remainDay <= 90){
   currentMonth = "March";
   currentDay = remainDay-59;
  }

   else if(remainDay <= 120){
    currentMonth = "April";
    currentDay = remainDay - 90;
   }

   else if(remainDay <= 151){
    currentMonth = "May";
    currentDay = remainDay - 120;
   }
   else if(remainDay <= 181){
    currentMonth = "June";
    currentDay = remainDay - 151;
   }

   else if(remainDay <= 212){
    currentMonth = "July";
    currentDay = remainDay - 181;
   }

   else if(remainDay <= 243){
    currentMonth = "August";
    currentDay = remainDay - 212;
   }

   else if(remainDay <= 273){
    currentMonth = "September";
    currentDay = remainDay - 243;
   }

   else if(remainDay <= 304){
    currentMonth = "Octuber";
    currentDay = remainDay - 273;
   }

   else if(remainDay <= 334){
    currentMonth = "November";
    currentDay = remainDay - 304;
   }

    else {
    currentMonth = "December";
    currentDay = remainDay - 334;
   }

  return (currentDay+"th"+" "+currentMonth+","+currentYear);
 }


 public static boolean isLeapYear(int year){
   return (year % 400 == 0 ||(year % 4 == 0 && year % 100 != 0));
  }
}
 
