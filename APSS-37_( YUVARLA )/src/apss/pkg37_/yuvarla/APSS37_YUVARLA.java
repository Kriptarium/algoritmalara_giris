package apss.pkg37_.yuvarla;

import java.util.Scanner;

public class APSS37_YUVARLA {

    public static void main(String[] args) {
        /**
         * yuvarla isimli bir fonksiyon double tipinde bir değişkeni parametre
         * olarak almaktadır. parametre olarak gelen bu değişkeni en yakın
         * tamsayıya yuvarayıp geri döndürmektedir. bu fonksiyonu kodlayınız.
         */
        Scanner klavye = new Scanner(System.in);
        System.out.println("bir giriş yapınız: ");
        double sayı = klavye.nextDouble();
        System.out.println("sonuç: " + Math.round(sayı));
        System.out.println(Yuvarla(sayı));
    }

    public static int Yuvarla(double sayi) {
        /**
         * GİRİŞ: double tipinde bir değişken ÇIKIŞ: Gelen virgüllü sayının en
         * yakın tamsayıya yuvarlanmmış hali KONTROL: virgüllü kısmın 5ten büyük
         * ya da küçük olması TEKRAR: MATEMATİK: baktığımız zaman, sayı iki
         * parçadan oluşuyor; (1-sayının tam kısmı / 2-sayının kesirli kısmı.)
         * yani öncelikle yapacagımız şey sayının tam kısmının ve virgüllü
         * kısmının neresi olduğunu bulabilmek. sayımız virgüllü bir sayı olduğu
         * için ilk olarak verinin içerisinde noktanın(virgülün) pozisyonunu
         * bulmalıyız. sonra da tam kısmını noktanın öncesi kesirli kısmını da
         * noktadan sonrası olarak belirleyeceğiz. daha sonra da kesirli kısmın
         * 5ten büyük eşit ya da küçük olmasına göre tam kısmı ya 1 artıracağız
         * ya da 1 azaltacağız. dikkat edilmesi gereken noktalardan biri de şu:
         * sayı noktadan önce de sonra da birden fazla basamaklı olabilir.
         */
        int sonuc = -1;
        String veri = String.valueOf(sayi);//sayının string değişkenine dönüştürülmesi

        int pozisyon = -1;//özel karakterimiz olan noktanın pozisyonunu tanımladık
        for (int i = 0; i < veri.length(); i++) {//ifadenin tamamını arayıp noktanın pozisyonunu buluyoruz

            if (veri.charAt(i) == '.') {//veride nokttanın görüldüğü yeri(i) noktanın pozisyonu olarak belirliyoruz
                pozisyon = i;
                break;//eşleşme olduğunda döngüden çıkmasını sağlıyoruz
            }

        }

        // tam kıkımı belirleme: baştan başlayıp noktanın bulunduğu kraktere kadar olan kısmı al
        String tamKisim = "";
        for (int j = 0; j < pozisyon; j++) {
            tamKisim = tamKisim + String.valueOf(veri.charAt(j));

        }
        int tam = Integer.valueOf(tamKisim);

        //  System.out.println("tam kısım:"+tamKisim);
        // virgüllü kısmı indirgeme
        String virgulluKisim = "";
        for (int k = pozisyon + 1; k < veri.length(); k++) {
            virgulluKisim = virgulluKisim + String.valueOf(veri.charAt(k));

        }
//System.out.println("virgüllü kısım:"+virgulluKisim);

        //sayıyı yazdırma
        int elde = 0;

        for (int p = virgulluKisim.length() - 1; p >= 0; p--) {
//son pozisyondan ilk pozisyona doğru tersten kontrol ediyoruz 5ten büyük ya da küçük olduğunu
            int deger = Integer.valueOf(String.valueOf(virgulluKisim.charAt(p))) + elde;
            //System.out.println(deger);

            if (deger >= 5) {//deger 5ten büyük eşitse sayıya elde olarak 1 ekleyeceğiz
                elde = 1;
            } else {//deger 5ten küçükse sayıya elde olarak 0 ekleyeceğiz yani aynı şekilde bırakacağız
                elde = 0;
            }

        }

        sonuc = tam + elde;
        return sonuc;
    }
//sorunun  amacı diğer sorulardaki gibi dizileri(döngü-bir alt ifadeden bir üst ifadeye kadar bir şey yap), kontrol ifadelerini, döngüleri anlayabilmek
}
