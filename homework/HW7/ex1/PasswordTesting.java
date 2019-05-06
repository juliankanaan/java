import java.util.*;

public class PasswordTesting {
  public static void main(String[] args) throws Exception {



    // return the bad passwords
    ArrayList badOnes = PasswordCheck.fetchBadPasswords();

    print(badOnes);

  }
  public static void print(ArrayList<LoginInfo> list){
    System.out.println("Here are the bad logins: " + list.size() + " results\n" );


    list.forEach((item) ->
      System.out.println(item.username + " " + item.password)
    );
  }



}
