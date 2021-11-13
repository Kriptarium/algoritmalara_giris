package apss.pkg38_.asal_fibo;

import java.util.Scanner;

public class APSS38_ASAL_FİBO {

    public static void main(String[] args) {
        //MAİN METODU 5 PUAN     
        Scanner klavye = new Scanner(System.in);

        System.out.print("Lütfen x değerini giriniz: ");
        int x = klavye.nextInt();
        System.out.print("Lütfen seride hesaplanacak eleman sayısını giriniz: ");
        int n = klavye.nextInt();
        int fiboDeger = 1;
        int asalDeger = 2;
        int carpan = 3;
        System.out.print("-");
        int i = 1;
        while (i <= n) {
            System.out.print("(Fibo(" + fiboDeger + ")" + "*Asal(" + asalDeger + "))/(" + carpan + "*" + x + ")");
            if (i != n) {
                if (i % 2 == 0) {
                    System.out.print("-");
                } else {
                    System.out.print("+");
                }
            } else {
                System.out.print("=");
            }
            fiboDeger = fiboDeger + 2;
            asalDeger = asalDeger + 3;
            carpan = carpan + 4;
            i = i + 1;
        }
        System.out.print(Hesapla(x, n));
    }

    //HESAPLA 10 PUAN   
    public static double Hesapla(int deger, int terimSayisi) {
        double sonuc = 0.0;
        int fiboDeger = 1;
        int asalDeger = 2;
        int carpan = 3;
        int i = 1;
        while (i <= terimSayisi) {
            double q = (Fibo(fiboDeger) * Asal(asalDeger)) / (carpan * deger);
            if (i % 2 == 1) {
                sonuc = sonuc - q;
            } else {
                sonuc = sonuc + q;
            }
            i = i + 1;
            fiboDeger = fiboDeger + 2;
            asalDeger = asalDeger + 3;
            carpan = carpan + 4;
        }
        return sonuc;
    }

    //10 PUAN  
    public static int Fibo(int n) {

        if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibo(n - 1) + Fibo(n - 2);
        }
    }

    //15 PUAN   
    public static int Asal(int x) {
        int sonuc = -1;
        int asalSayi = 2;
        int sayac = x;
        while (sayac > 0) {
            boolean kontrol = true;
            for (int i = 2; i < asalSayi; i++) {
                if (asalSayi % i == 0) {
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                sayac = sayac - 1;
                sonuc = asalSayi;
            }
            asalSayi = asalSayi + 1;
        }
        return sonuc;
    }

}
