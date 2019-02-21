// Apparently this is how you comment out stuff.

// Here's the essential Hello, World!:

public class LessonOne {
  // defining the "main method"
  public static void main(String[] args) {
    // statement
    System.out.println("Hello, World!");


// NOTE: See the class name LessonOne? File won't compile unless FILENAME matches this

    // DECLARE VARIABLES: Integer
    int x;
    // characters (double is a mix?)
    char a;
    // ASSIGNING: Now assign the vars
    x = 1;
    a = 'a';

    System.out.println(x);
    System.out.println(a);

    // Output: 1, a on two lines


    // CONTANTS: [these don't change], & ALL-CAPS
    final double PI = 3.14;
    final int SIZE = 3;

    System.out.println(PI);
    System.out.println(SIZE);


    // MATH W/ JAVA
    System.out.println("Math w/ Java");

    double radius;
    double area;

    radius = 20;

    area = radius * radius * PI;

    System.out.println("Area of circle w radius " + radius + " = " + area );

    // apparently is 1256. Crazy fam



  }

}
