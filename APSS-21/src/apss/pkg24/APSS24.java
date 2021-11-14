package apss.pkg24;

import java.util.Scanner;

public class APSS24 {

    public static void main(String[] args) {
        /**
         * eğer iki boyutlu bir matriste çalışacaksan aklında her zaman çarpım
         * tablosu örneği olsun .
         */

        int sayi;
        do {
            Scanner klavye = new Scanner(System.in);
            System.out.print("4 ile 8 arasındaki bir sayı giriniz:");
            sayi = klavye.nextInt();
        } while (sayi < 4 || sayi > 8);
        int[][] matris = olustur(sayi);
        for (int m = 0; m < matris.length; m++) {
            for (int n = 0; n < 4; n++) {

                System.out.print(matris[m][n] + "\t");

            }
            System.out.println();

        }
    }

    public static int[][] olustur(int sayi) {
        int[][] sonuc = new int[sayi][6];
        int deger = 10;
        int fark = 2;
        for (int i = 0; i < sayi; i++) {

            int x = deger;
            for (int j = 0; j < 4; j++) {
                sonuc[i][j] = x;
                x = x - fark;

            }
            deger = deger + 10;
            fark = fark + 1;

        }
        return sonuc;
    }
}
