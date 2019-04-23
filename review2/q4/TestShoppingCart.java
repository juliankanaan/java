import java.util.*;

public class TestShoppingCart {


  public static void main(String[] args) {

    ShoppingCart cart1 = new ShoppingCart(); // make a new cart

    System.out.println("Created a cart w "+ cart1.getNumItems() + " items");

    printCart( cart1.getCartItems() ); // current cart before adding

    for (int i=0; i < 5; i++){

      double randPrice = generateRandomPrice();
      Item x = new Item(randPrice);

      cart1.addItem(x);

    }
    printCart(cart1.getCartItems());



  }
  public static void printCart(double[] cart){ // pass whole cart to it
    for ( int i=0; i<cart.length; i++){
      System.out.println( "Item: "+ cart[i] );
    }
  }
  public static double generateRandomPrice(){
    double num = Math.random() * 10;
    return num;
  }

}
