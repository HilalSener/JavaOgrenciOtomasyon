
import java.util.ArrayList;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Ders> arDers = new ArrayList<>();
    public static ArrayList<Ogrenci> arOgr = new ArrayList<>();
    
    public static int firstMenu(){
        System.out.println("..::Seçim::.."+
                           "1 - Ders İşlemleri\n" +
                           "2 - Ogrenci İşlemleri\n" +
                           "3 - Ders Programı İşlemleri"+
                           "4 - Çıkış"+
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
                            break;
                        case 2:
                            //ders sil
                            break;
                        case 3:
                            //ders güncelle
                            break;
                        default: break;
                    }
                    break;
                case 2:
                    //Ogrenci işlemleri
                    switch(ogrenciIslemleriMenu()){
                        case 1:
                            //Öğrenci ekle
                            break;
                        case 2:
                            //Öğrenci sil
                            break;
                        case 3:
                            //Öğrenci güncelle
                            break;
                        default: break;
                    }
                    break;
                case 3:
                    //Ders Programı işlemleri
                    break;
                case 4:
                    //çıkış
                    kosul=false;
                    break;
            }
            
        }
    }
}
