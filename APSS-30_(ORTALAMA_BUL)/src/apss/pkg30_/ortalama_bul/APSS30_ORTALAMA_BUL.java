package apss.pkg30_.ortalama_bul;

import java.util.Scanner;

public class APSS30_ORTALAMA_BUL {

    public static void main(String[] args) {
       Scanner klavye=new Scanner(System.in);
       System.out.println("lütfen bir tamsayı değeri giriniz: ");
       int sayi=klavye.nextInt();
       /**
        * sayıyı giriş olarak al.
        * sayi 0 oluncaya kadar şu işlemleri uygula: 
        * rakam=sayi%10;
        * sayi=sayi/10; 
        * AO: rakamlar toplamı / basamak sayısı;
        * GO: rakamlar çarpımının basamak sayısıncı kökü; 
        */
        if (sayi % 2 == 0) {
            int aritmetikOrtalama = 0;

            int i = 0;
            while (sayi != 0) {//sayının rakamlarına teker teker ulaşıp toplanması
                int basamakDegeri = sayi % 10;
                sayi = sayi / 10;
                i = i + 1;
                aritmetikOrtalama = aritmetikOrtalama + basamakDegeri;
            }
            double sonuc = (double) aritmetikOrtalama / i;
            System.out.println("GİRİLEN SAYININ RAKAMLARINIIN ARİTMETİK ORTALAMASI: " + sonuc);
        } else {
            int geometrikOrtalama = 1;
            int i = 0;
            while (sayi != 0) {
                int basamakDegeri = sayi % 10;
                sayi = sayi / 10;
                i = i + 1;
                if (basamakDegeri != 0) {
                    geometrikOrtalama = geometrikOrtalama * basamakDegeri;
                }

            }
            double sonuc = Math.pow(geometrikOrtalama, 1.0 / i);
            System.out.println("GİRİLEN SAYININ RAKAMLARINIIN GEOMETRİK ORTALAMASI: " + sonuc);
        }
    }
}
    

