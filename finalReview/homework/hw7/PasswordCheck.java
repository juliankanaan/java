
// progam reads password.txt, identifying weak passwords

import java.util.*;
import java.io.*;

public class PasswordCheck {

  public static void main(String[] args) throws Exception {

    ArrayList<LoginDetails> list = getGoodLogins("passwords.txt");

    printArrayList(list);


  }
  public static void printArrayList(ArrayList<LoginDetails> deets){

    for (LoginDetails deet : deets ) {
      System.out.println(deet.user + " " + deet.pass);
    }

  }

  public static boolean isBadPass(LoginDetails details){
    return false;
  }
  public static ArrayList<LoginDetails> getGoodLogins(String fileName) throws Exception {

    // empty ArrayList

    ArrayList<LoginDetails> list = new ArrayList<LoginDetails>();

    // get file

    try  {
      java.io.File workingFile = new java.io.File(fileName);
    // get scanner goin
    Scanner input = new Scanner(workingFile);


      while (input.hasNext()){
        String username = input.next();
        String password = input.next();

        // add this shit to the new ArrayList

        list.add( new LoginDetails(username, password));


      }

      input.close();
    } catch(Exception e){
      throw e;

    }


      return list;
  } // getGoodLogins
}
class LoginDetails {
  String user; String pass;
  public LoginDetails(String user, String pass){
    this.user = user;
    this.pass = pass;
  }


}
