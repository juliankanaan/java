import java.util.*;
public class Gamer implements Comparable<Gamer>{
  double highScore;
  public Gamer(double highScore) {
    this.highScore = highScore;
  }

  public int compareTo(Gamer obj){

    if (highScore > obj.highScore) {
      return 1;
    } else if (highScore < obj.highScore) {
      return -1;
    } else {
      return 0;
    }

  }



}
