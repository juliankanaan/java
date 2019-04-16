import java.util.*;

/*

*/


import homework.hw6.*;

class PhoneBookDirectory{ //


  public PhoneBookDirectory(int arraySize){

    String[] newEntries = new String[arraySize]; // empty array for now

  }
  public int addEntry(PhoneBookEntry entry){
    int result;

    System.out.println("\nAdding record....");



    return result; // 1 or zero depending on success
  }
  public void printEntries(int[] entriesArray){

    for (int i=0; i < entriesArray.length; i++){
      printBookEntry(entriesArray[i]);
    }

  }


  public static void main(String []args){

    PhoneBookDirectory entries = new PhoneBookDirectory(3); // size objects in array

    for (int i=0; i < entries.length; i++){ // prompt user to enter details for each record

      PhoneBook newRecord = new PhoneBook(i); // create record

      entries[i] = newRecord; // save it intp the array

    }

  }

}
