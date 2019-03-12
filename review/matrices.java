public class matrices {

  public static void main(String[] args){
    // Q10 create a random (0-100) value 3D array 3x2x3 and print it without using
    int scores[][][] =  {
                    {{75, 205}, {90, 225}, {15, 335}, {13, 215}, {15, 25}},
                    {{45, 215}, {90, 225}, {15, 345}, {12, 205}, {14, 95}},
                    {{65, 305}, {94, 105}, {11, 335}, {11, 235}, {10, 25}},
                    {{65, 235}, {94, 325}, {13, 345}, {11, 205}, {16, 75}},
                    {{85, 265}, {94, 525}, {13, 365}, {13, 245}, {16, 25}},
                    {{95, 205}, {94, 425}, {13, 315}, {12, 205}, {16, 65}}
                		};



  }


  public static void printThreebyThree(int[][][] arr){

    // start at rows
    for (int i =0; i < arr.length; i++){ // rows [student]
      System.out.println("Student: "+i);

      for (int j=0; j < arr[i].length; j++){ // each column now [exam]
        int exam = j;
        System.out.println("Exam: "+exam);

        for (int k=0; k<arr[i][j].length; k++){ // each key-val pair
            int question = k;
            int score = arr[i][j][k];
            System.out.println("Question: "+k+", Score: "+score);
        }
      }
    }

  }
  public static void printThreebyThreeGeneral(int[][][] arr){

    for (int i=0; i < arr.length; i++){ // row by row

      for (int j=0; j < arr[i].length; j++){ // column by column

        for (int k=0; k < arr[i][j].length; k++){ // value by value

          System.out.print(arr[i][j][k]+", ");

        }
        System.out.println();
      }
    }
  }
}
