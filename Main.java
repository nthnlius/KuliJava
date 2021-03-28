import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main{
    public static void main(String[] args){
        Deck deck = new Deck();//deklarasi pengayaan koleksi kartu
        Scanner sca = new Scanner(System.in);
        System.out.print("Jumlah Player : ");
        int jumplay = sca.nextInt(); //menentukan jumlah player
        int plus = 0; // untuk menyimpan berapa plus yang saat ini disimpan
        boolean plusing = false; // untuk menyimpan apakah kondisi saat ini sedang oper-operan plus
        CardUmum meja = deck.openingcard();// mengambil satu kartu angka acak untuk dijadikan pembuka
        private List<Player> listplayer = new ArrayList<Player>();//menyimpan urutan player dalam bentuk list
        int i = 0; // iterator
        int giliran = 0;
        for (i = 0 ; i<jumplay; i++){
            System.out.println("Masukkan nama untuk player "+ (i+1));
            String nama = sc.nextLine();
            Player player1 = new Player(nama);
            listplayer.add(player1);
        }
        while (listplayer.size() == jumplay){//setup game selama belum ada yang keluar atau menang
            giliran ++;
            playerinturn = listplayer.get(giliran % jumplay);
            if (plusing == false){
                plus = 0;
                meja = playerinturn.discard(meja);
                if (meja instanceof PowerCard){
                    CardUmum tes = (PowerCard)meja;
                    if (tes.getangkaAngka() == 2 || tes.getangkaAngka()==4){
                        plusing = true;
                        plus += tes.getangka;
                    }
                    else if (meja.getangkaAngka() == 1){
                        Collections.reverse(listplayer);
                        for (int i = 0; i< jumplay;i++){
                            if (playerinturn = listplayer.get(i)){
                                giliran = i;
                                /* menghandle kasus redundansi dimana
                                jika urutan pemain di-reverse
                                urutan pemain tidak sesuai
                                */
                            }
                        }
                    }
                    else if (meja.getangkaAngka()==0){
                        giliran++;
                    }
                }
            }
            else{//kondisi lagi tumpuk menumpuk plus
                if (playerinturn.haveplus()){
                    meja = playerinturn.discard(meja);
                }
                else{
                    playerinturn.draw(plus);//memaksa player untuk mengambil card
                    plusing = false; // keluar dari kondisi tumpuk menumpuk plus
                }
            }
        }
    }
}
// public class Main{
//     public static void main (String[] args){
//         List list1 = new  ArrayList<String>();
//         list1.add("Andri");
//         list1.add("Bambang");
//         list1.add("Cecep");
//         list1.add("Rudi");
//         System.out.println(list1);
//         Collections.reverse(list1);
//         System.out.println(list1);
//     }
// }
