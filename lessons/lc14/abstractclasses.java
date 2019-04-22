import java.util.*;

/*
these are classes that do not have **initiated** variables:

  ie. EmployeeCreate emp1 = new("Julian", 122, "Houston");  will not compile

can have abstract methods

** Abstract classes must be **inherited** from another class (use extends)

*/

abstract class EmployeeInfo { // abstract class
  private String employeeName;
  private int employeeID;
  private String employeeAddr;

  public EmployeeInfo(String employeeName, String employeeAddr, int employeeID){ // constructor for class
    this.employeeName = employeeName;
    this.employeeAddr = employeeAddr;
    this.employeeID = employeeID;
  }
  /*
  Below will NOT work w/ in this abstract class:

  public static void main(String[] args) {
  EmployeeInfo emp1 = new EmployeeInfo("Julian Kanaan", 12546, "Houston, TX");
  }

  */

}
class Salary extends EmployeeInfo { // subclass where EmployeeInfo constructor can actually be used
  private double monthlyPay;

  public Salary(String employeeName, String employeeAddr, int employeeID, double monthlyPay){
    super(employeeName, employeeAddr, employeeID); // *** constructor for EmployeeInfo ****
    setSalary(monthlyPay); // useful for this class
  }
  public void setSalary(double monthlyPay){
    this.monthlyPay = monthlyPay;
  }

  public double computeTwoWeekCheck(){
    double twoWeeks = monthlyPay / 2;
    //System.out.println("Two week check for "+ employeeName ": "+ twoWeeks);
    return twoWeeks;
  }
  public static void main(String[] args) {
    Salary sal1 = new Salary("Julian", "Houston", "4500.00");

    double twoWeeks = sal1.computeTwoWeekCheck();

    System.out.println(sal1.employeeName + " should receive a check for "+ twoWeeks);

  }

}
