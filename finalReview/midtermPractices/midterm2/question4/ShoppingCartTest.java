import java.util.*;


public class ShoppingCartTest {

  public static void main(String[] args) {

    ArrayList<Item> items = new ArrayList<Item>(); // empty

    items.add(new Item(1.00) );
    items.add(new Item(5.00) );
    items.add(new Item(8.00) );

    ShoppingCart cart1 = new ShoppingCart(items);

    System.out.println(cart1.subtotal());


  }
}
