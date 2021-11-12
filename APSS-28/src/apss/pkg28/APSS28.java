package apss.pkg28;

import java.util.Scanner;

public class APSS28 {

    public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);

        System.out.println("başlangıç değerini giriniz:");
        int başlangıç=klavye.nextInt();
        
        System.out.println("adet değerini giriniz:");
        int adet=klavye.nextInt();
        
        System.out.println("artış değerini giriniz:");
        int artıs=klavye.nextInt();
        
        Yazdir(başlangıç,adet,artıs);
    }
  public static void Yazdir(int başlangıç,int adet,int artıs) {
      
      for(int i=0; i<adet; i++){
          System.out.print(başlangıç+", ");
          başlangıç=başlangıç+artıs;
         
      }
     
  } 
}
