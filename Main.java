import java.util.ArrayList;
import java.util.Collections;
import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {

    Player p = new Player();
    Dealer d = new Dealer();

    p.addCard(d.deal());
    p.addCard(d.deal());

    System.out.println("Players Turn:");
    while (p.hitOrStay() == true) {
      p.addCard(d.deal());
    }

    d.addCard(d.deal());
    d.addCard(d.deal());

    System.out.println("Dealers Turn:");
    while (d.hitOrStay() == true) {
      d.addCard(d.deal());
    }

    System.out.println(d.getHand() + "\n");

    if (p.getHandTotal() > 21) {
      System.out.println("Dealer Wins!");
    } else if (d.getHandTotal() > 21) {
      System.out.println("You Win!");
    } else {
      if (p.getHandTotal() > d.getHandTotal()) {
        System.out.println("You Win!");
      }

      if (d.getHandTotal() > p.getHandTotal()) {
        System.out.println("Dealer Wins!");
      }

      if (p.getHandTotal() == d.getHandTotal()) {
        System.out.println("It's a push!");
      }
    }
  }

  // System.out.println(c);
  // Person p = new Person();

}
// }
