import java.util.ArrayList;
import java.util.List;
// public class Main{
//     public static void main(String[] args){
//         List <Card> list1 = new ArrayList<Card>();
//         for(int i = 0; i < 10; i++){
//             Card c = new Card();
//             c.randomCard();
//             list1.add(c);
//         }
//         for(int i = 0; i<list1.size(); i++){
//             System.out.println(""+(i+1) + ". "+list1.get(i).getAngka()+" "+ list1.get(i).getColor());
//         }
//     }
// }
public class Main{
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        System.out.print("Jumlah Player : ");
        int jumplay = sca.nextInt();
        Card meja = new Card();
        meja.randomopening();
        private List<Player> listplayer = new ArrayList<Player>();
        int i = 0;
        int giliran = 0;
        for (i = 0 ; i<jumplay; i++){
            Player player1 = new Player();
            listplayer.add(player1);
        }
        while (listplayer.size() != 1){
            giliran ++;
            playerinturn = listplayer.get(giliran % jumplay);
            int sizeawal = playerinturn.jumlahkartu();
            meja = playerinturn.keluarinkartu(meja);
        }

}

