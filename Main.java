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
            System.out.println("Permainan hanya dapat dimainkan oleh 2-6 orang pemain.");
            System.out.println("Di awal permainan, semua pemain akan mendapatkan 7 buah kartu.");
            System.out.println("Satu kartu angka dipilih secara acak untuk dijadikan kartu awal.");
            System.out.println("Pemain yang akan memulai giliran pertama akan diacak.");
            System.out.println("Pemain akan terus berlanjut sesuai giliran yang ditentukan.");
            System.out.println("Pada setiap giliran, pemain boleh mengeluarkan satu atau lebih");
            System.out.println ("kartu yang dapat dimainkan pada giliran tersebut. ");
            System.out.println("Apabila pemain tidak mengeluarkan kartu, pemain wajib mengambil satu kartu dari deck.");
            System.out.println("Apabila kartu yang baru diambil tersebut bisa dikeluarkan (discard), pemain boleh");
            System.out.println ("mengeluarkan kartu tersebut (tidak wajib).");
            System.out.println("Apabila kartu tersebut tidak dapat dikeluarkan (discard), maka giliran akan lanjut ke pemain selanjutnya.");
            System.out.println("Apabila pemain memiliki sisa satu kartu, maka pemain harus melakukan “Declare HIJI” dalam waktu 3 detik."); 
            System.out.println("Apabila tidak, pemain wajib mengambil dua kartu dari deck.");
            System.out.println("");
            System.out.println("");
            System.out.println("Winning Condition dari HIJI adalah");
            System.out.println("Untuk setiap permainan, jumlah pemenang hanyalah 1 orang.");
            System.out.println("Pemain dinyatakan menang apabila kartu yang dipegangnya sudah habis.");
            System.out.println("Jika pemenang sudah ditentukan, maka permainan akan berakhir bagi seluruh pemain.");
        }
        if (a == 2){
            System.out.println("pada Menu utama pilihlah perintah ke-3");
        }
        if (a == 3){
            System.out.println("pada Menu utama pilihlah perintah ke-4");
        }
        if (a==4){
            System.out.println("Multiple discard dapat dilakukan apabila suatu pemain memiliki lebih dari satu") ;
            System.out.println("kartu yang sama persis (sama warna dan sama angka) dan sesuai dengan kartu yang");
            System.out.println("pemain sebelumnya telah keluarkan, pemain tersebut dapat mengeluarkan semua atau");
            System.out.println("sebagian kartu tersebut dalam satu giliran. Apabila kartu tersebut memiliki power , maka:") ;
            System.out.println("Untuk kartu Draw 2, pemain selanjutnya akan mengambil kartu sebanyak dua kali dari jumlah");
            System.out.println("kartu yang dikeluarkan (Contoh: Pemain sebelumnya mengeluarkan 2 kartu Draw 2 maka pemain");
            System.out.println("selanjutnya mengambil 4 kartu dari deck).");
            System.out.println("");
            System.out.println("Untuk kartu Draw 4, pemain selanjutnya akan mengambil kartu sebanyak empat kali dari jumlah");
            System.out.println("kartu yang dikeluarkan dari deck (Contoh: Pemain sebelumnya mengeluarkan 2 kartu Draw 4 maka");
            System.out.println("pemain selanjutnya mengambil 8 kartu dari deck). Namun, pemain sebelumnya hanya dapat memilih");
            System.out.println("satu warna saja.");
            System.out.println("");
            System.out.println("Untuk kartu Skip, jumlah pemain yang dilewati sesuai dengan jumlah kartu Skip yang dikeluarkan.");
            System.out.println("");
            System.out.println("Untuk kartu Reverse, urutan akan membolak-balik sesuai jumlah kartu. Misalnya ada dua kartu Reverse, ");
            System.out.println("maka urutan pemain tidak berubah.");
            System.out.println("");
            System.out.println("Untuk kartu Wildcard, pemain tetap hanya dapat memilih satu warna.");

        }
    }
    public static void mainmenu(){
        System.out.println("1. Start Game");
        System.out.println("2. How to play");
        System.out.println("3. Help");
    }
    public static void main(String[] args){
        Deck deck = new Deck();//deklarasi pengayaan koleksi kartu
        Player playerinturn = null;
        Random rd = new Random();
        Scanner sca = new Scanner(System.in);
        int jumplay;
        boolean gamenotstarted = true;
        while (gamenotstarted){
            mainmenu();
            int pilihan = sca.nextInt();
            if (pilihan == 1){
                gamenotstarted = false;
            }
            else if (pilihan == 2){
                System.out.println("Permainan hanya dapat dimainkan oleh 2-6 orang pemain.");
                System.out.println("Di awal permainan, semua pemain akan mendapatkan 7 buah kartu.");
                System.out.println("Satu kartu angka dipilih secara acak untuk dijadikan kartu awal.");
                System.out.println("Pemain yang akan memulai giliran pertama akan diacak.");
                System.out.println("Pemain akan terus berlanjut sesuai giliran yang ditentukan.");
                System.out.println("Pada setiap giliran, pemain boleh mengeluarkan satu atau lebih"); 
                System.out.println("kartu yang dapat dimainkan pada giliran tersebut. ");
                System.out.println("Apabila pemain tidak mengeluarkan kartu, pemain wajib mengambil satu kartu dari deck.");
                System.out.println("Apabila kartu yang baru diambil tersebut bisa dikeluarkan (discard),"); 
                System.out.println("pemain boleh mengeluarkan kartu tersebut (tidak wajib).");
                System.out.println("Apabila kartu tersebut tidak dapat dikeluarkan (discard), maka giliran"); 
                System.out.println("akan lanjut ke pemain selanjutnya.");
                System.out.println("Apabila pemain memiliki sisa satu kartu, maka pemain harus melakukan");
                System.out.println("“Declare HIJI” dalam waktu 3 detik. Apabila tidak, pemain wajib mengambil dua kartu dari deck.");
                System.out.println("");
                System.out.println("");
                System.out.println("Winning Condition dari HIJI adalah");
                System.out.println("Untuk setiap permainan, jumlah pemenang hanyalah 1 orang.");
                System.out.println("Pemain dinyatakan menang apabila kartu yang dipegangnya sudah habis.");
                System.out.println("Jika pemenang sudah ditentukan, maka permainan akan berakhir bagi seluruh pemain.");
            }
            else if (pilihan == 3){
                printhelp();
            }
        }
        System.out.print("Jumlah Player (2-6): ");
        jumplay = sca.nextInt(); //menentukan jumlah player
        while (jumplay >6 || jumplay <2){
            System.out.println(
                "Jumlah pemain dibataskan untuk 2 pemain hingga 6 pemain. Sedangkan yang anda masukkan ada sebanyak "+ jumplay+" pemain");
            System.out.print("Jumlah Player (2-6): ");
            jumplay = sca.nextInt(); //menentukan jumlah player
        }
        int firstplayer = rd.nextInt(jumplay);//me-random player pertama
        String variabelnganggur = sca.nextLine();//ini variabel nganggur biar nama player pertamanya ga '\n'
        int plus = 0; // untuk menyimpan berapa plus yang saat ini disimpan
        boolean plusing = false; // untuk menyimpan apakah kondisi saat ini sedang oper-operan plus
        boolean ishiji = false;
        CardUmum meja = deck.openingcard();// mengambil satu kartu angka acak untuk dijadikan pembuka
        CardUmum tes = null;
        long startTime = 0;
         List<Player> listplayer = new ArrayList<Player>();//menyimpan urutan player dalam bentuk list
        int i = 0; // iterator
        int giliran = firstplayer+1;
        Player winner = null;
        int numdiscard = 0;
        for (i = 0 ; i<jumplay; i++){
            System.out.println("Masukkan nama untuk player "+ (i+1));
            String nama = sca.nextLine();
            Player player1 = new Player(nama);
            listplayer.add(player1);
        }
        while (winner == null){//setup game selama belum ada yang keluar atau menang
            numdiscard = 0;
            giliran++;
            ishiji = false;
            playerinturn = listplayer.get(giliran % jumplay);
            
                
            System.out.println("Sekarang giliran : "+ playerinturn.getname());
            int pilih = 0;
            
            while (pilih != 3 && pilih != 4 && pilih != 8){
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
                        CardUmum discarded = playerinturn.discard(meja);
                        
                        if (discarded == beforediscard){
                            discarded = null;
                        }
                        else{
                            CardUmum cekdiscarded = discarded;
                            numdiscard++;
                            for (int alpha = 0; alpha < playerinturn.howmanymultiple(discarded) || (cekdiscarded == discarded) ; alpha++){//|| (cekdiscarded == discarded) 
                                discarded = playerinturn.multiplediscard(discarded);
                                numdiscard ++;
                                if (discarded == cekdiscarded){
                                    numdiscard --;
                                    break;
                                }
                            }
                            meja = discarded;
                            if (playerinturn.getCardsLeft()==1){
                                ishiji = true;
                            }
                        }
                        
                        if (discarded instanceof PowerCard){
                            tes = (PowerCard)discarded;
                            if ((tes.getAngkaangka() == 2 || tes.getAngkaangka()==4)){
                                plus = plus + ((tes.getAngkaangka())*numdiscard);
                                plusing = true;
                            }
                            else if (tes.getAngkaangka() == 1){
                                Collections.reverse(listplayer);
                                for (int j = 0; i< numdiscard; i++){
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
                            }   
                            else if (tes.getAngkaangka()==0){
                                /* tbh ini kalo skip belom kodenya kek gimana
                                   tapi konsepnya tuh ada token skipped.
                                   setiap kartu skip dimainkan, tokennya tuh nambah.
                                   giliran akan bertambah sebanyak token kali.
                                */
                                giliran = giliran + numdiscard;
                            }
                        }
                    }
                    else{//kondisi lagi tumpuk menumpuk plus
                        if (playerinturn.havePlus()){
                            CardUmum beforediscarding = meja;
                            boolean action = false;
                            while (!action){
                                CardUmum cekdiscard = null;
                                cekdiscard = playerinturn.discard(meja);//cekdiscard = meja (kondisi draw)
                                boolean cek = (cekdiscard instanceof PowerCard);//karena sebelumnya mejanya +2, maka cek = true; beforediscarding == meja;
                                if (!cek && (beforediscarding != meja)){
                                    System.out.println("discard salah");
                                    playerinturn.addCard(cekdiscard);
                                }
                                else if (cek && (beforediscarding != meja) ){//sudah pasti PowerCard //
                                    cek = (cekdiscard.getAngkaangka() ==2 || cekdiscard.getAngkaangka() == 4);
                                    if (!cek){
                                        System.out.println("discard salah");
                                        playerinturn.addCard(cekdiscard);
                                    }
                                    else {
                                        meja = cekdiscard;
                                        action = true;
                                        break;
                                    }
                                }
                                else if (cek && (beforediscarding == meja)){//player ga ngeluarin kartu alias ngedraw
                                    playerinturn.playerdraw(plus-1);
                                    plusing = false;
                                    action = true;
                                    System.out.println(playerinturn.getname() + " telah mengambil kartu sebanyak "+ plus);
                                }
                                
                            }
                        }
                        else{
                            playerinturn.playerdraw(plus);//memaksa player untuk mengambil card
                            System.out.println(playerinturn.getname() + " telah mengambil kartu sebanyak "+ plus);
                            plusing = false; // keluar dari kondisi tumpuk menumpuk plus
                        }
                        
                    }
                }
                else if (pilih == 4){
                    if (plusing){
                        playerinturn.playerdraw(plus);
                        System.out.println(playerinturn.getname() + " telah mengambil kartu sebanyak "+ plus);
                        plusing = false;
                    }
                    else{
                        playerinturn.playerdraw(1);
                        System.out.println(playerinturn.getname()+ "telah mengambil kartu sebanyak 1" );
                        CardUmum newcard = playerinturn.getLastCard();
                        if ((newcard.getClass() == meja.getClass() && (newcard.isangkasama(meja)))||newcard.iswarnasama(meja)){
                            System.out.print("Anda memiliki kartu yang bisa dikeluarkan. Apakah akan dikeluarkan? (Y/N): ");
                            String piilih = sca.nextLine();
			                if (piilih.charAt(0) == 'N'||piilih.charAt(0) == 'n'){

                            }
                            else {
                                CardUmum discarded = playerinturn.discard(meja);
                                meja = discarded;
                                if (discarded instanceof PowerCard){
                                    discarded = (PowerCard)discarded;
                                    if (discarded.getAngkaangka()==2 || discarded.getAngkaangka() ==4){
                                        plusing = true;
                                        plus = discarded.getAngkaangka();
                                    }
                                }
                                else if (tes.getAngkaangka() == 1){
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
                                else if (tes.getAngkaangka()==0){
                                    /* tbh ini kalo skip belom kodenya kek gimana
                                       tapi konsepnya tuh ada token skipped.
                                       setiap kartu skip dimainkan, tokennya tuh nambah.
                                       giliran akan bertambah sebanyak token kali.
                                    */
                                    giliran++;
                                }
                                if (playerinturn.getCardsLeft() == 1){
                                    ishiji = false;
                                }
                            }
                        }
                    }
                }
                else if (pilih == 5){
                    //Declare Hiji
                    if (playerinturn.getCardsLeft()!=1){
                        playerinturn.playerdraw(2);
                    }
                }
                else if (pilih == 6){
                    System.out.println("Sedang giliran : "+playerinturn.getname());
                    System.out.println("giliran berikutnya : "+listplayer.get((giliran+1) % jumplay).getname());
                }
                else if (pilih == 7){
                    printhelp();
                }
                else if (pilih == 8){
                    winner = playerinturn;
                }
                if (ishiji){
                    startTime = System.currentTimeMillis();
                    menu();
                    System.out.print("berikan perintah : ");
                    int perintah = sca.nextInt();
                    while (perintah != 5){
                        menu();
                        System.out.print("berikan perintah : ");
                        perintah = sca.nextInt();
                    }
                    if (System.currentTimeMillis() - startTime > 3000){
                        System.out.println("lo telat ng*****");
                        playerinturn.playerdraw(2);
                    }
                
                }
                if (playerinturn.getCardsLeft() == 0){
                    winner = playerinturn;
                    listplayer.clear();
                }
            }
        }
        System.out.println("Pemenangnya adalah "+ winner.getname());
    }
}