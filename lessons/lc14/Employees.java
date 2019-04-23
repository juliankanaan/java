import java.util.*;

public class Employees { // super class
    String firstName;
    // String lastName;

    public void setName(String s){
      s = firstName;
      System.out.println(s);
      System.out.println(firstName);
    }

    public Employees(){ }

    public String getName(){
      return firstName;
    }

}
class MaintenanceStaff extends Employees {

    public MaintenanceStaff(){
      // System.out.println("no-arg constructor");
    }

  }
