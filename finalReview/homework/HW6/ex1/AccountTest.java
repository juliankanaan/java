import java.util.*;
public class AccountTest {
  public static void main(String[] args) {
    Account acct1 = new Account(122, 20000.00);

    System.out.println("Your acct balance is " + acct1.getBalance());

    System.out.println("Adding 2000 to acct");

    System.out.println( acct1.deposit(2000.00));

    System.out.println("Acct created");

    System.out.println( acct1.getDateCreated() );
  }
}
