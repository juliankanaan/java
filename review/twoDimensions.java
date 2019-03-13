import java.util.*;

public class twoDimensions {
  // creating two-dimensional arrays

  public static void main(String[] args){
    // create and initilize
    int[][] matrix = new int[10][10];
    // assign variables
    matrix[0][0] = 23;

    // arrays

    int[][] arrayWeird = {
      {1,2,3},
      {4,5,6},
      {7,8,9}
    }; // array.length here is 3. array[3].length is three too

    // now in a loop
    for (int i=0; i < arrayWeird.length; i++){ // go row by row (length is total rows)
      System.out.println("Row: "+i);
      for (int j =0; j < arrayWeird[i].length; j++){ // go value by value (for as many as there are)
        System.out.println(arrayWeird[i][j]);
      }
    }
    /*
    output:

    Row: 0
    123

    Row: 1
    456

    Row: 2
    789

    */

    // create a 3D array
    int[][][] userdata= { // {user_id, age, month_joined}, {post_id, chars}
              {{212, 12, 10}, {12, 2400}},
              {
        {120, 21, 9}, {32, 43223}
      },
      {
        {22, 45, 3}, {31, 3222}
      }
    };

    //printThreeDimensionals(userdata);
  }


  }


}
