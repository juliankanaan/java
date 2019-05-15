import java.util.*;
public class SplitStrings {

  public static void main(String[] args) {

    String s = "Hi there, I am a boy";

    split(s);

    removeDuplicates(s);
  }

  public static void removeDuplicates(String s){
    // parse string by char
    for (char chr : s.toCharArray() ) {
      System.out.print(chr + " ");

    }

  }
  public static void split(String s){
    // split by spaces
    String[] pieces = s.split(" ");

    for (String piece : pieces) {
      System.out.println(piece);

    }

  }
}
