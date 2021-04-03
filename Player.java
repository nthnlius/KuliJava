import java.util.ArrayList;
import java.util.Scanner;
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
		if((this.inTurn) && cardsCount==1){
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
	  //     //System.out.printf("mengambil kartu power: %b, angka: %d, color: %d\n", c.getPower(), c.getAngka(), c.getcolor());
	  //   }
	  // }
	
	  //Public methods for discard
	  // public void discard(boolean power, int angka, int color){
	  //   CardUmum cardToRemove;
	  //   for(CardUmum c : this.cardsCollection) {
	  //     if (c.getPower() == power){
	  //       if ((c.getAngka() == angka) && (c.getcolor() == color)){
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
		CardUmum input = null;
		int commandnumber = 0;
		if (saatini instanceof NormalCard){
			input = (NormalCard)saatini;
		}
		else if (saatini instanceof PowerCard){
			input = (PowerCard)saatini;
		}
//		CardUmum input = baru;
		System.out.println("Kartu saat ini adalah : "+input.getAngka() + " "+ input.getcolor());
		System.out.println(cardsCollection.size());
        this.printcard();
		System.out.println(""+(cardsCollection.size()+1)+". Ambil Kartu");
        boolean boleh = false;
		boolean izin = false;
        System.out.print("Masukkan kartu yang mau dikeluarkan : ");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        if (p == cardsCollection.size() + 1){
            izin = true;
        }
        else {
            // izin = (cardsCollection.get(p-1).iswarnasama(input) || cardsCollection.get(p-1).isangkasama(input));
			if (cardsCollection.get(p-1) instanceof PowerCard){
				if (cardsCollection.get(p-1).getAngkaangka() == 2 || cardsCollection.get(p-1).getAngkaangka() == 4){
					izin = true;
				}
				else{
					izin = (cardsCollection.get(p-1).iswarnasama(input) || cardsCollection.get(p-1).isangkasama(input));
				}
			}
			else{
				izin = (cardsCollection.get(p-1).iswarnasama(input) || cardsCollection.get(p-1).isangkasama(input));
			}
        }
        boleh = (p >= 1 && p<=cardsCollection.size()+1);
        while (!izin || !boleh){
            System.out.println("input salah.");
            System.out.print("Masukkan kartu yang mau dikeluarkan : ");
            p = sc.nextInt();
            if ((p-1) == cardsCollection.size()){
                izin = true;
            }
            else {
                if (cardsCollection.get(p-1) instanceof PowerCard){
					if (cardsCollection.get(p-1).getAngkaangka() == 2 || cardsCollection.get(p-1).getAngkaangka() == 4){
						izin = true;
					}
					else{
						izin = (cardsCollection.get(p-1).iswarnasama(input) || cardsCollection.get(p-1).isangkasama(input));
					}
				}
				else{
					izin = (cardsCollection.get(p-1).iswarnasama(input) || cardsCollection.get(p-1).isangkasama(input));
				}
			}
            boleh = (p >= 1 && p<=cardsCollection.size()+1);
        }
		if (p > 0 && p<= cardsCollection.size()){
			CardUmum cardsampah = cardsCollection.remove(p-1);
			CardUmum  discardedcard = null;
				//cardsCollection.remove((p-1));
			if (cardsampah instanceof PowerCard){//typecasting cardtobediscarded jadi power card karena carddummy adalah power card
				discardedcard = (PowerCard)cardsampah;
				if (discardedcard.getcolornumber()==210){
					System.out.println("Pilih warna :");
					System.out.println("1. Merah");
					System.out.println("2. Biru");
					System.out.println("3. Kuning");
					System.out.println("4. Hijau");
					int inp = sc.nextInt();
					while (inp >4 || inp <1){
						System.out.println("Warna tersebut tidak nyata");
						inp = sc.nextInt();
					}
					if (inp == 1){
						discardedcard.setColor(2);
					}
					else if (inp == 2){
						discardedcard.setColor(3);
					}
					else if (inp == 3){
						discardedcard.setColor(5);
					}
					else if (inp == 4){
						discardedcard.setColor(7);
					}
				}
			}
			else if (cardsampah instanceof NormalCard){
				discardedcard = (NormalCard)cardsampah;
			}
			return discardedcard;
		}
		else if (p == cardsCollection.size()+1){
			this.playerdraw(1);
			return saatini;
		}
		else{
			CardUmum baru = new NormalCard(4, 7);
			return baru;
		}
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
	public boolean havemultiple(CardUmum card){
		boolean have = false;
		for (CardUmum c : cardsCollection){
			if (c.equals(card)){
				have = true;
				break;
			}
		}
		return have;
	}
	public int howmanymultiple(CardUmum meja){
		int counter = 0;
		if (this.havemultiple(meja)){
			for (CardUmum c : cardsCollection){
				if (c.equals(meja)){
					counter ++;
				}
			}
		}
		return counter;
	}
	public CardUmum multiplediscard(CardUmum meja){
		
		Scanner scnr = new Scanner(System.in);
		if (this.havemultiple(meja)){
			System.out.print("you have Multiple Card. Wanna Multiple discard? (Y/N) : ");
			String piilih = scnr.nextLine();
			if (piilih.charAt(0) == 'N'||piilih.charAt(0) == 'n'){
				return meja;
			}
			else if (piilih.charAt(0) == 'Y' || piilih.charAt(0) == 'y'){
				CardUmum input = meja;
				boolean izin = false;
				boolean boleh = false;
				this.printcard();
				System.out.println(""+(cardsCollection.size()+1)+". Cancel");
				System.out.println("Masukkan kartu yang mau dikeluarkan : ");
				int p = scnr.nextInt();
				if ((p-1) == cardsCollection.size()){
					izin = true;
				}
				else {
					izin = (cardsCollection.get(p-1).iswarnasama(input) && cardsCollection.get(p-1).isangkasama(input));
				}
				boleh = (p >= 1 && p<=cardsCollection.size()+1);
				while (!izin || !boleh){// blok pengulangan penerimaan input jika input salah
					System.out.println("Kartunya beda bang.");
					System.out.print("Masukkan kartu yang mau dikeluarkan : ");
					p =scnr.nextInt();
					if ((p-1) == cardsCollection.size()){
						izin = true;
					}
					else {
						izin = (cardsCollection.get(p-1).iswarnasama(input) || cardsCollection.get(p-1).isangkasama(input));
					}
					boleh = (p >= 1 && p<=cardsCollection.size()+1);
				}
				if (p > 0 && p<= cardsCollection.size()){
					CardUmum cardsampah = cardsCollection.remove(p-1);
					CardUmum  discardedcard = null;
					//cardsCollection.remove((p-1));
					if (cardsampah instanceof PowerCard){//typecasting cardtobediscarded jadi power card karena carddummy adalah power card
						discardedcard = (PowerCard)cardsampah;
						if (discardedcard.getcolornumber()==210){//block pengecekan apakah wildcard atau bukan
							System.out.println("Pilih warna :");
							System.out.println("1. Merah");
							System.out.println("2. Biru");
							System.out.println("3. Kuning");
							System.out.println("4. Hijau");
							int inp = scnr.nextInt();
							while (inp >4 || inp <1){
								System.out.println("Warna tersebut tidak nyata");
								inp = scnr.nextInt();
							}
							if (inp == 1){
								discardedcard.setColor(2);
							}
							else if (inp == 2){
								discardedcard.setColor(3);
							}
							else if (inp == 3){
								discardedcard.setColor(5);
							}
							else if (inp == 4){
								discardedcard.setColor(7);
							}
						}
						return discardedcard;
					}
					else if (cardsampah instanceof NormalCard){
						discardedcard = (NormalCard)cardsampah;
					}
					return discardedcard;
				}
			}
		}
		return meja;
	}
	public void addCard(CardUmum card){
		cardsCollection.add(card);
	}
	public boolean havesame(CardUmum meja){
		for (CardUmum c : cardsCollection){
			if (c.iswarnasama(meja) || c.isangkasama(meja)){
				return true;
			}
		}
		return false;
	}
	public CardUmum getLastCard(){
		int urutan = this.cardsCollection.size();
		CardUmum returning = this.cardsCollection.get(urutan -1);
		return returning;
	}
	public CardUmum discardlastcard(){
		int urutan = this.cardsCollection.size();
		CardUmum cardsampah = cardsCollection.remove(urutan -1);
		CardUmum  discardedcard = null;
		//cardsCollection.remove((p-1));
		if (cardsampah instanceof PowerCard){//typecasting cardtobediscarded jadi power card karena carddummy adalah power card
			discardedcard = (PowerCard)cardsampah;
			if (discardedcard.getcolornumber()==210){//block pengecekan apakah wildcard atau bukan
				Scanner scnr = new Scanner(System.in);
				System.out.println("Pilih warna :");
				System.out.println("1. Merah");
				System.out.println("2. Biru");
				System.out.println("3. Kuning");
				System.out.println("4. Hijau");
				int inp = scnr.nextInt();
				while (inp >4 || inp <1){
					System.out.println("Warna tersebut tidak nyata");
					inp = scnr.nextInt();
				}
				if (inp == 1){
					discardedcard.setColor(2);
				}
				else if (inp == 2){
					discardedcard.setColor(3);
				}
				else if (inp == 3){
					discardedcard.setColor(5);
				}
				else if (inp == 4){
					discardedcard.setColor(7);
				}
			}
			return discardedcard;
		}
		return cardsampah;
	}
}
