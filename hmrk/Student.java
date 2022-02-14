



import java.util.Scanner;

public class Student{
  int roll;
  String name;
  private long reg;
  float grade;
  
  public void input(){
   Scanner input = new Scanner(System.in);
  
   System.out.print("\nEnter name of Student : ");
   name=input.nextLine();

   System.out.print("\nEnter roll number : ");
   roll=input.nextInt();

   System.out.print("\nEnter registration number : ");
   reg= input.nextLong();

   System.out.print("\nEnter grade : ");
   grade = input.nextFloat();
   input.close();
  }

  public void printData(Student s){

   System.out.println("\n\n\tStudent's Data\n\n"); 
   System.out.println("\n Name : "+name);
   System.out.println("\n Roll Number : "+roll);
   System.out.println("\n Reg number : "+reg);
   System.out.println("\n Grade : "+grade);
  }

  public static void main(String[] args){
   Student soni = new Student();
   soni.input();
   soni.printData(soni);
  }
}
