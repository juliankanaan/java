
import java.util.*;

/*
using array data types

*/


public class LessonEight {

  public static void main(String[] args) {

  // declaring an array, then initializing
  // dataType arrayName[] = new dataType[arraySize]

  double myArray[] = new double[10];

  // or in two line: myArray = new double[10];

  // array characteristics
  int length = myArray.length;

  // populate array with data

  myArray[2] = 10.3;

  // declare, create, initializing

  double[] arrayTwo = {1.0, 2.3, 4.3, 24.8};

  System.out.println("Two arrays so far...");
  printArray(myArray);
  printArray(arrayTwo);

  // looping over array
  System.out.println("looping over array...");
  for (int i=0; (i <  arrayTwo.length ); i++){
    System.out.println(arrayTwo[i]);
  }

  double[] newArray = initializeArray(5);

  printArray( newArray );

  System.out.println("Sum of array is....");
  double sum = sumArray(newArray);

  System.out.println("-----------NEW----------");

  // shift elements

  //double[] shifted = shiftArray(newArray, 1);
  //printArray(shifted);

  // duplicating arrays
  int arrayThree[] = {1, 2, 4, 5, 6};

  int duplicated[] = arrayThree.clone();

  // copyh part of array: use System.arraycopy(bunch, of, args, lookemUp);

  }



  public static double[] initializeArray(int length){
    Scanner input = new Scanner(System.in);
    double[] newArray = new double[length];
    System.out.println("Enter "+ newArray.length+" values");
    for (int i=0; i < newArray.length; i++){
      newArray[i] = input.nextDouble();
    }
    input.close();

    return newArray;


  }
  public static void printArray(double[] inputArray){
    for (int i=0; i < inputArray.length; i++){
      System.out.print(inputArray[i]+" ");
  }
}
  public static double sumArray(double[] inputArray){
    double total = 0;
    for (int i=0; i < inputArray.length; i++){
      total += inputArray[i];
    }
    return total;
  }
  public static double[] shiftArray(double[] inputArray, int shiftLefts){
    double[] newArray = new double[inputArray.length];
    for (int i=0; i < inputArray.length; i++){
      newArray[i - shiftLefts ] = inputArray[i];
    }
    return newArray;
  }

}
