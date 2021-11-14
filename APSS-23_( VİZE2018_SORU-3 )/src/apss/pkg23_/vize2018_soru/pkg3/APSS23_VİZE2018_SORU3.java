package apss.pkg23_.vize2018_soru.pkg3;

import java.util.Scanner;

public class APSS23_VİZE2018_SORU3 {

    public static void main(String[] args) {
        
        Scanner klavye=new Scanner(System.in);
        
        System.out.println("Lütfen makine sayısını giriniz: ");
        int makine_sayisi=klavye.nextInt();
        
        System.out.println("Lütfen hangi ayda olduğunuzu giriniz: ");
        int ay=klavye.nextInt();
        
        int sure;
        int aralik;
        
        if(ay>2 && ay<9){
            sure=480;
            aralik=45;
        }
        else{
            sure=540;
            aralik=30;
        }
        
        int i=makine_sayisi;
        while(i>0){
            System.out.print(sure+" - ");
            sure=sure-aralik;
            i=i-1;
        }
       
    }
    
}
