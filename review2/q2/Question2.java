import java.util.*;


public class Question2 {
  public static void main(String[] args) {


  }

  public int[][] reverseColumns(int[][] arr){

    int rows = arr.length;
    int columns = arr[0].length; // assume symmetry

    int[][] newArray = int[rows][columns];

    // take each column w/ its values, and move it

    for (int i=0; i < rows; i++){
      for (int j=0; j < columns; j--, i++ ){
        int val1 = arr[i][j];

        


      }


    }


  }
}
