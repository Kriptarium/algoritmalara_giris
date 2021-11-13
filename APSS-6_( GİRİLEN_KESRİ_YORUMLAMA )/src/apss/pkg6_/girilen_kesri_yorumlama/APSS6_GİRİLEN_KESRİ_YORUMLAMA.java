package apss.pkg6_.girilen_kesri_yorumlama;

import java.util.Scanner;

public class APSS6_GİRİLEN_KESRİ_YORUMLAMA {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("pay değerini giriniz:");
        int pay = klavye.nextInt();
        System.out.println("payda degerini giriniz:");
        int payda = klavye.nextInt();
        if (payda > pay) {
            System.err.println("basit kesir girdiniz.");

        } else if (payda == pay) {
            System.err.println("girdiğiniz değer bir tamsayıdır.");
        } else {
            int x = pay / payda;
            int y = pay % payda;
            System.err.println("bileşik kesir girdiniz...");
            System.err.println("kesir değeri= " + x + " tam " + y + "/" + payda);
        }
    }

}
