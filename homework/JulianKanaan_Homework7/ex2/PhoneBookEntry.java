import java.util.*;

public class PhoneBookEntry {


  String firstName; String lastName;
  String zipCode;
  String phoneNumber;


  public PhoneBookEntry(){
    firstName = ask("First Name");
    lastName  = ask("Last Name");
    zipCode   = ask("Zip Code");
    phoneNumber = ask("Phone Number");

  }
  public PhoneBookEntry(String firstName, String lastName, String zipCode, String phoneNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.zipCode = zipCode;
    this.phoneNumber = phoneNumber;
  }

  public String ask(String prompt){ // collect various data depending on what we need

    Scanner input = new Scanner(System.in);
    System.out.println("Enter "+ prompt + ", please"); // ie. "Enter last name, please"

    String enteredData = input.next();

    return enteredData;
  }

}
abstract class PhoneBook extends PhoneBookEntry {
  // has a arraylist of records by default
  ArrayList<PhoneBookEntry> records = new ArrayList<PhoneBookEntry>();

  public void addEntry(){
    //String[] args = {};
    System.out.println("Adding new entry...");
    records.add( new PhoneBookEntry());
  }

  public void editEntry(String nameSearch, PhoneBookEntry newRecord){
    // loop thru ArrayList


  }

  // below to be built within child classes (depending on user ability)

  abstract public void deleteEntry();

  abstract public void printAdminInfo();

  abstract public void changePassword(String newPassword);

  abstract public void changeUsername(String newUsername);

  abstract public void searchLinear(String nameSearch);

  abstract public void searchBinary();

}
