import java.util.*;

// progam reads password.txt, identifying weak passwords


public class PasswordCheck {
  static String path = "/Users/juliankanaan/Documents/GitHub/java/homework/HW7/ex1/passwords.txt";

  public static ArrayList<LoginInfo> fetchBadPasswords() throws Exception {

    java.io.File file = new java.io.File(path);

    // empty ArrayList to be filled with bad Logins
    ArrayList<LoginInfo> badLogins = new ArrayList<LoginInfo>();

    try ( Scanner input = new Scanner(file); ) { // try to read file

      while (input.hasNext()){
        String username = input.next(); // first column
        String pass = input.next(); // first column

        if (isBad(pass)){
            // create LoginInfo object for each one & insert into ArrayList
            badLogins.add(new LoginInfo(username, pass));

        }
      }
    input.close();


    } catch(Exception e) {

      throw e;
    }

    return badLogins;

  } // end fetchBadPasswords();

  public static boolean isBad(String password){
    int alphaCount = 0; int digCount = 0;

    // check composition by character
    for (char character : password.toCharArray()) { // convert to array to use foreach
      if (Character.isDigit(character)){
        digCount++;
      }
      else {
        alphaCount++;
      }
    } // end char loop

    if (password.length() < 8 || alphaCount < 1 || digCount < 1 ){

        return true;
    } else {
    return false;
    }

  }
}

class LoginInfo { // create object for our convenience
  String username; String password;


  public LoginInfo(String username, String password){
    this.username = username;
    this.password = password;
  }



}
