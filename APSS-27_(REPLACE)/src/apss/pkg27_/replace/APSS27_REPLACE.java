package apss.pkg27_.replace;

import java.util.Scanner;

public class APSS27_REPLACE {

    public static void main(String[] args) {
        System.out.print("veri girişi yapınız: ");
        Scanner klavye = new Scanner(System.in);
        String x = klavye.nextLine();
        String y = Degistir(x, 'a', 'b');
        System.err.println(y);
    }

    public static String Degistir(String veri, char eski, char yeni) {
        String sonuc = "";
        for (int i = 0; i < veri.length(); i++) {
            if (veri.substring(i, i + 1).equals(String.valueOf(eski))) {
                sonuc = sonuc + String.valueOf(yeni);
            } else {
                sonuc = sonuc + veri.substring(i, i + 1);
            }
        }
        return sonuc;
    }
}
