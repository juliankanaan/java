import java.util.*;


public class User extends AllRecords {

  String username; String password; String emailAddress; int id;
  PhoneRecord phoneRecord;

  public User(id, username, password, emailAddress){
    this.id = id;
    this.username = username;
    this.password = password;
    this.emailAddress = emailAddress;
    this.phoneRecord = ask("phone record");

  }
  // override shared parent methods (shared btw NormalUser & Admin)
  public void printUserInfo(){
    //System.out.println("Info:\n");
    System.out.println("username: " + username + "\n");
    System.out.println("password: " + password + "\n");
    //System.out.println("");
  }




}
class NormalUser extends User {

  public NormalUser(username, password, emailAddress){
    super(username, password, emailAddress, phoneRecord);
  }
  public void printUserInfo(){
    System.out.println("username: " + username + "\n");
    System.out.println("email: " + emailAddress + "\n");
    System.out.println("password: " + password + "\n");
    //System.out.println("");
  }
  // override parent functions (no permissions)

  public void deleteEntry(){
    System.out.println("User does not have permission to do this");
  }

  public void printAdminInfo(){
    System.out.println("User does not have permission to do this");
  }

  public void changePassword(){
    System.out.println("User does not have permission to do this");
  }

  public void changeUsername(){
    System.out.println("User does not have permission to do this");
  }

  public void searchLinear(){
    System.out.println("User does not have permission to do this");
  }

  public void searchBinary(){
    System.out.println("User does not have permission to do this");
  }

}


class PhoneBookAdmin extends User {
  public PhoneBookAdmin(username, password, emailAddress){
    super(username, password, emailAddress);
  }

  public void deleteEntry(String nameSearch){
    for (int i =0; i < records.size(); i++ ) {
      if (item.name == nameSearch){ // TODO: data is in firstName, lastName
        //System.out.println("found!");
        records.remove(i);
      } else {
        System.out.println("Item not found!");
      }
    }
  }

  public void printAdminInfo(){
    System.out.println("username: " + username + "\n");
    System.out.println("password: " + password + "\n");
    System.out.println("email: " + email + "\n");
  }

  public void changePassword(String newPassword){
    this.password = newPassword;
  }

  public void changeUsername(String newUsername){
    this.username = newUsername;
  }

  public PhoneRecord searchLinear(String nameSearch){
    PhoneRecord foundRecord = null;
    for (int i =0; i < records.size(); i++ ) {
      if (item.name == nameSearch){ // TODO: data is in firstName, lastName
        //System.out.println("found!");
        foundRecord = item;
      } else {
        System.out.println("Item not found!");
      }
    }
    return foundRecord;
  }

  public PhoneRecord searchBinary(){
    // code
  }
}
