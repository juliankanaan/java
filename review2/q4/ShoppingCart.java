

import java.util.*;

class Item {
  double price;

  public Item(double price){
    this.price = price;
  }

}

public class ShoppingCart{

  // ArrayList<String> items = new ArrayList<String>(); // empty
  double[] items; // empty array of shit
  Item price; // from other class object
  int numItems;
  double taxRate = 0.05;

  public ShoppingCart() {

    items = new double[5]; // five empty cart slots
    numItems = 0; // by default upon creation of cart

  } // constructor
  public int getNumItems(){
    return numItems;
  }
  public double[] getCartItems(){
    return items; // double[] array
  }

  public void addItem(Item item){
    double newPrice = item.price;
    System.out.println("Adding "+ newPrice +"...");
    if (numItems < 5){
      items[numItems] = newPrice;
      numItems++;
    } else {
      System.out.println("Too many items");
    }
  }

}
