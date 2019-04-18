import java.util.*;

// objects & classes 2
//package lesson13;

class CreateUser {
  int userAge; // data fields
  String userCity; // null by default
  String userName; // public and visible to all child classes & methods
  private double userSalary; // only visible within this class


  public CreateUser(int age, String name){ // constructor
    userAge  = age;
    userName = name;
  }
  public void setCity(String city){
    userCity = city;
  }
  private void setSalary(double num){
    userSalary = num;
  }
  /* Passing in a method object into a function */

  public static void showSalary(CreateUser user){ // passing an argument

    double salary = user.userSalary;

    System.out.println("Salary is: "+salary);
  }

  /*Create array of objects */
  public static CreateUser[] createArrayOfEmployeeNames(){

    CreateUser[] arr1 = new CreateUser[5];

    for (int i=0; i < arr1.length; i++){
      int age = (int) Math.random()* 100;
      String name = "John"+i;
      arr1[i] = new CreateUser(age, name); // create random peop;e w/ ages

    }

    return arr1;
  }
  /* Print an array of objects */
  public static void printEmployeeArray(CreateUser[] arr){

    for (int i=0; i < arr.length; i++){
      System.out.println("User:");
      System.out.println(arr[i]); // name
    }

  }

  public static void main(String []args){
    /* Create object */
    CreateUser user1 = new CreateUser(12, "tom");
    CreateUser user2 = new CreateUser(22, "jill");

    /* call a method to set other things */
    user1.setCity("dallas");
    user2.setCity("houston");
    user1.setSalary(1232.00);


    /* Access set variables */
    System.out.println("user1 has a name of: "+ user1.userName + " and city of: "+user1.userCity );
    System.out.println("User1 has a salary of: "+user1.userSalary);


    /* passing object argument */
    showSalary(user1);

    /* declaring array */
    CreateUser[] randomUserArray;

    // create array
    randomUserArray = createArrayOfEmployeeNames();

    printEmployeeArray(randomUserArray);



  }
  } // CreateUser
