import java.util.*;


/*
OOP,

usage: javac LessonTwelve
       java CreateUser // actually runs the prohra, 
*/



  class CreateUser {
    int userAge; // data fields
    String userCity;
    String userName;


      public CreateUser(int age, String name){ // constructor
        userAge  = age;
        userName = name;
      }
      public void setCity(String city){
        userCity = city;
      }

      public static void main(String []args){
        /* Create object */
        CreateUser user1 = new CreateUser(12, "tom");
        CreateUser user2 = new CreateUser(22, "jill");

        /* call a method to set other things */
        user1.setCity("dallas");
        user2.setCity("houston");

        /* Access set variables */
        System.out.println("user1 has a name of: "+ user1.userName + " and city of: "+user1.userCity );
      }
    } // CreateUser
