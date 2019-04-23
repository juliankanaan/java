import java.util.*;

public class TwoDimensions {

  int[][] arrayWeird = {
    {1,2,3},
    {4,5,6},
    {7,8,9}
  }; // array.length here is 3. array[3].length is three too


  public static void main(String[] args) {

    int[][] randArr = createTwoByTwo(4, 4);

    printTwoByTwo(randArr);

  }
  public static int[][] createTwoByTwo(int rows, int columns){

    int[][] newArray = new int[rows][columns]; // initilize blank matrix

    // create colums first

    for (int i=0; i < rows; i++){ // each row...

      for (int j =0; j < columns; j++){

        int randNum = (int) (Math.random() * 10);
        //System.out.println(randNum);
        newArray[i][j] = randNum;
      }
    }
    return newArray;
  }
  public static void printTwoByTwo(int[][] arr){

    int rows = arr.length;
    int columns = arr[0].length; // assuming symmetry

    for (int i=0; i < rows; i++){ // each row...

      System.out.print("Row " + i + ":");

      for (int j =0; j < columns; j++){

          System.out.print(arr[i][j]);
      }
      System.out.print("\n");
    }
  }
}
