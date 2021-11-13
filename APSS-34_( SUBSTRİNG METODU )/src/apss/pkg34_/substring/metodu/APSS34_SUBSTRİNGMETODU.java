package apss.pkg34_.substring.metodu;

import java.util.Scanner;

public class APSS34_SUBSTRİNGMETODU {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("lütfen bir string değeri giriniz: ");
        String deger = klavye.nextLine();

        System.out.print("Lütfen seçilecek parçanın alt aralık değerini giriniz:");
        int alt = klavye.nextInt();

        System.out.print("Lütfen seçilecek parçanın üst aralık değerini girinz: ");
        int ust = klavye.nextInt();

        System.out.print("Seçilen alt parça\n" + altParcaSec(deger, alt, ust));
        System.out.println();
        if (ust == -1) {//hazır fonksiyonun kullanımı
//eğer üst değeri -1 olarak verilmişse substring değerinin ikinci kullanımını harekete geçir
            System.out.println(deger.substring(alt));
        } else {
            System.out.println(deger.substring(alt, ust));
        }
    }

    public static String altParcaSec(String veri, int x, int y) {
        /**
         * fonksiyonumuz parametre olarak bir string değeri, bir alt değeri ve
         * bir üst değeri alıyor. substring metodu bir string ifadenin içindeki
         * alt bir parçayı seçmeye yarar...tek parametreli ve iki parametreli
         * olmak üzere iki çeşit kullanımı vardır. tek parametreli kullanımda
         * girdiğiniz değere ait pozisyondan itibaren ifadenin sonuna kadar olan
         * kısmını seçer. iki parametreli kullanımında ise seçtiğiniz alt
         * değerinden(dahil olmak üzere) seçtiğiniz üst değerine kadar(üst
         * değeri dahil olmamak üzere) olan parçayı seçer
         */
        String sonuc = "";//üzerinde değişiklik yapmak üzere boş bir sonuc degeri oluşturduk

        /**
         * substring metodunun ikinci kullanımı için koşul oluşturuldu. eğer üst
         * değeri için -1 değeri girilirse fonksiyon alt değerinden ifadenin
         * sonuna kadar olan parçayı seçeçek
         */
        if (y == -1) {
            y = veri.length();
        }

        /**
         * alt aralığından üst aralığına kadar gelen string dizisinin i.
         * elemanını seçerek boş olarak oluşturduğumuz string değerine atayacak.
         */
        for (int i = x; i < y; i++) {

            sonuc = sonuc + veri.charAt(i);

        }
        return sonuc;
    }

}
