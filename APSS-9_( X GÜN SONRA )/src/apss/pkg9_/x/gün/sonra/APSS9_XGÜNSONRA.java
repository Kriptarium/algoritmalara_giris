package apss.pkg9_.x.gün.sonra;

import java.util.Scanner;

public class APSS9_XGÜNSONRA {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen 1 ile 365 arasında bir sayı giriniz:");
        int sayi = klavye.nextInt();
        while (sayi < 0 || sayi >365) {
            System.err.println("lütfen belirttiğimiz koşullarda bir değer giriniz");
            System.out.println("lütfen 1 ile 365 arasında bir değer giriniz:");
            sayi = klavye.nextInt();
            
        }
        String yaz = "";
        int gün = sayi % 7;
        if (gün == 0) {
            yaz = "cumartesi";
        } else if (gün == 1) {
            yaz = "pazar";
        } else if (gün == 2) {
            yaz = "pazartesi";
        } else if (gün == 3) {
            yaz = "salı";
        } else if (gün == 4) {
            yaz = "çarşamba";
        } else if (gün == 5) {
            yaz = "perşembe";
        } else if (gün == 6) {
            yaz = "Cuma";
        }

        System.err.println("bugün cumartesi " + sayi + " gün sonra haftanın " + yaz + " günü olacaktır.");
    }

}
