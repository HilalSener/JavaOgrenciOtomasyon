
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Ders> arDers = new ArrayList<>();
    public static ArrayList<Ogrenci> arOgr = new ArrayList<>();
    //Dersler ve o dersi alan oğrencileri tutmak için kullansam mı diye düşnüyorum...
    public static HashMap<String,String> hm = new HashMap<>();
    //Menüler
    public static int firstMenu(){
        System.out.println("..::Seçim::..\n"+
                           "1 - Ders İşlemleri\n" +
                           "2 - Ogrenci İşlemleri\n" +
                           "3 - Ders Programı İşlemleri\n"+
                           "4 - Çıkış\n"+
                           "Seçim[1-4] :");
        return sc.nextInt();
    }
    public static int dersIslemleriMenu(){
        System.out.println("..Ders İşlemleri..");
        System.out.println( "1 - Yeni Ders\n" +
                           "2 - Ders Sil\n" +
                           "3 - Ders Güncelle");
        System.out.print("Seçim [1-3] :");
        return sc.nextInt();
    }
    public static int ogrenciIslemleriMenu(){
        System.out.println( "1 - Öğrenci Ekle\n" +
                           "2 - Öğrenci Sil\n" +
                           "3 - Öğrenci Güncelle");
        System.out.print("Seçim [1-3] :");
        return sc.nextInt();
    }
    public static int dersProgramiIslemleriMenu(){
        System.out.println( "1 - Öğrenci Ders Programları\n" +
                            "2 - Raporlama\n");
        System.out.print("Seçim [1-2] :");
        return sc.nextInt();
    }
    public static int dersProgramAltMenu(){
        System.out.println( "1-Ders Programları Listele\n" +
                            "2-Öğrenci Arama\n" +
                            "3-Öğrencinin Ders Programından Ders Sil\n" +
                            "4-Öğrencinin Ders Programına Ders Ekle");
        System.out.print("Seçim[1-4] :");
        return sc.nextInt();
    }
    public static int dersProgramAltMenuIki(){
        System.out.println( "1 - Derslere Göre Öğrencileri Listele\n" +
                            "(Sınıf Mevcudunu Goster)\n" +
                            "2 - Öğrencilere Göre Dersleri Listele\n" +
                            "(Her Öğrencinin Ayrı Ayrı Ders Programını Göster)\n" +
                            "3 - En Çok Kredi Alan 10 Öğrenci\n" +
                            "4 - Mevcudu En Fazla Olan 10 Ders");
        System.out.print("Seçim[1-4] :");
        return sc.nextInt();
    }
    
    //Ders işlemleri
    
    public static Ders newDers(){
        System.out.println("Dersin Adı:");
        String dersAdi=sc.next();
        System.out.println("Dersin Kredisi");
        int kr = sc.nextInt();
        System.out.println("Öğrenci Kotası :");
        int kt = sc.nextInt();
        return new Ders(dersAdi, kr, kt);
    }
    public static void dersListesi(){
        for (int i = 0; i < arDers.size(); i++) {
            Ders d = arDers.get(i);
            System.out.println("index: "+i +" Dersin Adı: "+d.dersAdi+" Kredisi: "+d.krediSayisi+ " Kontenjanı: "+d.OgrenciKotası);
        }
    }
    public static void dersSil(){
        System.out.println("Silinicek Dersin indexini Seçiniz :");
        int index = sc.nextInt();
        arDers.remove(index);
    }
    public static void dersGuncelle(int index,int islem){
        if (islem == 1) {
            //Adını güncelle
            System.out.println("Yeni Ders Adi");
            arDers.get(index).dersAdi = sc.next();
        } 
        if(islem == 2) {
            //kredi güncelle
            System.out.println("Yeni Kredi");
            arDers.get(index).krediSayisi = sc.nextInt();
        }
        if (islem == 3) {
            //kota güncelle
            System.out.println("Dersin Kotasını Güncelle");
            arDers.get(index).OgrenciKotası = sc.nextInt();
        }
    }
    
    ///ogrenci işlemleri
    
    public static Ogrenci ogrenciEkle(){
        System.out.println("Okul Numarası :");
        int okulno = sc.nextInt();
        System.out.println("Öğrencinin Adı :");
        String ad = sc.next();
        System.out.println("Öğrencinin Soyadı :");
        String soyad = sc.next();
        System.out.println("Kredisi :");
        int kredisi = sc.nextInt();
        return new Ogrenci(okulno, ad, soyad, kredisi);
    }
    public static void ogrenciListele(){
        for (int i = 0; i < arOgr.size(); i++) {
            Ogrenci o = arOgr.get(i);
            System.out.println("index: "+i+" OkulNo: "+o.okulNo+" Ad: "+o.ad+" Soyad: "+o.soyad+" Kredi: "+o.krediSayisi);
        }
    }
    public static void ogrenciSil(){
        System.out.println("Silinicek öğrencinin indexini seçiniz:");
        int indx= sc.nextInt();
        arOgr.remove(indx);
    }
    public static void ogrenciGuncelle(int index, int islem){
            if (islem == 1) {
            //okulno güncelle
            System.out.println("Yeni Okul Numarası:");
            arOgr.get(index).okulNo = sc.nextInt();
        } 
        if(islem == 2) {
            //ad güncelle
            System.out.println("Yeni Öğrencinin Adı:");
            arOgr.get(index).ad = sc.next();
        }
        if (islem == 3) {
            //soyad güncelle
            System.out.println("Yeni Öğrenci Soyad Soyad:");
            arOgr.get(index).soyad = sc.next();
        }
        if(islem == 4){
            System.out.println("Yeni Kredi:");
            arOgr.get(index).krediSayisi = sc.nextInt();
        }
    }
    ///Dersprogramı işlemleri
    public static void ogrenciDersProgramiIslemleriEkle(){
        ogrenciListele();
        System.out.println("Ogrenci İndex :");
        int index = sc.nextInt();
        dersListesi();
        System.out.println("Dersin index :");
        int dersIndex =sc.nextInt();
        Ders d = arDers.get(dersIndex);
        Ogrenci o = arOgr.get(index);
        String dersAdi=d.dersAdi;
        o.setDersler(dersAdi);
    }
    public static void ogrenciDersProgramiIslemleriDersleriListele(){
        ogrenciListele();
        System.out.println("Ogrenci İndex :");
        int index = sc.nextInt();
        Ogrenci o = arOgr.get(index);
            System.out.println("Ogrenci : "+o.ad+"\n"
                    + "Dersler : "+o.dersler);
    }
    public static void ogrenciDersProgramiIslemleriDersSil(){
        ogrenciListele();
        System.out.println("Ogrenci İndex :");
        int index = sc.nextInt();
        Ogrenci o = arOgr.get(index);
        
        for (int i = 0; i < o.dersler.size(); i++) {
            System.out.println(i+" index - Ders Adı :"+o.dersler.get(i));
        }
        System.out.println("Dersin index :");
        int dersIndex =sc.nextInt();
        o.dersler.remove(dersIndex);
    }
    public static void ogrenciDersProgramiIslemleriDersleriArama(){
        dersListesi();
        System.out.println("Dersin index :");
        int dersIndex =sc.nextInt();
        Ders d = arDers.get(dersIndex);
        System.out.println("Ogrenci Ad/Soyad:");
        String girdi = sc.next();
        for (int i = 0; i < arOgr.size(); i++) {
            for (int j = 0; j < arOgr.get(i).dersler.size(); j++) {
                if (arOgr.get(i).dersler.get(j).equals(d.dersAdi)) {
                    if (arOgr.get(i).ad.equals(girdi) || arOgr.get(i).soyad.equals(girdi)) {
                        System.out.println("Ad Soyad: " + arOgr.get(i).ad + " " + arOgr.get(i).soyad);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean kosul = true;
        while (kosul) {
            switch(firstMenu()){
                case 1:
                    //Ders İşlemleri
                    switch(dersIslemleriMenu()){
                        case 1:
                            //yeni ders
                            arDers.add(newDers());
                            break;
                        case 2:
                            //Ders Sil
                            dersListesi();
                            dersSil();
                            /*
                            (Eğer Silmeyi Seçtiği Ders, Öğrencilerin, 
                            Programlarında Varsa, Otomatik Olarak 
                            Kaldırılmalıdır)
                            */
                            break;
                        case 3:
                            //ders güncelle
                            dersListesi();
                            System.out.println("Güncelleme Yapmak istediğiniz dersin indexini seçiniz :");
                            int a =sc.nextInt();
                            System.out.println("Yapmak istediniz işlem:"
                                    + "\n1-Adını Güncelle"
                                    + "\n2-Kredisini Güncelle"
                                    + "\n3-Dersin Kotasını Güncelle.");
                            int sec = sc.nextInt();
                            dersGuncelle(a, sec);
                            break;
                        default: break;
                    }
                    break;
                case 2:
                    //Ogrenci işlemleri
                    switch(ogrenciIslemleriMenu()){
                        case 1:
                            //Öğrenci ekle
                            arOgr.add(ogrenciEkle());
                            break;
                        case 2:
                            //Öğrenci sil
                            ogrenciListele();
                            ogrenciSil();
                            break;
                        case 3:
                            //Öğrenci güncelle
                            ogrenciListele();
                            System.out.println("Güncelleme Yapmak istediğiniz Öğrencinin indexini seçiniz :");
                            int a = sc.nextInt();
                            System.out.println("Yapmak istediniz işlem:"
                                    + "\n1-OkulNo Güncelle"
                                    + "\n2-Adını Güncelle"
                                    + "\n3-Soyad Güncelle"
                                    + "\n4-Kredisini Güncelle");
                            int sec = sc.nextInt();
                            ogrenciGuncelle(a, sec);
                            break;
                        default: break;
                    }
                    break;
                case 3:
                    //Ders Programı işlemleri
                    switch(dersProgramiIslemleriMenu()){
                        case 1: 
                            //yeni menü
                            switch(dersProgramAltMenu()){
                                case 1: //Ders Programları Listele
                                    ogrenciDersProgramiIslemleriDersleriListele();
                                    break; 
                                case 2: //Öğrenci Arama
                                    ogrenciDersProgramiIslemleriDersleriArama();
                                    break;
                                case 3: //Öğrencinin Ders Programından Ders Sil
                                    ogrenciDersProgramiIslemleriDersSil();
                                    break;
                                case 4: //Öğrencinin Ders Programına Ders Ekle
                                    ogrenciDersProgramiIslemleriEkle();
                                    break;
                                default:
                                    break;
                            }
                            break;
                        case 2: 
                            //raporlama
                            switch(dersProgramAltMenuIki()){
                                case 1: //Derslere Göre Öğrencileri Listele
                                    break;
                                case 2: //Öğrencilere Göre Dersleri Listele
                                    break;
                                case 3: //En Çok Kredi Alan 10 Öğrenci
                                    break;
                                case 4: //Mevcudu En Fazla Olan 10 Ders
                                    break;
                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    //çıkış
                    kosul=false;
                    break;
            }
            
        }
    }
}
