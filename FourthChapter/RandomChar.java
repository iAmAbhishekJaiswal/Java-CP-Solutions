public class RandomChar{
  public static void main(String[] args){
   char abhi= (char)(97 + (int)(Math.random()*27));
   System.out.println("\n "+abhi+"\n");
   String s1="Hello";
   String s2="hey bencho";
   String s3="hello";

   System.out.println(s1.equalsIgnoreCase(s3));
} 
}
