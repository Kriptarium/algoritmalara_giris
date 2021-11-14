package apss.pkg33_.üçgen_çizdirme;

import java.util.Scanner;

public class APSS33_ÜÇGEN_ÇİZDİRME {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("üçgenin yüksekliğini giriniz:");
        int yukseklik = klavye.nextInt();

        String yaz = "";//boş bir String oluştur
   
        int i = 1;
        while (yukseklik > 0) {//yükseklik 0dan büyük ;iken önce boşluk sonra yıldız yazdır;;
            //ilk seferinde bir yıldız yazdır sonra her seferinde 2şer 2şer artacak.
            //ilke seferinde yazacagım boşluk sayısı yükseklik-1 .sonra her seferinde 1er 1er azalacak
            String yildiz = "";
            String bosluk = "";
            for (int p = i; p > 0; p--) {//başlangıçta i kadar yıldız ekle (i her seferinde 2şer 2şer artacak) (yükseklik defa)
                yildiz = yildiz + "*";

            }
            for (int q = yukseklik - 1; q > 0; q--) {//başlangıçta yükseklik-1 kadar boşluk ekle (sonra her seferinde 1er 1er azalacak) (yükseklik defa)
                bosluk = bosluk + " ";

            }
            yaz = yaz + bosluk + yildiz + "\n";// her seferinde de bu yazılan değerleri boş olarak oluşturuduğumuz String yaz değişkenine ekliyoruz ve yeni bir satıra geçiyoruz.  
            i = i + 2;//yıldız sayısı her seferinde 2 artacak
            yukseklik--;//yikseklik azaldığı için boşluk sayısı da her seferinde 1 azalıyor.
            //yükseklik 0 olunca da döngü bitiyor.
        }
        System.out.print(yaz);

    }

}
