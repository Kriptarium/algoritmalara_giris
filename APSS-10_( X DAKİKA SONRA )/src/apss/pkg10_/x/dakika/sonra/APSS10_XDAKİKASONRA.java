package apss.pkg10_.x.dakika.sonra;

import java.util.Scanner;

public class APSS10_XDAKİKASONRA {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("100 ile 500 arasında bir değer giriniz:");
        int deger = klavye.nextInt();
        while (deger < 100 || deger > 500) {
            System.err.println("Lütfen belirtilen koşullara uygun bir değer giriniz.");
            System.out.println("lütfen 100 ile 500 arasında bir değer giriniz:");
            deger = klavye.nextInt();
        }
        int saat = deger / 60;
        int dakika = deger % 60;

        saat = saat + 8;
        dakika = dakika + 30;

        if (dakika > 60) {
            saat = saat + (dakika / 60);
            dakika = dakika & 60;
        }
        System.err.println("sınavın başlangıç saati 8:30'dur " + deger + " dk sonra saat " + saat + ":" + dakika+" olacaktır");

    }

}
