import java.util.*;

public class PhoneBookTest {
  public static void main(String[] args) {
    System.out.println("Creating basic user....\n");
    NormalUser basicUser1 = new NormalUser("122", "jkanaan", "hunter2", "jk5237@nyu.edu");

    System.out.println("Creating admin user....\n");
    PhoneBookAdmin admin1 = new PhoneBookAdmin("20", "admin1", "hunter3", "admin@google.com");

    basicUser1.changePassword("password1");
    // Output: User does not have permission to do this

    admin1.printAdminInfo();
    // user CAN do this

  }
}
