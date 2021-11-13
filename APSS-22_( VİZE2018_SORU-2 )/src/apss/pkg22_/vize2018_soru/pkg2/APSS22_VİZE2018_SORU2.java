package apss.pkg22_.vize2018_soru.pkg2;

import java.util.Scanner;

public class APSS22_VİZE2018_SORU2 {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        
        System.out.println("cinsiyeti giriniz: ");
        String cinsiyet=klavye.nextLine();
        
        System.out.println("Adım sayısını giriniz: ");
        int adım_sayisi=klavye.nextInt();
        
        int kalori;
        
        if(cinsiyet.equals("kadın")){
            kalori=adım_sayisi*30/500;
        }
        else{
            kalori=adım_sayisi*45/500;
        }
        System.out.println("yakılan kalori miktarı: "+kalori);
    }
    
}
