package apss.pkg3_.mayın.tarlası;

import java.util.Random;
import java.util.Scanner;

public class APSS3_MAYINTARLASI {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("oynayacağınız alanın satır değerini giriniz:");
        int a = klavye.nextInt();
        System.out.println("oynayacağınız alanın sütun değerini giriniz:");
        int b = klavye.nextInt();

        int[][] oyunMatrisi = haritaDoldur(a, b);
        int puan = 0;
        boolean kontrol = true;
        while (kontrol) {
            System.out.println("seçtiğiniz noktanın satır değerini giriniz: ");
            int x = klavye.nextInt();
            System.out.println("seçtiğiniz noktanın sütun değerini giriniz: ");
            int y = klavye.nextInt();
            if (oyunMatrisi[x][y] == 0) {
                kontrol = false;
            } else {
                puan = puan + 10;
                System.out.println("hâlâ hayattasın...Devam.");
            }
        }

        System.out.println("oyun bitti puanınız:" + puan);
    }

    public static int[][] haritaDoldur(int satir, int sutun) {
        Random rnd = new Random();
        int[][] matris = new int[satir][sutun];
        int i = 0;
        while (i < satir) {
            int j = 0;
            while (j < sutun) {
                matris[i][j] = rnd.nextInt(2);
                j = j + 1;
            }
            i = i + 1;
        }
        for (int k = 0; k < satir; k++) {
            for (int l = 0; l < sutun; l++) {
                System.out.print(matris[k][l] + " ");

            }
            System.out.println();

        }
        return matris;
    }

}
