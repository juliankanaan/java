import java.util.*;

public class questionTen {

  public static void main(String[] args){

    char[][] answers = {
      {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, // child 1
      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'}, // child 2
      {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    char[] keys = {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};

    int[] done = grader(answers, keys);
    printArray(done);
  }
  public static int[] grader(char[][] arr, char[] keys){
    int[] correctCount = new int[arr[0].length];
    for (int i =0; i < arr.length; i++ ){ // row by row [students]
      System.out.println("Student: "+i);
      int correct = 0; // will reset each student
      for (int j=0; j < arr[i].length; j++){ // column by column [grade]
        char grade = arr[i][j];
        if (grade == keys[j]){
          correct++;
        }
      }
      correctCount[i] = correct; // put on how many they got:
    }
    return correctCount;
  }
  public static void printArray(int arr[]){
    for (int i =0; i < arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  System.out.println(" "); // empty line

  }

}
