import java.util.*;

public class Testing {

  public static void main(String[] args) {
    String s1 = "Hello there";
    System.out.println(s1);
    SplitString stringObj = new SplitString(s1); // create it as an object

    stringObj.splitAndPrint();

    // comvert to string

    ArrayList<String> list1 = new ArrayList<>( Arrays.asList(s1) );

    System.out.println(list1);

    removeDuplicates(s1);
  }
  public static void removeDuplicates(String s){

    ArrayList tempList = new ArrayList<>( Arrays.asList(s) );//convert to ArrayList

    ArrayList uniques = new ArrayList<>(); // empty

    // String[] newString = tempList.toList (new String[ tempList.size() ] ); 

    for (int i=0; i < tempList.size(); i++){

      if (!uniques.contains( tempList.get(i) ) ) {
        uniques.add(tempList.get(i));
      }

    }
    System.out.println(uniques);
  }
}
