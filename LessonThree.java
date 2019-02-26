
// converting & analyzing strings


import java.util.*;


public class LessonThree {


  public static void main(String[] args) {

    //convert

    double num = 4893.3;
    String string_num = Double.toString(num); // converted into a string

    int dot = num.indexOf('.'); // how many chars until you hit a "." in the string?

    // specifier stuff [ %d = integer, %s = string ]

    System.out.println("There are %d characters before the . in #s", dot, string); 


  }

}
