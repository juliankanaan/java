

import java.util.*;

public class questionFive {

  public static void main(String[] args){

  int number = 555;
  int number2 = 2435459;
  addPrimes(number);

  System.out.println( largestDigit(number2) );

  System.out.println(addPrimes(number));
  }
  public static int addPrimes(int num){
    // convert to string to point at each one indiv
    String numAsString = Integer.toString(num);
    int sum = 0;
    // loop over each
    for (int i=0; i < numAsString.length(); i++){
      char currNum = numAsString.charAt(i);
      int numNum =  Character.getNumericValue(currNum); // convert to num now
      //System.out.println(numNum);
      if (isPrime(numNum)){
        sum += numNum;
      }

    }
    return sum;
  }
  public static boolean isPrime(int num){
    int falseCount=0;
    for (int i=2; i < num; i++){
      if ( (num % i ) == 0){
        falseCount++;
      }
    }
    if ( falseCount > 0 ){
      return false;
    } else {
      return true;
    }
  }
  public static int largestDigit(int num){
    // convert to string first
    String numAsString = Integer.toString(num);
    int maxSoFar = 0;
    for (int i=0; i < numAsString.length(); i++){
      int currNum = Character.getNumericValue( numAsString.charAt(i) );
      if (currNum > maxSoFar){
        maxSoFar = currNum;
      }
    }
    return maxSoFar;
  }
}
