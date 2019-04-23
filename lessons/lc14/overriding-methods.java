import java.util.*;

/*
Subclasses inherit variables & methods from super class

You can *override* those existing superclass methods, however:

NOTE: override only works when methods are
*/


class Employees { // super class
  private String name;


  public Employees(String name){ // overloaded constructor; this one actually does something
    this.name = name;

  }
  public String printName(){ // orignal getName() method [to be overwritten]
    return "Superclass method says name is: "+ name;
  }

}

class MaintenanceStaff extends Employees {

  private String lastName;

  public static void main(String[] args) {
    new MaintenanceStaff();
  }

  public MaintenanceStaff(){
    // System.out.println("no-arg constructor");
  }
  public String printName(){
    // piggy-back on orig funciton
    return super.printName + ".. and the Override method says last name is: "+ lastName;
    // or completely Override it
    // return "Override method gives lastName of: "+ lastName;
  }
}
