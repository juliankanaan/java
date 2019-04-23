import java.util.*;


public class PhoneBookEntry {
  private int id;
  String firstName; String lastName;
  String email;
  String zipCode;
  String phoneNumber;

  /* constructors */

  public PhoneBookEntry(){ } // no arg

  public PhoneBookEntry(int id, String firstName, String lastName){

    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  public PhoneBookEntry(int id){ // with IDs

    this.id = id;
  }
  public void printEntry(){

    System.out.println("id: " + id);
    System.out.println("First Name: "+ firstName);
    System.out.println("Last Name: "+ lastName);
    System.out.println("Email: "+ email);
    System.out.println("Phone num: " + phoneNumber);
  }
}
class Directory {
  //PhoneBookEntry entry;
  int filled = 0; // none filled by default
  PhoneBookEntry[] entries = new PhoneBookEntry[5]; // default variable type (array) five empty entries

  public Directory(){ // by default, this has an array of 5 phone book entries

  }
  public void addEntry(PhoneBookEntry entry){

    if ( filled < 5 ){
      entries[filled] = entry;
      filled++;
    }
    System.out.println("adding....");
    entry.printEntry();
  }

}
