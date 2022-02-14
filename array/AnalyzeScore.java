import java.util.*;

public class AnalyzeScore{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  double score[] = new double[100];
  System.out.print("\nEnter score(negative score to terminate) : ");
  int i=-1;
  do{
      i++;
      score[i]=input.nextDouble();
    } while(score[i] >= 0);
  analyzeScore(score,i);
 }

 public static void analyzeScore(double[] list,int n){
  double average=0;
  int countAbove=0, countBelow=0;
  for(int i=0;i<n;i++)
  average += list[i];
  average /= n;
  for(int i=0;i<n;i++){
   if(list[i]>=average)
    countAbove++;
   else
    countBelow++;
  }
  System.out.println("\nScores above average : "+countAbove);
  System.out.println("Scores below average : "+countBelow);

 }
}
