import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    // konstruktor untuk deck
    public Deck(){
        Random random = new Random();
        for (int i=0; i<60000; i++){
            int randomvalue = random.nextInt(60000);
            if (randomvalue % 54 == 0){
                cards.add(new Card(0,2,true));
            }
            else if (randomvalue % 54 == 1){
                cards.add(new Card(0,3,true));
            }
            else if (randomvalue % 54 == 2){
                cards.add(new Card(0,5,true));
            }
            else if (randomvalue % 54 == 3){
                cards.add(new Card(0,7,true));
            }
            else if (randomvalue % 54 == 4){
                cards.add(new Card(1,2,true));
            }
            else if (randomvalue % 54 == 5){
                cards.add(new Card(1,3,true));
            }
            else if (randomvalue % 54 == 6){
                cards.add(new Card(1,5,true));
            }
            else if (randomvalue % 54 == 7){
                cards.add(new Card(1,7,true));
            }
            else if (randomvalue % 54 == 8){
                cards.add(new Card(2,2,true));
            }
            else if (randomvalue % 54 == 9){
                cards.add(new Card(2,3,true));
            }
            else if (randomvalue % 54 == 10){
                cards.add(new Card(2,5,true));
            }
            else if (randomvalue % 54 == 11){
                cards.add(new Card(2,7,true));
            }
            else if (randomvalue % 54 == 12){
                cards.add(new Card(3,210,true));
            }
            else if (randomvalue % 54 == 13){
                cards.add(new Card(4,210,true));
            }
            else if (randomvalue % 54 == 14){
                cards.add(new Card(0,2,false));
            }
            else if (randomvalue % 54 == 15){
                cards.add(new Card(1,2,false));
            }
            else if (randomvalue % 54 == 16){
                cards.add(new Card(2,2,false));
            }
            else if (randomvalue % 54 == 17){
                cards.add(new Card(3,2,false));
            }
            else if (randomvalue % 54 == 18){
                cards.add(new Card(4,2,false));
            }
            else if (randomvalue % 54 == 19){
                cards.add(new Card(5,2,false));
            }
            else if (randomvalue % 54 == 20){
                cards.add(new Card(6,2,false));
            }
            else if (randomvalue % 54 == 21){
                cards.add(new Card(7,2,false));
            }
            else if (randomvalue % 54 == 22){
                cards.add(new Card(8,2,false));
            }
            else if (randomvalue % 54 == 23){
                cards.add(new Card(9,2,false));
            }
            else if (randomvalue % 54 == 24){
                cards.add(new Card(0,3,false));
            }
            else if (randomvalue % 54 == 25){
                cards.add(new Card(1,3,false));
            }
            else if (randomvalue % 54 == 26){
                cards.add(new Card(2,3,false));
            }
            else if (randomvalue % 54 == 27){
                cards.add(new Card(3,3,false));
            }
            else if (randomvalue % 54 == 28){
                cards.add(new Card(4,3,false));
            }
            else if (randomvalue % 54 == 29){
                cards.add(new Card(5,3,false));
            }
            else if (randomvalue % 54 == 30){
                cards.add(new Card(6,3,false));
            }
            else if (randomvalue % 54 == 31){
                cards.add(new Card(7,3,false));
            }
            else if (randomvalue % 54 == 32){
                cards.add(new Card(8,3,false));
            }
            else if (randomvalue % 54 == 33){
                cards.add(new Card(9,3,false));
            }
            else if (randomvalue % 54 == 34){
                cards.add(new Card(0,5,false));
            }
            else if (randomvalue % 54 == 35){
                cards.add(new Card(1,5,false));
            }
            else if (randomvalue % 54 == 36){
                cards.add(new Card(2,5,false));
            }
            else if (randomvalue % 54 == 37){
                cards.add(new Card(3,5,false));
            }
            else if (randomvalue % 54 == 38){
                cards.add(new Card(4,5,false));
            }
            else if (randomvalue % 54 == 39){
                cards.add(new Card(5,5,false));
            }
            else if (randomvalue % 54 == 40){
                cards.add(new Card(6,5,false));
            }
            else if (randomvalue % 54 == 41){
                cards.add(new Card(7,5,false));
            }
            else if (randomvalue % 54 == 42){
                cards.add(new Card(8,5,false));
            }
            else if (randomvalue % 54 == 43){
                cards.add(new Card(9,5,false));
            }
            else if (randomvalue % 54 == 44){
                cards.add(new Card(0,7,false));
            }
            else if (randomvalue % 54 == 45){
                cards.add(new Card(1,7,false));
            }
            else if (randomvalue % 54 == 46){
                cards.add(new Card(2,7,false));
            }
            else if (randomvalue % 54 == 47){
                cards.add(new Card(3,7,false));
            }
            else if (randomvalue % 54 == 48){
                cards.add(new Card(4,7,false));
            }
            else if (randomvalue % 54 == 49){
                cards.add(new Card(5,7,false));
            }
            else if (randomvalue % 54 == 50){
                cards.add(new Card(6,7,false));
            }
            else if (randomvalue % 54 == 51){
                cards.add(new Card(7,7,false));
            }
            else if (randomvalue % 54 == 52){
                cards.add(new Card(8,7,false));
            }
            else if (randomvalue % 54 == 53){
                cards.add(new Card(9,7,false));
            }
        }
    }
}