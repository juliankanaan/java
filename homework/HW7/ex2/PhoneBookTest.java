import java.util.*;

public class PhoneBookTest {
  public static void main(String[] args) {

    NormalUser basicUser1 = new NormalUser(122, "jkanaan", "hunter2", "jk5237@nyu.edu");

    PhoneBookAdmin admin1 = new PhoneBookAdmin("admin1", "hunter3", "admin@google.com");

    basicUser1.changePassword();

  }
}
