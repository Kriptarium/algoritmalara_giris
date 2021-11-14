import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi{

    public static int [][] haritaDoldur(int satir, int sutun){
        Random random = new Random();
        
        int [][] matris = new int[satir][sutun];

        int i = 0;

        while(i < satir){
            int j = 0;
            while(j < sutun){
                matris[i][j] = random.nextInt(2);
                j++;
            }
            i++;
        }
        for(int k = 0; k < satir; k++){
            for(int l = 0; l < sutun; l++){
                System.out.print(matris[k][l] + " ");
            }
            System.out.println();
        }
        return matris;
    }
    public static void main(String[] args) {
        Scanner klavye  = new Scanner(System.in);

        System.out.print("Oyunun satır boyutunu giriniz: ");
        int satir = klavye.nextInt();


        System.out.print("Oyunun sütun boyutunu giriniz: ");
        int sutun = klavye.nextInt();

        int[][] oyunMatrisi = haritaDoldur(satir, sutun);

        int puan = 0;
        boolean kontrol = true;

        while(kontrol){
            System.out.print("Seçtiğiniz konumun satır değerini giriniz: ");
            int x = klavye.nextInt();


            System.out.print("Seçtiğiniz konumun sütun değerini giriniz: ");
            int y = klavye.nextInt();

            if(oyunMatrisi[x][y] == 1){
                kontrol = false;
            } 
            else{
                puan = puan + 10;
                System.out.println("Hala hayattasın Devam....");
            }
        }
        System.err.println("Oyun Bitti! Puanınız: " + puan);
    }
}