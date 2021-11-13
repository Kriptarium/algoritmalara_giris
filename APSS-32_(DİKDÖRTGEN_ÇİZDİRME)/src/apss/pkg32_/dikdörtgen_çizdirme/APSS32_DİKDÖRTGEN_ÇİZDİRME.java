package apss.pkg32_.dikdörtgen_çizdirme;

import java.util.Scanner;

public class APSS32_DİKDÖRTGEN_ÇİZDİRME {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("dikdörtgen için yükseklik değeri giriniz: ");
        int yukseklik=klavye.nextInt();
        System.out.println("dikdörtgen için taban değeri giriniz: ");
        int taban=klavye.nextInt();
        
        for(int i=0; i<yukseklik; i++){
            for(int j=0; j<taban; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
