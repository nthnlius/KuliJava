public class NormalCard implements CardUmum{
    private int angka;
    private int color;
    public NormalCard(int angka, int color){
        this.angka = angka;
        this.color = color;
    }
    public int getAngkaangka(){
        return this.angka;
    }
    public String getAngka(){
        return ("Kartu angka "+ this.angka);
    }
    public int getcolornumber(){
        return this.color;
    }
    public String getcolor(){
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
        else {
            return ("berwarna tidak jelas");
        }
    }
    public void printcardinfo(){
        System.out.println("Kartu angka " + this.angka+ " " +this.getcolor());
    }
    public boolean iswarnasama(CardUmum input){
        return (this.getcolornumber()%input.getcolornumber() == 0 || input.getcolornumber()%this.getcolornumber() == 0);
    }
    public boolean isangkasama(CardUmum input){
        if (this.getClass() == input.getClass()){
            return (this.getAngkaangka()==input.getAngkaangka());
        }
        else{
            return false;
        }
    }
    public void setColor(int input){
        this.color = input;
    }
}