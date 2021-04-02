import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void menu(){
        System.out.println("1. List Players");
        System.out.println("2. List Cards");
        System.out.println("3. Discard");
        System.out.println("4. Draw");
        System.out.println("5. Declare Hiji");
        System.out.println("6. View Player in Turn");
        System.out.println("7. Help");
    }
    public static void printhelp(){
        System.out.println("What help do you need?");
        System.out.println("1. How to play Hiji");
        System.out.println("2. How to play Card");
        System.out.println("3. How to draw Card");
        System.out.println("4. How to multiple discard");
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a ==1){
            System.out.println("Cara Bermain Hiji sama dengan cara bermain UNO");
            System.out.println("info lebih lanjut harap kunjungi ");
        }
        if (a == 2){
            System.out.println("pada Menu utama pilihlah perintah ke-3");
        }
        if (a == 3){
            System.out.println("pada Menu utama pilihlah perintah ke-4");
        }
        if (a==4){
            System.out.println("Multiple Discard diizinkan untuk kartu yang sama warna dan sama angka");
        }
    }
    public static void main(String[] args){
        Deck deck = new Deck();//deklarasi pengayaan koleksi kartu
        Player playerinturn = null;
        Random rd = new Random();
        Scanner sca = new Scanner(System.in);
        System.out.print("Jumlah Player : ");
        int jumplay = sca.nextInt(); //menentukan jumlah player
        int firstplayer = rd.nextInt(jumplay);//me-random player pertama
        String variabelnganggur = sca.nextLine();//ini variabel nganggur biar nama player pertamanya ga '\n'
        int plus = 0; // untuk menyimpan berapa plus yang saat ini disimpan
        boolean plusing = false; // untuk menyimpan apakah kondisi saat ini sedang oper-operan plus
        CardUmum meja = deck.openingcard();// mengambil satu kartu angka acak untuk dijadikan pembuka
        CardUmum tes = null;
         List<Player> listplayer = new ArrayList<Player>();//menyimpan urutan player dalam bentuk list
        int i = 0; // iterator
        int giliran = firstplayer+1;
        Player winner = null;
        for (i = 0 ; i<jumplay; i++){
            System.out.println("Masukkan nama untuk player "+ (i+1));
            String nama = sca.nextLine();
            Player player1 = new Player(nama);
            listplayer.add(player1);
        }
        int skipped = 0;
        while (winner == null){//setup game selama belum ada yang keluar atau menang
            
            giliran++;
            playerinturn = listplayer.get(giliran % jumplay);
            
                
            System.out.println("Sekarang giliran : "+ playerinturn.getname());
            int pilih = 0;
            
            while (pilih != 3 && pilih != 4){
                menu();
                System.out.print("Masukkan angka : ");
                pilih = sca.nextInt();
                
                if(pilih == 1){
                    for(Player p : listplayer){
                        int a = 1;
                        System.out.println("Player "+a+": "+p.getname());
                        System.out.println("Kartu Tersisa : "+p.getCardsLeft());
                        if (p.equals(playerinturn)){
                            System.out.println("Sedang dalam giliran");
                        }
                        else{
                            System.out.println("Tidak Sedang dalam giliran");
                        }
                        a++;
                    }
                }
                else if (pilih == 2){
                    playerinturn.printcard();
                }
                else if (pilih == 3){
                    if (plusing == false){
                        plus = 0;
                        CardUmum beforediscard = meja;
                        CardUmum discarded = playerinturn.discard(meja, pilih);
                        if (discarded == beforediscard){
                            discarded = null;
                        }
                        else{
                            meja = discarded;
                        }
                        
                        if (meja instanceof PowerCard){
                            tes = (PowerCard)meja;
                            if ((tes.getAngkaangka() == 2 || tes.getAngkaangka()==4)){
                                plus += tes.getAngkaangka();
                            }
                            else if (meja.getAngkaangka() == 1){
                                Collections.reverse(listplayer);
                                for (i = 0; i< jumplay;i++){
                                    if (playerinturn.equals(listplayer.get(i))){
                                        giliran = i;
                                        /* menghandle kasus redundansi dimana
                                        jika urutan pemain di-reverse
                                        urutan pemain tidak sesuai
                                        */
                                    }
                                }
                            }
                            else if (discarded.getAngkaangka()==0){
                                /* tbh ini kalo skip belom kodenya kek gimana
                                   tapi konsepnya tuh ada token skipped.
                                   setiap kartu skip dimainkan, tokennya tuh nambah.
                                   giliran akan bertambah sebanyak token kali.
                                */
                                giliran++;
                            }
                        }
                    }
                    else{//kondisi lagi tumpuk menumpuk plus
                        if (playerinturn.havePlus()){
                            CardUmum beforediscarding = meja;
                            meja = playerinturn.discard(meja, pilih);
                            if (beforediscarding == meja){
                                playerinturn.playerdraw(plus-1);
                                plusing = false;
                            }
                            
                        }
                        else{
                            playerinturn.playerdraw(plus);//memaksa player untuk mengambil card
                            plusing = false; // keluar dari kondisi tumpuk menumpuk plus
                        }
                    }
                }
                else if (pilih == 4){
                    if (plusing){
                        playerinturn.playerdraw(plus);
                    }
                    else{
                        playerinturn.playerdraw(1);
                    }
                }
                else if (pilih == 5){
                    //Declare Hiji
                }
                else if (pilih == 6){
                    System.out.println("Sedang giliran : "+playerinturn.getname());
                    System.out.println("giliran berikutnya : "+listplayer.get((giliran+1) % jumplay).getname());
                }
                else if (pilih == 7){
                    printhelp();
                }
                if (playerinturn.getCardsLeft() == 0){
                    winner = playerinturn;
                    listplayer.clear();
                    System.out.println("Pemenangnya adalah "+ winner.getname());
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
// public class Main{
//     public static void main(String args[]){
//         Deck deck = new Deck();
//         deck.printDeck();
//     }
// }