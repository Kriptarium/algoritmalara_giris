package apss.pkg29_.taban_dönüşümü;

import java.util.Scanner;

public class APSS29_TABAN_DÖNÜŞÜMÜ {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("BİR TAM SAYI GİRİŞİ YAPINIZ: ");
        int sayi = klavye.nextInt();

        /**
         * taban dönişümü: elimizdeki sayıyı hangi tabana dönüştürmek istiyorsak
         * o tabana bölümünden kalan değerini bir değişkenin ierisine atacağiz
         * ve her seferinde sayıyı 0 a yaklaştırmak çin taban değerine
         * böleceğiz. oluşturduğumuz kalan değişkenini her seferinde sonucun
         * başına ekleyeceğiz yani tersten. 
         * kalan=sayi/tabandeğeri;
         * sayi=sayi/taban degeri;
         * sonuc=kalan+sonuc;
         */
        if (sayi % 2 == 0) {
            String sonuc = "";
            while (sayi != 0) {
                int kalan = sayi % 8;
                sayi = sayi / 8;
                sonuc = kalan + sonuc;
            }
            System.out.println("girilen sayının 8 tabanındaki karşılığı: " + sonuc);
        } else {
            String sonuc = "";
            while (sayi != 0) {
                int kalan = sayi % 2;
                sayi = sayi / 2;
                sonuc = kalan + sonuc;
            }
            System.out.println("girilen sayının 2 tabanındaki karşılığı: " + sonuc);
        }
    }
}
