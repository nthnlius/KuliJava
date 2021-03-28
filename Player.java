import java.util.ArrayList;
public class Player extends PlayerBase{
	private String name;
	private boolean inTurn = false;
	//constructor
	public Player(String name){
		super();
		this.name = name;
		this.playerdraw(7);
	}
	public String getname(){
		return this.name;
	}
	//Public methods for declare HIJI
	public void declaerHiji(){
		int cardsCount = this.getCardsLeft();
		if((this.inTurn == true) && cardsCount==1){
			System.out.printf("%d mendeklarasikan HIJI!\n", this.name);
		}
	}

	public void setInTurn(boolean b){
		this.inTurn = b;
	}

	public boolean isInTurn(){
		return this.inTurn;
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
		// public void buangcard(CardUmum input){
		// 	CardUmum cardsaatini;
		// 	if (input instanceof PowerCard){
		// 		cardsaatini = (PowerCard) input;//typecasting ke powercard
		// 		System.out.print("Kartu saat ini adalah : ");
		// 		cardsaatini.printcardinfo();
		// 	}
		// 	if (input instanceof NormalCard){
		// 		cardsaatini = (NormalCard) input;
		// 		System.out.print ("Kartu saat ini adalah : ");
		// 		cardsaatini.printcardinfo();
		// 	}
		// 	this.cardsCollection.remove(cardToRemove);
		// 	System.out.printf("berhasil membuang kartu power: %b, angka: %d, color: %d\n", power, angka, color);
			
		// }
	public CardUmum discard(CardUmum saatini){
		CardUmum input = saatini;
		CardUmum cardtobediscarded, carddummy;
		if (saatini instanceof NormalCard){
			input = (NormalCard)saatini;
		}
		else if (saatini instanceof PowerCard){
			input = (PowerCard)saatini;
		}
        System.out.println("Kartu saat ini adalah : "+input.getAngka() + " "+ input.getColor());
        this.printcard();
        System.out.println(""+(cardCollection.size()+1) +". Ambil kartu");
        boolean boleh, izin;
        System.out.print("Masukkan kartu yang mau dikeluarkan : ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if (p == cardCollection.size() + 1){
            izin = true;
        }
        else {
            izin = (cardCollection.get(p-1).iswarnasama(input) || cardCollection.get(p-1).isangkasama(input));
        }
        boleh = (p >= 1 && p<=cardCollection.size()+1);
        while (izin == false || boleh == false){
            System.out.println("input salah.");
            System.out.print("Masukkan kartu yang mau dikeluarkan : ");
            p = sc.nextInt();
            if ((p-1) == cardCollection.size()){
                izin = true;
            }
            else {
                izin = (cardCollection.get(p-1).iswarnasama(input) || cardCollection.get(p-1).isangkasama(input));
            }
            boleh = (p >= 1 && p<=cardCollection.size()+1);
        }
        if (p == cardCollection.size()+1){
            this.drawCard(1);
        }
        else {
            carddummy = cardCollection.get(p-1);
            cardCollection.remove((p-1));
			if (carddummy instanceof PowerCard){
				cardtobediscarded = (PowerCard)carddummy;
				if (cardtobediscarded.getcolornumber()==210){
					System.out.println("Pilih warna :");
					System.out.println("1. Merah");
					System.out.println("2. Biru");
					System.out.println("3. Kuning");
					System.out.println("4. Hijau");
					int inp = sc.nextInt();
					if (inp == 1){
						cardtobediscarded.setColor(2);
					}
					if (inp == 2){
						cardtobediscarded.setColor(3);
					}
					if (inp == 3){
						cardtobediscarded.setColor(5);
					}
					if (inp == 4){
						cardtobediscarded.setColor(6);
					}
				}
			}
			else{
				cardtobediscarded = (NormalCard)carddummy;
			}
            }
        sc.close();
        return cardtobediscarded;
	}
	public boolean havePlus(){
		boolean found = false;
		for (CardUmum c : cardsCollection){
			CardUmum a;
			if (c instanceof PowerCard){
				a = (PowerCard)c;
				if (a.getAngkaangka()== 2 || a.getAngkaangka()==4){
					found = true; break;
				}
			}
		}
		return found;
	}
}
