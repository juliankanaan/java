

import java.util.*;


public class SplitString {
  String s;

  public SplitString(String s){ // constructor
   this.s = s;
  }

  public void splitAndPrint(){
    String[] partials = s.split(" ");
    for (int i =0; i < partials.length; i++){

        System.out.println(partials[i]);

    }

  }
  

}
