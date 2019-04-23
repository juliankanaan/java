import java.util.*;

/*

A parent class (superclass) is constructed within a child (subclass)

Constructor method can be explicit (using super(); )

  or imolicit (using no-arg Constructor)

*/
/*
Execution starts @ the most-super class' main() method.
  its constructor invokes its subclasses' child class' no-arg constructor (chained)

*/




// USING NO-ARG:

class MaintenanceStaff extends Employees { // step 1: Make a superclass (MaintenanceStaff)

  public static void main(String[] args) { // step 2: main method invokes no-arg constructor
    new MaintenanceStaff(); // create new MaintenanceStaff record
  }

  public MaintenanceStaff(){ // step 3: no args for this constructor
    // System.out.println("no-arg constructor for superclass");
  }

}
class Employees extends AllPersons {
  private String name;

  // no main method needed
  public Employees(){
    // System.out.println("no-arg constructor");
  }
  public Employees(String name){ // overloaded constructor; this one actually does something
    this.name = name;
    System.out.println("Employee name is: " + name);
  }

}
class AllPersons {
  // no main for this class
  public AllPersons(){
    // System.out.println("no-arg constructor");
    // System.out.println("This is the ")
  }
}

// PART B: Using super();

class MaintenanceStaff extends Employees{

  public static void main(String[] args) {

  }
  public MaintenanceStaff{
    super(); // constructor w/ super
  }

}
