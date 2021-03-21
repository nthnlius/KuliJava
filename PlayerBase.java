import java.util.ArrayList;

class PlayerBase{
  private ArrayList<Card> cardsCollection; // atribut koleksi kartu

  //Constructor
  public PlayerBase(ArrayList<Card> cards){
    this.cardsCollection = cards;
  }

  //Public methods (getters)
  public ArrayList<Card> getCardsCollection(){
    return this.cardsCollection;
  }

  public int getCardsLeft(){
    return this.cardsCollection.size();
  }

  //Public methods for draw
  public void draw(Deck deck, int count){
    for (int i=0; i<count; i++){
      //Asumsi jika class Deck mempunyai method getOneCard() untuk mengembalikan
      //satu Card pada PlayerBase, sekaligus mengurangi satu Card pada Deck
      Card c = deck.getOneCard();
      this.cardsCollection.add(c); 
      System.out.printf("mengambil kartu power: %b, angka: %d, color: %d\n", c.getPower(), c.getAngka(), c.getColor());
    }
  }

  //Public methods for discard
  public void discard(boolean power, int angka, int color){
    Card cardToRemove;
    for(Card c : this.cardsCollection) {
      if (c.getPower() == power){
        if ((c.getAngka() == angka) && (c.getColor() == color)){
          cardToRemove = c;
          break;
        }
      } else {
        continue; // skip jika tidak sesuai
      }
    }

    this.cardsCollection.remove(cardToRemove);
    System.out.printf("berhasil membuang kartu power: %b, angka: %d, color: %d\n", power, angka, color);
  }
}