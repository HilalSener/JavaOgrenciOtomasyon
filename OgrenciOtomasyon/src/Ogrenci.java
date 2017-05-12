
import java.util.ArrayList;

public class Ogrenci 
{
    public int okulNo;
    public String ad;
    public String soyad;
    public int krediSayisi;
    ArrayList<String> dersler = new ArrayList<>();
    public Ogrenci(int okulNo, String ad,String soyad , int krediSayisi) {
        this.okulNo = okulNo;
        this.ad = ad;
        this.soyad=soyad;
        this.krediSayisi = krediSayisi;
    }
    
    public void setDersler(String dersAdi){
        dersler.add(dersAdi);
    }
    
}
