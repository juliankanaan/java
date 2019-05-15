import java.util.*;
public class CreateThreeDim {

  public static void main(String[] args) {

    int[][][] three = createThreeByThree(5);

    printIt(three);

  }
  public static int[][][] createThreeByThree(int howMany){
    int[][][] newArr = new int[howMany][howMany][howMany]; // empty

    for (int i=0;i < newArr.length; i++ ) { // first dimension (rows)
      for (int j=0; j < newArr[i].length; j++ ) { // column
        for (int k=0; k < newArr[i][j].length; k++ ) { // value now
          int randNum = (int)(Math.random() * 20);
          newArr[i][j][k] = randNum; // insert
        }
      }
    } // outside loop
    return newArr;
  }
  public static void printIt(int[][][] arr){
    for (int i=0;i < arr.length; i++ ) { // first dimension (rows)
      System.out.println("Row " + i);

      for (int j=0; j < arr[i].length; j++ ) { // column
        System.out.print("  Column " + j + ": ");

        for (int k=0; k < arr[i][j].length; k++ ) { // value now

          System.out.print( arr[i][j][k] + " ");
        }
        System.out.println();

      }
    } // outside loop
  }

}
