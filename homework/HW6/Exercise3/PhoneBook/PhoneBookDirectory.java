import java.util.*;

public class PhoneBookDirectory{ //
  // initiate class varibales for this class
  PhoneBook phoneRecord;




  public static void main(String []args){
    int id = 12; //
    PhoneBook newRecord = new PhoneBook(id); // actual record creation
    PhoneBookDirectory entries = new PhoneBookDirectory(3); // size objects in array

    for (int i=0; i < entries.length; i++){ // prompt user to enter details for each record

      PhoneBook newRecord = new PhoneBook(i); // create record

      entries[i] = newRecord; // save it intp the array

    }

  }

}
