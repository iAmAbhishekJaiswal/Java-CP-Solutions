import java.util.*;

public class Box{

int x,y;


//default constructor 1

    // default constructor will call another constructor

    // using this keyword from same class
Box()
{
this(0);// calls constructor 2
}

 // parameterized constructor 2
Box(int s)
{
 x=y=s;
}

// parameterized constructor 3
Box(int l,int b)
{
 x=l;
 y=b;
}

void area(int side){
  int cubeArea = side*side;
  System.out.println("Area of cube: " + cubeArea);

}

//method overloading by changing number of parameter
void area(int length, int bredth){
  int rectArea = length*bredth;
  System.out.println("Area of rectangle: "+ rectArea);
}

public static void main(String[] args)
{
  Box cube = new Box(); // invokes default constructor first

  Box cube1= new Box(5);
  Box rect = new Box(5,6);
  cube.area(cube.x);//call area method for cube
  cube1.area(cube1.x);
  rect.area(rect.x, rect.y);
  //call area method for rectangle

}
}


