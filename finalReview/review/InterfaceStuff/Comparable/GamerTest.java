import java.util.*;
public class GamerTest {
  public static void main(String[] args) {
    ArrayList<Gamer> gamers = new ArrayList<Gamer>(); // empty

    // add to it
    gamers.add( new Gamer(2000) );
    gamers.add( new Gamer(10) );
    gamers.add( new Gamer(50000) );

    // sort these boys

    Collections.sort(gamers);
    // iterate
    for (Gamer g : gamers) {
      System.out.println(g.highScore);

    }


  }
}
