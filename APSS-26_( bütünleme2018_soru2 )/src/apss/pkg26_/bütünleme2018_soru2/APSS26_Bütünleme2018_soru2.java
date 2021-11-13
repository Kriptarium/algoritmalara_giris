package apss.pkg26_.bütünleme2018_soru2;

import java.util.Scanner;

public class APSS26_Bütünleme2018_soru2 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("String değerinizi giriniz: ");
        String deger = klavye.nextLine();
        System.out.println("sonuc: " + Hesapla(deger));
    }

    public static double Hesapla(String degisken) {
        /**
         * gelen veri belirli bir formatta geliyor ve bu formata göre noktalı
         * virgülün öncesi isim sonrası doğum yılı olarak belirlenmiş bu yüzden
         * noktalı virgülün pozisyonunu bulmalıyız. 0 dan noktalı virgülün
         * pozisyonuna kadar olan kısım isim, bunun 1 fazlasından sonuna kadar
         * olan kısım ise yıldır.
         */
//parçalama işlemini bu şekilde döngüyle de yapabiliriz:
//        int pozisyon =-1;
//        for(int  k=0; k<degisken.length();k++){
//            if(degisken.subSequence(k, k+1)==";")
//                pozisyon=k;
//        }
//        String isim=degisken.substring(0,pozisyon);
//        String dogumYılı=degisken.substring(pozisyon+1,degisken.length());

        double sonuc = 0;
        String parcala[] = degisken.split(";");
        String isim = parcala[0];
        String yıl = parcala[1];

        double veriler;
        if (isim.length() < 4) {//aritmetik ortalamanın hesaplanması

            veriler = 0.0;//aritmetik ortalamanın etkisiz elemanı başlangıç olarak atanmış

            for (int i = 0; i < yıl.length(); i++) {
                veriler = veriler + Double.parseDouble(yıl.substring(i, i + 1));
            }
            sonuc = veriler / yıl.length();
        } else {
            veriler = 1;//geometrik ortalamanın etkisiz elemanı başlangıç olarak atanmış

            for (int i = 0; i < yıl.length(); i++) {//geometrik ortalamanın hesaplanması

                // if(Integer.parseInt(yıl.substring(i,i+1))!=0)
                veriler = veriler * Double.parseDouble(yıl.substring(i, i + 1));
            }
            sonuc = Math.pow(veriler, (1.0 / yıl.length()));
        }
        return sonuc;
    }
}
