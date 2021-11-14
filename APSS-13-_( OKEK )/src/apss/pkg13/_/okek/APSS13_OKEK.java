package apss.pkg13._.okek;

import java.util.Scanner;

public class APSS13_OKEK {

    public static void main(String[] args) {

        int x, y;
        System.out.print("birinci sayıyı giriniz: ");
        Scanner oku = new Scanner(System.in);
        x = oku.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        y = oku.nextInt();
        System.out.println("okek: " + okek(x, y));

        int obeb = x * y / okek(x, y);
        System.out.println("obeb: " + obeb);
    }

    public static int okek(int x, int y) {
        int okek = 0;
        for (int i = 1; i <= x * y; i++) {
            if (i % x == 0 && i % y == 0) {
                okek = i;
                break;
            }
        }
        return okek;
    }
}
