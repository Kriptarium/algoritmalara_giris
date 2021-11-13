package apss.pkg12_.fonksiyon_hesapla;

public class APSS12_FONKSİYON_HESAPLA {

    public static void main(String[] args) {

        double[] dizi = {0.0, 0.0, 5.0, 9.3, 7.0};
        double deger = -13;
        System.err.println(polinomDegerHesapla(dizi, deger));
    }

    public static double polinomDegerHesapla(double[] katsayilar, double x) {

        double sonuc = 0;

        for (int i = 0; i < katsayilar.length; i++) {
            sonuc = sonuc + (katsayilar[i] * Math.pow(x, i));

        }
        return sonuc;
    }
}
