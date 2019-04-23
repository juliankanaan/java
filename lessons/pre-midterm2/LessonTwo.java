
// import goddamn everything Apparently?
import java.util.*;


public class LessonTwo {
  // God what the hell this shit is annoying to type
  public static void main(String[] args) {

    // Taking user input; [ System.in ]

    System.out.println("Time to take user input");
    // can also just do print() but this gives a new line


    // Start with this:
    Scanner input = new Scanner(System.in);

    // Declare the vars you need

    double user_num;
    double new_num;
    // Ask user for stuff

    System.out.print("Enter a number. I will multiply this by 2:  ");

    user_num = input.nextDouble(); // Capture it?

    new_num = user_num * 2;

    // Aight lets see if it works:

    System.out.println("Your number is now: "+new_num);

    input.close(); // End with this:

    //YEET. it worked

    System.out.println("-------The Math thingy---------");

    System.out.println(Math.pow(2, 4)); // 2 to the 4th power

  }

}
