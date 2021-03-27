public interface CardUmum{
    public int getAngkaangka();
    public String getAngka();
    public int getcolornumber();
    public String getcolor();
    public void printcardinfo();
    public boolean iswarnasama(CardUmum input);
    public boolean isangkasama(CardUmum input);
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
    /* power bernilai true jika kartu memiliki kekuatan khusus*/
    
    /* color adalah integer positif prima. 
       dipilih untuk menghemat space yang digunakan.
       angka 2 untuk merah
       angka 3 untuk biru
       angka 5 untuk kuning
       angka 7 untuk hijau
       angka 210 untuk warna hitam(wild card)
       */
    
}