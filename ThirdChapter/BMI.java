import java.util.*;

public class BMI{
 public static void main(String[] args)
 {
  Scanner input = new Scanner(System.in);
  float weight,height,bmi;
  System.out.print("Enter your weight in Kg : ");
  weight = input.nextFloat();

  System.out.print("\nEnter your height in foot : ");
  height=input.nextFloat();

  height=height*0.3048f;
  bmi=weight/(height*height);

  System.out.println("\nBMI : "+bmi+"\n");
  if(bmi<18.5)
  System.out.println("Underweight");

  else if(bmi < 25)
  System.out.println("Normal");

  else if(bmi < 30)
  System.out.println("Overweight");

  else
  System.out.println("obese");

  input.close();
 }
}
