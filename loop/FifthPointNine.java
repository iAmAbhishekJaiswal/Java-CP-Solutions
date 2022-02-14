import java.util.*;

public class FifthPointNine{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String name,highest="",secondHighest="";
  float highScore=0 ,secondHighScore=0;
  int numberOfStudent;
  float score;

   System.out.print("Enter number of students : ");
   numberOfStudent = input.nextInt();

   for(int i=0;i<numberOfStudent;i++){

    System.out.print("Enter student name : ");
    name = input.next();

    System.out.print("Enter score : ");
    score = input.nextFloat();
    if(score>highScore){
    secondHighScore=highScore;
    secondHighest=highest;
    highScore=score;
    highest=name;
    }
    else if(score>secondHighScore){
    secondHighScore=score;
    secondHighest =name;
    }
   }
   input.close();
   System.out.printf("\n%s scored highest score ( %.2f )\n",highest,highScore);
   System.out.printf("%s scored second highest score ( %.2f )\n",secondHighest,secondHighScore);
 }
}
