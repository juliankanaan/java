import java.util.*;

public class PhoneRecord {


  String firstName; String lastName;
  String zipCode;
  String phoneNumber;


  public PhoneRecord(){
    firstName = ask("First Name");
    lastName  = ask("Last Name");
    zipCode   = ask("Zip Code");
    phoneNumber = ask("Phone Number");

  }
  public PhoneRecord(String firstName, String lastName, String zipCode, String phoneNumber){
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
abstract class AllRecords extends PhoneRecord {
  // has a arraylist of records by default
  ArrayList<PhoneRecord> records = new ArrayList<PhoneRecord>();

  public void addEntry(){
    //String[] args = {};
    System.out.println("Adding new entry...");
    records.add( new PhoneRecord());
  }

  public void editEntry(String nameSearch, PhoneRecord newRecord){
    // loop thru ArrayList
    for (Iterator<PhoneRecord> it = records.iterator(); it.hasNext();) {
      /*
      if (it[] == nameSearch){ // TODO: data is in firstName, lastName
        System.out.println("found!");
        records.set(i, newRecord);
      } else {
        System.out.println("Item not found!");
      }
      */
    }
  }

  // below to be built within child classes (depending on user ability)

  abstract public void deleteEntry();

  abstract public void printAdminInfo();

  abstract public void changePassword(String newPassword);

  abstract public void changeUsername(String newUsername);

  abstract public void searchLinear(String nameSearch);

  abstract public void searchBinary();

}
