package apss.pkg39_.şekilli.sayılar;

import java.util.Scanner;
import java.awt.Checkbox;

public class APSS39_ŞEKİLLİSAYILAR {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int sayi = klavye.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
