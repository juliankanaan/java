import java.util.*;

/*
A:  exceptions: try amd catjc errors
B: Extensions on user input: reading in files
  - intro to the file class
  - file writer & input writer
  - printing to not just console
C:
File class can CRUD files and directiries, and search


File object usage / creation:
java,io.File newFile = new java.io.File("nameOfFile.png");



PrintWriter class: // writes to a specific file --- useful for logging
-- takes a File object as an argument
usage:

java,io.File newFile = new java.io.File("nameOfFile.png"); // create File onject

java.io.PrintWriter newFile = new java.io.PrintWriter(newFile); // now can write
## write some things
  newFile.print("Julian Kanaan");

  newFile.close(); // close file



--- -

try(java,io.File newFile = new java.io.File("nameOfFile.png");){
  # do things
---

Scanner input = new Scanner("filePath.txt"); // object to read file

reading data

while (something involving file){

}
// close input

input.close();

} // file is automatically closed

*/

public class apr19 {

  public static void main(String[] args) {

    String URLString = "https://cnn.com";

    try {
    java.net.URL url = new java.net.URL(URLString);

    Scanner input = new Scanner(url.openStream());


    while (input.hasNext()){
     System.out.println(input.nextLine());
     String nextLine = input.nextLine();

     


    }
    input.close();

  } catch (java.net.MalformedURLException ex) {
    System.out.println("Invalid URL");
  }
    catch (java.io.IOException ex){
      System.out.println("IO error");


    }
  }


}
