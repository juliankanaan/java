import java.util.*;
// get user year born



public class VotingValidator {

  public VotingValidator(){}

  public static void ValidateAge(int age) throws InvalidAgeException{

    int ageAt2020 = age + 1; // next year

    int birthYear = 2019 - age;

    if (ageAt2020 > 21) {
      System.out.println("Welcome to Vote!");
    } else {
      //System.out.println("not old enough");
      String message = "User born in " + birthYear + " and will be " + age + " by 2020";
      throw new InvalidAgeException(message);
    }

  }
  public static int takeUserAge(){

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your birth year");

    int birthYear = input.nextInt();

    int age = 2019 - birthYear;

    return age;
  }

}
class InvalidAgeException extends Exception {
  //String message;
  public InvalidAgeException(String message){ // construct
    super(message); // hijack existing error throwing class
    System.out.println(message);
  }
}
