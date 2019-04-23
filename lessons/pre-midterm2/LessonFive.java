// methods boi

// methods are basically functions in any other language (accept arguments, they're resusable & stuff)


public class LessonFive {


  public static void main(String[] args) {

    int out = findMax(3, 19);
    System.out.println( out ); // calling the function from below


  }

  /* SYNTAX:
  modifier returnValueType methodName(parameters) {
    statements;
  }

  // Methods w/ returnValueType of [void] don't return anything 

  */
  public static int findMax(int num1, int num2) {
    int output;
    if (num1 > num2){
      output = num1;
    } else {
      output = num2;
    }
    return output;
  }


}
