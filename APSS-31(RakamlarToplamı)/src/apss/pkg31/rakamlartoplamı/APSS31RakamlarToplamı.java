package apss.pkg31.rakamlartoplamı;

import java.util.Scanner;

public class APSS31RakamlarToplamı {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı değeri giriniz: ");
        int sayi = klavye.nextInt();
        /**
         * sayıyı giriş olarak al. sayi 0 oluncaya kadar şu işlemleri uygula:
         * rakam=sayi%10; sayi=sayi/10;
         * teker teker rakamlarına ulaş. eğer çiftse çift toplama ekle tekse tek
         * toplama ekle.
         */
        int tekRakamlarToplamı = 0;
        int çiftRakamlarToplamı = 0;
        int tekRakamlarSayısı = 0;
        int çiftRakamlarSayısı = 0;

        while (sayi != 0) {
            int basamakDegeri = sayi % 10;
            sayi = sayi / 10;

            if (basamakDegeri % 2 == 0) {
                   
                çiftRakamlarToplamı = çiftRakamlarToplamı + basamakDegeri;
                çiftRakamlarSayısı++;

            } else {
                tekRakamlarToplamı = tekRakamlarToplamı + basamakDegeri;
                tekRakamlarSayısı++;
            }
        }
        System.out.println("giriln sayının tek rakam sayısı: " + tekRakamlarSayısı);
        System.out.println("tek rakamların toplamı: " + tekRakamlarToplamı);
        System.out.println("çift basamak sayısı: " + çiftRakamlarSayısı);
        System.out.println("çift rakamlar toplamı: " + çiftRakamlarToplamı);
        System.out.println("tek ve çift rakamlar arasındaki mutlak fark: " + Math.abs(tekRakamlarToplamı - çiftRakamlarToplamı));
    }

}
