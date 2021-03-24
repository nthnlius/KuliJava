import java.lang.Math;
import java.util.Random;
public class Card{
    private int angka;
    /* angka untuk kartu yang power = false akan merepresentasikan
       angka sesuai dengan nomornya.
       sedangkan untuk kartu yang power = true akan ada representasinya tersendiri
       yaitu
            angka 0 -> skip
            angka 1 -> reverse
            angka 2 -> plus 2
            angka 3 -> wild card
            angka 4 -> plus 4
    */
    private boolean power;
    /* power bernilai true jika kartu memiliki kekuatan khusus*/
    private int color;
    /* color adalah integer positif prima. 
       dipilih untuk menghemat space yang digunakan.
       angka 2 untuk merah
       angka 3 untuk biru
       angka 5 untuk kuning
       angka 7 untuk hijau
       angka 210 untuk warna hitam(wild card)
       */
    public Card(){
    }
    public Card(int number, int color, boolean power){
        this.angka = number;
        this.color = color;
        this.power = power;
    }
    public void randomCard(){
        Random rd = new Random();
        boolean gachapower = rd.nextBoolean();
        this.power = gachapower;
        if (gachapower){
            this.angka = rd.nextInt(5);
            if (this.angka == 3 || this.angka == 4){
                this.color = 210;
            }
            else{
                this.color = rd.nextInt(8);
                while (isPrime(color)!=true){
                    this.color = rd.nextInt(8);
                }
            }
        }

        else{
	    this.angka = rd.nextInt(10);
            this.color = rd.nextInt(8);
            while (isPrime(color)!=true){
                this.color = rd.nextInt(8);
            }
        }
    }
    private static boolean isPrime (int num){
        if (num == 2 || num == 3 || num == 5 || num ==7){
            return true;
        }            
        else{
            return false;
        }
    }
    public String getColor(){
        if (this.color == 2){
            return ("berwarna merah");
        }
        else if (this.color ==3){
            return ("berwarna biru");
        }
        else if (this.color == 5){
            return ("berwarna kuning");
        }
        else if (this.color == 7){
            return ("berwarna hijau");
        }
        else if (this.color == 210){
            return ("");
        }
        else{
            return ("berwarna tidak jelas");
        }
    }
    public String getAngka(){
        if (this.power == true){
            if (this.angka == 0){
                return ("kartu skip");
            }
            else if (this.angka == 1){
                return ("kartu reverse");
            }
            else if (this.angka == 2){
                return ("kartu plus 2");
            }
            else if (this.angka == 3){
                return ("kartu wild card");
            }
            else if (this.angka == 4){
                return ("kartu wild plus 4");
            }
            else{
                return ("kartu tidak jelas");
            }
        }
        else {
            return ("kartu angka "+ this.angka);
        }
    }
    public int getcolornumber(){
        return this.color;
    }
    public int getnumbernumber() {
        return this.angka;
    }
    public boolean getpower(){
        return this.power;
    }
    public boolean iswarnasama(Card input){
        return (this.getcolornumber() % input.getcolornumber() == 0 || input.getcolornumber()%this.getcolornumber() == 0);
    }
    public boolean isangkasama(Card input){
        return (this.getpower()==input.getpower() && this.getnumbernumber() == input.getnumbernumber());
    }
    public void randomopening(){
        Random rd = new Random();
	    this.angka = rd.nextInt(10);
        this.color = rd.nextInt(8);
        while (isPrime(color)!=true){
            this.color = rd.nextInt(8);
        }
    }
}

