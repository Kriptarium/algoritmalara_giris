package apss.pkg5_.vücut_.kitle._indeksi;

import java.util.Scanner;

public class APSS5_VÜCUT_KİTLE_İNDEKSİ {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("lütfen byunuzu giriniz:");
        int boy = klavye.nextInt();
        System.out.println("lütfen kilonuzu giriniz:");
        int kilo = klavye.nextInt();
        if (boy / kilo < 2) {
            System.out.println("ŞİŞMAN");
        } else if (boy / kilo < 2.5 && boy / kilo < 2) {
            System.out.println("NORMAL");

        } else {
            System.out.println("ZAYIF");
        }
        NewJFrame nj=new NewJFrame();
    }

}
