public class Card {
  // Attributes
  // private int value;
  private int suit;
  private int rank;

  // int rank, suit

  public Card() {
    rank = (int) (Math.random() * 13 + 1);
    suit = (int) (Math.random() * 4 + 1);
  }

  public Card(int r, int s) {
    rank = r;
    suit = s;
  }

  public String toString() {
    String c = "";

    if (rank == 1) {
      c = " Ace of ";
    } else if (rank == 11) {
      c = " Jack of ";
    } else if (rank == 12) {
      c = " Queen of ";
    } else if (rank == 13) {
      c = " King of ";
    } else {
      c = c + rank + " of ";
    }

    if (suit == 1) {
      c = c + " Spades ♤ ";
    } else if (suit == 2) {
      c = c + " Clubs ♧ ";
    } else if (suit == 3) {
      c = c + " Hearts ♡ ";
    } else if (suit == 4) {
      c = c + " Diamonds ♢ ";
    }
    return c;
  }

  public int getRank() {
    return rank;
  }

  public int getSuit() {
    return suit;
  }

  public int getPoints() {
    if (rank == 1) {
      return 11;
    }
    if (rank == 11 || rank == 12 || rank == 13) {
      return 10;
    }
    return rank;
  }

  public void setRank(int r) {
    rank = r;
  }

  public void setSuit(int s) {
    suit = s;
  }

  /*
   * public int getValue(){ if(rank>10){ value = 10; } else if(rank==1){ value =
   * 11; } else{ value = rank; } return value; }
   * 
   * public void setValue(int set){ value = set; }
   */
  // Constructors

  // Methods

}