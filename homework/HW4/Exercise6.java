
import java.util.*;
/*
Exercise 6 (20 points) Implement a Java program that prints a table of characters that are
equivalent to the Ascii codes from 65 to 126 (126 included) (You will need to use int and cast it
to char) Your program should be print five characters per line.
Read about Ascii codes:
http://www.ascii-code.com/
http://www.computerhope.com/jargon/a/ascii.htm


*/


public class Exercise6 {

    public static void main(String[] args) {
      int x = 65; // start here
      while (x < 127) {
        printFive(x); // pass where we're at in the ASCII code
        System.out.println(""); // empty line

        x = x + 5; // move start to five more characters
      }




    }

    public static void printFive(int ascii){ // provide ascii integer where to start

      for (int i = ascii; i < (ascii + 5); i++ ){
        char newChar = (char)i;
        if (i == 127){
          break; // break loop just in case we add too much
        }
        System.out.print(newChar);
      }
    }

}
