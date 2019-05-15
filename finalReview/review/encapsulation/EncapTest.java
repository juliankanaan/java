import java.util.*;

public class EncapTest extends Employee  {

  public EncapTest(){
    super(100, "test");
    
  }

  public static void main(String[] args) {

    //privateMethod(); // should throw error

    publicMethod(); // should be fine

    System.out.println("CEOs name is " + ceoName);

    //ceoName = "John"; // impossible to do

    // managerName = "Mr. Manager"; can't do this to a final variable

    System.out.println("Manager name is " + managerName);

  }

}
