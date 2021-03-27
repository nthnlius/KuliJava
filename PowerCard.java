public class PowerCard implements CardUmum{
    private int angka;
    private int color;
    private boolean power;
    public PowerCard(int angka, int color){
        this.angka = angka;
        this.color = color;
    }
    public int getAngkaangka(){
        return this.angka;
    }
    public String getAngka(){
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
        else if (this.color == 210){
            return ("");
        }
        else{
            return ("berwarna tidak jelas");
    }
    public boolean iswarnasama(CardUmum input){
        return (this.getcolornumber()%input.getcolornumber() == 0 || input.getcolornumber()%this.getcolornumber == 0);
    }
    public boolean isangkasama(CardUmum input){
        if (this.getClass() == input.getClass()){
            return (this.getAngkaangka()==input.getAngkaangka());
        }
        else{
            return false;
        }
    }
}
