import java.util.*;


public class User extends PhoneBook {

  String username; String password; String emailAddress; String id;
  PhoneBookEntry phoneRecord;

  public User(String id, String username, String password, String emailAddress){
    this.id = id;
    this.username = username;
    this.password = password;
    this.emailAddress = emailAddress;
    this.phoneRecord = null; //TODO fix

  }
  // override shared parent methods (shared btw NormalUser & Admin)
  public void printUserInfo(){
    //System.out.println("Info:\n");
    System.out.println("username: " + username + "\n");
    System.out.println("password: " + password + "\n");
    //System.out.println("");
  }
  public String ask(String prompt){ // collect various data depending on what we need

    Scanner input = new Scanner(System.in);
    System.out.println("Enter "+ prompt + ", please"); // ie. "Enter last name, please"

    String enteredData = input.next();

    return enteredData;
  }

  public void deleteEntry(){
    System.out.println("User does not have permission to do this");
  }

  public void printAdminInfo(){
    System.out.println("User does not have permission to do this");
  }

  public void changePassword(String newPassword){
    System.out.println("User does not have permission to do this");
  }

  public void changeUsername(String newUsername){
    System.out.println("User does not have permission to do this");
  }

  public void searchLinear(String nameSearch){
    System.out.println("User does not have permission to do this");
  }

  public void searchBinary(){
    System.out.println("User does not have permission to do this");
  }



}
class NormalUser extends User {

  public NormalUser(String id, String username, String password, String emailAddress){
    super(id, username, password, emailAddress);
  }
  public void printUserInfo(){
    System.out.println("username: " + username + "\n");
    System.out.println("email: " + emailAddress + "\n");
    System.out.println("password: " + password + "\n");
    //System.out.println("");
  }
  // override parent functions (no permissions)



}


class PhoneBookAdmin extends User {
  public PhoneBookAdmin(String id, String username, String password, String emailAddress){
    super(id, username, password, emailAddress);
  }

  public void deleteEntry(String nameSearch){
    
  }

  public void printAdminInfo(){
    System.out.println("username: " + username + "\n");
    System.out.println("password: " + password + "\n");
    System.out.println("email: " + emailAddress + "\n");
  }

  public void changePassword(String newPassword){
    this.password = newPassword;
  }

  public void changeUsername(String newUsername){
    this.username = newUsername;
  }

  public void searchLinear(String nameSearch){
    PhoneBookEntry foundRecord = null;
    for (Iterator<PhoneBookEntry> it = records.iterator(); it.hasNext();) {
      /*
      if (records[i] == nameSearch){ // TODO: data is in firstName, lastName
        //System.out.println("found!");
        records.remove(i);
      } else {
        System.out.println("Item not found!");
      }
      */
    }
    //return foundRecord;
  }


}
