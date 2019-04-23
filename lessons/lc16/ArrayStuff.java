import java.util.*;

/*

ArrayList is a built-in java package that stores objects in an array

*/
public class ArrayStuff{
  public static void main(String[] args) {

    // create empty ArrayList
    ArrayList<String> cities = new ArrayList<String>(); // empty
    String city1 = "london";
    cities.add(city1);

    System.out.println(cities); // [london]

    // comvert to array --- use .toArray()

    String citiesArr[] = cities.toArray(new String[cities.size()]); // { "london "}

    // convert back into ArrayList

    ArrayList<String> list = new ArrayList<>(Arrays.asList(citiesArr));

    System.out.println(cities);
  }


}
