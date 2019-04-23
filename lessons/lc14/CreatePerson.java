import java.util.*;


public class CreatePerson {

  public static void main(String[] args) {

    // create a MaintenanceStaff person
    MaintenanceStaff maint1 = new MaintenanceStaff();
    maint1.setName("Henry"); // inherited method & variable from superclass

    // access the shit now

    String name = maint1.getName();

    System.out.println(name);


  }

}
