
import java.util.*;
public class ShoppingCart {
  ArrayList<Item> cart = new ArrayList<Item>(); // empty cart
  //Item[] cart = {}; // empty arr for Item objects
  int numItems = cart.size();
  double taxRate = 0.8;

  public ShoppingCart(){

  }
  public ShoppingCart(ArrayList<Item> cart){
    this.cart = cart;
  }
  public boolean addItem(Item i){
    if (numItems > 9) {
      return false;
    } else {
      cart.add(i);
      return true;
    }
  }
  public double subtotal(){
    double total = 0;
    for (Item item : cart) {
      total += item.price;
    }
    return total;
  }



}
class Item {
  double price;

  public Item(){
    // no arg
  }
  public Item(double price){
    this.price = price;
  }
}
