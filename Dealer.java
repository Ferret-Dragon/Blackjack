import java.util.ArrayList;
import java.util.Collections;

public class Dealer extends Person {
  private ArrayList<Card> deck;

  public Dealer() {
    super();
    deck = new ArrayList<Card>();
    newDeck();
  }

  public void newDeck() {
    for (int s = 1; s <= 4; s++) {
      for (int r = 1; r <= 13; r++) {
        deck.add(new Card(r, s));
      }
    }
    Collections.shuffle(deck);
  }

  public Card deal() {
    if (deck.size() == 0) {
      newDeck();
    }
    return deck.remove(0);
  }
}