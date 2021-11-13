package apss.pkg35_.split.metodu;

import java.util.Scanner;

public class APSS35_SPLİTMETODU {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Lütfen bir String değer giriniz: ");
        String deger = klavye.nextLine();

        System.out.println("Lütfen parçalama işlemi için özel bir karakter giriniz: ");
        String ozel_karakter = klavye.nextLine();

        String[] cıktı = parcala(deger, ozel_karakter);//SPLİT METODUNUN HAZIR FONKSİYONUNUN KULLANILMASI
        for (int i = 0; i < cıktı.length; i++) {
            System.out.println(cıktı[i]);
        }

        String[] cktı2 = deger.split(ozel_karakter);//KENDİ OLUŞTURDUĞUMUZ FONKSİYONUN KULLANIMI
        for (int j = 0; j < cıktı.length; j++) {
            System.out.println(cıktı[j]);
        }

    }

    public static String[] parcala(String veri, String karakter) {
        /**
         * bu fonksiyon parçalayacağımız veri yapısını ve parçalayacağımız özel
         * karakteri parametre olarak alacak. split metodunun görevi: verilen
         * string ifadeyi içerisinde bulunan özel karaktere göre ifadeyi
         * parçalar ve bir dizinin hücresine atarak onu geri dönderir.
         *
         *
         * Seçtiğimiz özel karaktere göre dizinin boyutu değişeceği için dizinin
         * boyutu belirlenmeli. Gelen veride ilk karakterden son karaktere kadar
         * özel karakteri sayısının arayıp kaç tane olduğunu bulmamız lazım
         * stringler karşılaştırılırken sıkıntı yaşayacagımız için karakterleri
         * karşılaştırıyoruz.
         */
        char k = karakter.charAt(0);
        int sayac = 0;
        for (int i = 0; i < veri.length(); i++) {
            //eğer uyuşma varsa sayac 1 artır.
            //kaç tane özel karakter olduğunu bulmuş olacağız.
            if (veri.charAt(i) == k) {
                sayac = sayac + 1;
            }
        }
        //sonuçları içerecek dizinin oluşturulması
        String[] sonuclar = new String[sayac + 1];
        /**
         * şimdiki işlem alt parçaları belirlemek: 0 dan başlayıp veri
         * uzunluguna kadar tarayıp özel karakerin pozisyonunu bul.ilk özel
         * karakteri bulduysan oraya kadar olan parçayı seç. ve diziye at.
         */
        int alt = 0;
        int pozisyon = 0;//sonuçlar dizisinin indis pozisyonunu ifade ediyor

        for (int j = 0; j < veri.length(); j++) {
            /**
             * eğer noktalı virgülün pozisyonunu bulduysan sonuçlar dizisinin o
             * pozisyonuna veri parametresinin alt değerinden başlayıp j
             * değerine kadar olan kısmını substring metodu yardımı ile seçip,
             * at(yerleştir).
             */
            if (veri.charAt(j) == k) {

                sonuclar[pozisyon] = veri.substring(alt, j);
                pozisyon = pozisyon + 1;
                alt = j + 1;
                /**
                 * alt değeri normalde sıfırdan başlamıştı. Artık yeni alt
                 * değerinoktalı virgülün bulunduğu noktadan sonra başlıyor.
                 */
            }

        }

        sonuclar[sayac] = veri.substring(alt);
        /**
         * en son özel karakter bulunduktan sonra artık özel karakter aransa
         * bile bulunmayacak ve son sonparça diziye atanmamış olacak. parçayı
         * almak için de substring metodunun kullanılması gerekiyor
         */

        return sonuclar;
    }

}
