import java.util.ArrayList;
import java.lang.Math;
import java.util.Random;

public class Deck {
    private ArrayList<CardUmum> cards = new ArrayList<CardUmum>();
    
    // konstruktor untuk deck
    public Deck(){
        for (int i=0; i<54; i++){
            int randomvalue = i;
            if (randomvalue % 54 == 0){// skip merah
                cards.add(new PowerCard(0,2));
            }
            else if (randomvalue % 54 == 1){//skip biru
                cards.add(new PowerCard(0,3));
            }
            else if (randomvalue % 54 == 2){//skip kuning
                cards.add(new PowerCard(0,5));
            }
            else if (randomvalue % 54 == 3){//skip hijau
                cards.add(new PowerCard(0,7));
            }
            else if (randomvalue % 54 == 4){//reverse
                cards.add(new PowerCard(1,2));
            }
            else if (randomvalue % 54 == 5){
                cards.add(new PowerCard(1,3));
            }
            else if (randomvalue % 54 == 6){
                cards.add(new PowerCard(1,5));
            }
            else if (randomvalue % 54 == 7){
                cards.add(new PowerCard(1,7));
            }
            else if (randomvalue % 54 == 8){
                cards.add(new PowerCard(2,2));
            }
            else if (randomvalue % 54 == 9){
                cards.add(new PowerCard(2,3));
            }
            else if (randomvalue % 54 == 10){
                cards.add(new PowerCard(2,5));
            }
            else if (randomvalue % 54 == 11){
                cards.add(new PowerCard(2,7));
            }
            else if (randomvalue % 54 == 12){
                cards.add(new PowerCard(3,210));
            }
            else if (randomvalue % 54 == 13){
                cards.add(new PowerCard(4,210));
            }
            else if (randomvalue % 54 == 14){
                cards.add(new NormalCard(0,2));
            }
            else if (randomvalue % 54 == 15){
                cards.add(new NormalCard(1,2));
            }
            else if (randomvalue % 54 == 16){
                cards.add(new NormalCard(2,2));
            }
            else if (randomvalue % 54 == 17){
                cards.add(new NormalCard(3,2));
            }
            else if (randomvalue % 54 == 18){
                cards.add(new NormalCard(4,2));
            }
            else if (randomvalue % 54 == 19){
                cards.add(new NormalCard(5,2));
            }
            else if (randomvalue % 54 == 20){
                cards.add(new NormalCard(6,2));
            }
            else if (randomvalue % 54 == 21){
                cards.add(new NormalCard(7,2));
            }
            else if (randomvalue % 54 == 22){
                cards.add(new NormalCard(8,2));
            }
            else if (randomvalue % 54 == 23){
                cards.add(new NormalCard(9,2));
            }
            else if (randomvalue % 54 == 24){
                cards.add(new NormalCard(0,3));
            }
            else if (randomvalue % 54 == 25){
                cards.add(new NormalCard(1,3));
            }
            else if (randomvalue % 54 == 26){
                cards.add(new NormalCard(2,3));
            }
            else if (randomvalue % 54 == 27){
                cards.add(new NormalCard(3,3));
            }
            else if (randomvalue % 54 == 28){
                cards.add(new NormalCard(4,3));
            }
            else if (randomvalue % 54 == 29){
                cards.add(new NormalCard(5,3));
            }
            else if (randomvalue % 54 == 30){
                cards.add(new NormalCard(6,3));
            }
            else if (randomvalue % 54 == 31){
                cards.add(new NormalCard(7,3));
            }
            else if (randomvalue % 54 == 32){
                cards.add(new NormalCard(8,3));
            }
            else if (randomvalue % 54 == 33){
                cards.add(new NormalCard(9,3));
            }
            else if (randomvalue % 54 == 34){
                cards.add(new NormalCard(0,5));
            }
            else if (randomvalue % 54 == 35){
                cards.add(new NormalCard(1,5));
            }
            else if (randomvalue % 54 == 36){
                cards.add(new NormalCard(2,5));
            }
            else if (randomvalue % 54 == 37){
                cards.add(new NormalCard(3,5));
            }
            else if (randomvalue % 54 == 38){
                cards.add(new NormalCard(4,5));
            }
            else if (randomvalue % 54 == 39){
                cards.add(new NormalCard(5,5));
            }
            else if (randomvalue % 54 == 40){
                cards.add(new NormalCard(6,5));
            }
            else if (randomvalue % 54 == 41){
                cards.add(new NormalCard(7,5));
            }
            else if (randomvalue % 54 == 42){
                cards.add(new NormalCard(8,5));
            }
            else if (randomvalue % 54 == 43){
                cards.add(new NormalCard(9,5));
            }
            else if (randomvalue % 54 == 44){
                cards.add(new NormalCard(0,7));
            }
            else if (randomvalue % 54 == 45){
                cards.add(new NormalCard(1,7));
            }
            else if (randomvalue % 54 == 46){
                cards.add(new NormalCard(2,7));
            }
            else if (randomvalue % 54 == 47){
                cards.add(new NormalCard(3,7));
            }
            else if (randomvalue % 54 == 48){
                cards.add(new NormalCard(4,7));
            }
            else if (randomvalue % 54 == 49){
                cards.add(new NormalCard(5,7));
            }
            else if (randomvalue % 54 == 50){
                cards.add(new NormalCard(6,7));
            }
            else if (randomvalue % 54 == 51){
                cards.add(new NormalCard(7,7));
            }
            else if (randomvalue % 54 == 52){
                cards.add(new NormalCard(8,7));
            }
            else if (randomvalue % 54 == 53){
                cards.add(new NormalCard(9,7));
            }
        }
    }
    public CardUmum drawcard(){
        Random random = new Random();
        int rnd = random.nextInt(55);
        return cards.get(rnd);
    }
    public CardUmum openingcard(){
        Random random = new Random();
        int rnd = random.nextInt(40);
        return cards.get(rnd+14);
    }
}