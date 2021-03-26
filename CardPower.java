import javax.smartcardio.ATR;
import javax.smartcardio.Card;

public class CardPower extends Card {
    int currPlayer;
    boolean direction;

    public enum Direction {
        forwards, backwards
    };

    public void advanceToNextPlayer() {
        currPlayer = getNextPlayer();
    }

    public int getNextPlayer() {
        return (currPlayer + 1);
    }

    public void reverseDirection() {
        if (direction == Direction.forwards) {
            direction = Direction.backwards;
        } else {
            direction = Direction.forwards;
        }
    }

    @Override
    public boolean power() {
        if (this.angka == 0) {
            advanceToNextPlayer();
            advanceToNextPlayer();
        } else if (this.angka == 1) {
            reverseDirection();
            advanceToNextPlayer();
            break;
        } else if (this.angka == 2) {
            nextPlayer();
            nextPlayer();
            advanceToNextPlayer();
            advanceToNextPlayer();
            break;
        } else if (this.angka == 3) {
            getNextPlayer();
            getNextPlayer();
            getNextPlayer();
            getNextPlayer();
            advanceToNextPlayer();
            advanceToNextPlayer();
            break;
        }
    }
}