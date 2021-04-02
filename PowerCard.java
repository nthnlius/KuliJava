import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import java.util.ArrayList;

public class PowerCard extends CardPower {
    boolean direction;
    public PowerCard(int angka, int color){
        super(angka, color);
    }
    public int skip(int skipped, int giliran){
        for (int i = 0; i< skipped; i++){
            giliran++;
        }
        return giliran;
    }
    public ArrayList<Player> reverse(ArrayList<Player> playerlist, int giliran){
        List<Player> newlist = new ArrayList<Player>();
        Collections.copy(newlist , playerlist);
        Collections.reverse(newlist);
        return newlist;
    }
    
    // public enum Direction {
    //     forwards, backwards
    // };

    // public void advanceToNextPlayer() {
    //     currPlayer = getNextPlayer();
    // }

    // public int getNextPlayer() {
    //     return (currPlayer + 1);
    // }

    // public void reverseDirection() {
    //     if (direction == Direction.forwards) {
    //         direction = Direction.backwards;
    //     } else {
    //         direction = Direction.forwards;
    //     }
    // }

    // @Override
    // public boolean power() {
    //     if (this.getAngkaangka() == 0) {
    //         advanceToNextPlayer();
    //         advanceToNextPlayer();
    //     } else if (this.getAngkaangka() == 1) {
    //         reverseDirection();
    //         advanceToNextPlayer();
    //         break;
    //     } else if (this.getAngkaangka() == 2) {
    //         nextPlayer();
    //         nextPlayer();
    //         advanceToNextPlayer();
    //         advanceToNextPlayer();
    //         break;
    //     } else if (this.getAngkaangka() == 3) {
    //         getNextPlayer();
    //         getNextPlayer();
    //         getNextPlayer();
    //         getNextPlayer();
    //         advanceToNextPlayer();
    //         advanceToNextPlayer();
    //         break;
    //     }
    // }
}