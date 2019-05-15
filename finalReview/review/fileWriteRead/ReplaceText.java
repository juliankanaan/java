import java.util.*;

// replace existing text in a text file with new text
public class ReplaceText {

  public static String readText(String fileName){
    // create file object
    java.io.File workFile = new java.io.File(fileName);

    String word = '';
    // read it w/ scanner
    Scanner inputFile = new Scanner(workFile);

    while (inputFile.hasNext()){ // line by line

      String word = inputFile.next();
      //System.out.println( firstName + " " + lastName);
    }
    return word; 
  }// read

  public static String replaceAndWrite(String sourceFile, String newFile, String existing, String replacement){

    java.io.File workFile = new java.io.File(fileName); // point to file

    // pass to PrintWriter

    workFile.print()


  }

}
