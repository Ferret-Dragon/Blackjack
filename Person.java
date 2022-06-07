import java.util.ArrayList;

public class Person {
  private ArrayList<Card> hand;

  public Person() {
    hand = new ArrayList<Card>();
  }

  public void addCard(Card c) {
    hand.add(c);
  }

  public ArrayList<Card> getHand() {
    return hand;
  }

  public int getHandTotal() {
    int total = 0;
    for (int n = 0; n < hand.size(); n++) {
      if (hand.get(n).getRank() == 11 || hand.get(n).getRank() == 12 || hand.get(n).getRank() == 13) {
        total = total + 10;
      } else if (hand.get(n).getRank() == 1) {
        total = total + 11;
      } else {
        total = total + hand.get(n).getRank();
      }
    }
    return total;
  }

  public boolean hitOrStay() {
    if (getHandTotal() > 16) {
      return false;
    } else {
      return true;
    }
  }

  public String toString() {
    return "" + hand;
  }
}