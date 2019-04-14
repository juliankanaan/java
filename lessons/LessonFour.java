// Learning LOOPS


public class LessonFour {


  public static void main(String[] args) {

    // btw rounding for some reason

    double x = 23.34534;
    double rounded_x = Math.round(x * 10); // to the neaerest 10th

    System.out.printf("Rounded %.2f:  ", rounded_x); // OUT: 233.3

    // printf(), paired with %.2f [for two trailing decimals] or %.[n]f for n trailing

    System.out.println("----FOR LOOPS------");
    // Big boi while loop

    int counter = 0;
    while (counter < 2) {
      System.out.println("Do it do it.");
      counter++;
      // break; // optional here but can get out of the loop if x condition is met
    }

    System.out.println("----DO/WHILE LOOPS------");
    // seemingly the same as while loop, just written different

    int counter2 = 0;
    do {
      System.out.println("Doin a thing...");
      counter2++;
    } while (counter2 < 3);
    System.out.println("Done w/ do/while");


    System.out.println("----For LOOPS------");

    int counter3;
    for (counter3 = 0;  counter3 <2; counter3++ ) { // [where to start, condition test, what to do after]
      System.out.println("Counter is at: "+counter3);
    }
    int counter4;
    for (counter4 = 0;  counter4 <2; System.out.println(counter4++) ) { // [where to start, condition test, what to do after]
      // nothin else [same output as above]
    }


}

}
