

import java.util.*;


public class Exercise5 {


  public static void main(String[] args) {

    // get input

    System.out.println("What month?");

    Scanner input = new Scanner(System.in);

    String month = input.next();

    month.toLowerCase();// convert to all lowercase for processing

    input.close();

    System.out.println("You chose: " + month);

    String season;
    // convert to all lowercase

    // classify

    if (month.equals("march") || month.equals("april") || month.equals("may")) {


      season = "spring";

    } else if (month.equals("june") || month.equals("july") || month.equals("august")) {


      season = "summer";

    } else if (month.equals("september") || month.equals("october") || month.equals("november")) {


      season = "autumn";

    } else {

      season = "winter";

    }

    System.out.println("Season is " + season);

}
}
