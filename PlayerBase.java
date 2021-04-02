import java.util.ArrayList;

class PlayerBase{
  protected ArrayList<CardUmum> cardsCollection; // atribut koleksi kartu

  //Constructor
  public PlayerBase(){
    cardsCollection = new ArrayList<CardUmum>();
  }

  //Public methods (getters)
  public ArrayList<CardUmum> getCardsCollection(){
    return this.cardsCollection;
  }

  public int getCardsLeft(){
    return this.cardsCollection.size();
  }
  //Public methods for draw
  // public void draw(Deck deck, int count){
  //   for (int i=0; i<count; i++){
  //     //Asumsi jika class Deck mempunyai method getOneCard() untuk mengembalikan
  //     //satu Card pada PlayerBase, sekaligus mengurangi satu Card pada Deck
  //     CardUmum c = deck.drawcard();
  //     this.cardsCollection.add(c);
  //     if (c instanceof NormalCard){
  //       c = (NormalCard)c;
  //       System.out.print("Anda telah mengambil kartu ");
  //       c.printcardinfo();
  //     } 
  //     else if (c instanceof PowerCard){
  //       c = (PowerCard)c;
  //       System.out.print("Anda telah mengambil kartu ");
  //       c.printcardinfo();
  //     }
  //     //System.out.printf("mengambil kartu power: %b, angka: %d, color: %d\n", c.getPower(), c.getAngka(), c.getColor());
  //   }
  // }

  //Public methods for discard
  // public void discard(boolean power, int angka, int color){
  //   CardUmum cardToRemove;
  //   for(CardUmum c : this.cardsCollection) {
  //     if (c.getPower() == power){
  //       if ((c.getAngka() == angka) && (c.getColor() == color)){
  //         cardToRemove = c;
  //         break;
  //       }
  //     } else {
  //       continue; // skip jika tidak sesuai
  //     	}
  //   	}
	// }
	// public void buangcard(CardUmum tersedia){
	// 	CardUmum cardsaatini;
	// 	if (tersedia instanceof PowerCard){
	// 		cardsaatini = (PowerCard) tersedia;//typecasting ke powercard
	// 		System.out.print("Kartu saat ini adalah : ");
	// 		cardsaatini.printcardinfo();
	// 	}
	// 	if (tersedia instanceof NormalCard){
	// 		cardsaatini = (NormalCard) tersedia;
	// 		System.out.print ("Kartu saat ini adalah : ");
	// 		cardsaatini.printcardinfo();
	// 	}
	// 	this.cardsCollection.remove(cardToRemove);
	// 	System.out.printf("berhasil membuang kartu power: %b, angka: %d, color: %d\n", power, angka, color);
		
	// }

  public void printcard(){
	  int i = 0;
	  CardUmum d;
	  for (CardUmum c : this.cardsCollection){
		i++;  
		System.out.print(""+i+".");
		if (c instanceof PowerCard){
			d = (PowerCard)c;
			d.printcardinfo();
		}
		else if (c instanceof NormalCard){
			d = (NormalCard)c;
			d.printcardinfo();
		}
	  }
	  System.out.printf("%d. Ambil Card\n", (i+1));
  }

  public void playerdraw(int count){
		int i;
		CardUmum cardtoadd;
    Deck deck = new Deck();
		for (i = 0; i<count;i++){
			cardtoadd = deck.drawcard();
			cardsCollection.add(cardtoadd);
		}
	}
  
}