

import java.util.*;

public class questionEight {

  public static void main(String[] args){


    multiplicationTable();
    //createHeader();
  }
  public static void multiplicationTable(){
    //createBlankSpace();
    createHeader();
    int[] nums = {1,2,3,4,5,6,7,8,9};

    for (int row = 1; row < 10; row++){
      createRowLegend(row); // each row create legend
      for (int column = 1; column < 10; column++){ //

        int value = row * column;
        if (value > 9){ // dtermine amount of leading space to put
          System.out.print("    "+value);
        } else {
          System.out.print("     "+value);
        }
      }
      System.out.println(" ");
    }

  }
  public static void createHeader(){

    for (int i=1; i < 10; i++){
      System.out.print("     "+i);
    }
       System.out.println("\n---------------------------");
  }
  public static void createRowLegend(int row){

    System.out.print(row+" |");
  }
  public static void createBlankSpace(){
    System.out.print("        ");
  }


}
