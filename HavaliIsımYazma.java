import java.util.Scanner;

public class HavaliIsımYazma{
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Lütfen Adınızı Giriniz: ");
        String ad = klavye.nextLine();

        System.out.print("Lütfen Soyadınızı Giriniz: ");
        String soyad = klavye.nextLine();

        int adUzunluk = ad.length();
        while(adUzunluk% 12 != 0){
            ad = ad + "*";
            adUzunluk = ad.length();
        }

        int soyadUzunluk = soyad.length();
        while(soyadUzunluk % 12 != 0){
            soyad = soyad + "+";
            soyadUzunluk = soyad.length();
        }

        int adParcaUzunluk = ad.length() / 4;
        int adBoslukSayisi = adParcaUzunluk - 2;
        String adBosluk = "";

        while(adBosluk.length()<adBoslukSayisi){
            adBosluk = adBosluk + " ";
        }

        String adParca1 = ad.substring(0, adParcaUzunluk);
        String adParca2 = ad.substring(adParcaUzunluk, (2 * adParcaUzunluk));
        String adParca3 = ad.substring((2 * adParcaUzunluk), (3 * adParcaUzunluk));
        String adParca4 = ad.substring((3 * adParcaUzunluk), (4 * adParcaUzunluk));

        System.out.println(adParca1);
        int i = 0;

        while(i < adParcaUzunluk){
            int j = adParcaUzunluk - 1 - i;
            System.out.println(adParca2.substring(i, i+1)+adBosluk+adParca4.substring(j, j+1));
            i++;
        }
        System.out.println(adParca3);
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("");

        int soyadParcaUzunluk = soyad.length() / 3;

        int soyadBoslukSayisi = soyadParcaUzunluk - 2;

        String soyadBosluk = "";

        while(soyadBosluk.length() < soyadBoslukSayisi){
            soyadBosluk = soyadBosluk + " ";
        }

        String soyadParca1 = soyad.substring(0, soyadParcaUzunluk);
        String soyadParca2 = soyad.substring(soyadParcaUzunluk, (2 * soyadParcaUzunluk));
        String soyadParca3 = soyad.substring((2 * soyadParcaUzunluk), (3 * soyadParcaUzunluk));

        int k = 0;

        while(k < soyadParcaUzunluk){
            int l = soyadParcaUzunluk - 1 - k;
            System.out.println(soyadParca1.substring(k , k + 1) + soyadBosluk + soyadParca3.substring(l , + l + 1));
            k++;
        }
        System.out.println(soyadParca2);

        klavye.close();
    }
}