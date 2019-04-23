
import java.util.*;

public class Testing {
  public static void main(String[] args) {
    // create an empty entry

    PhoneBookEntry test1 = new PhoneBookEntry(); // no arg

    test1.printEntry();

    PhoneBookEntry test2 = new PhoneBookEntry(122);

    test2.printEntry();

    String[] names = {"John", "Sarah", "marshall", "Jim", "tom"};
    String[] lastnames = {"Brown", "green", "Beem", "Yang", "Xi"};

    Directory directory1 = new Directory();

    for (int i=0; i < names.length; i++){

      PhoneBookEntry newEntry = new PhoneBookEntry(i, names[i], lastnames[i] );

      directory1.addEntry(newEntry);

    }
    for (int j=0; j < directory1.entries.length; j++){
      directory1.entries[j].printEntry();
    }

  }
}
