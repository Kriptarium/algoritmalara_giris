package apss.pkg17;

public class APSS17 {

    public static void main(String[] args) {
        
        int[] veri={6,21,64,97,666,197};
        System.out.println("değiştirilen eleman: "+Degis(veri,4));
    }
    static int Degis(int[] dizi, int pozisyon){
        int sonuc=dizi[pozisyon];
        dizi[pozisyon]=-1;
        return sonuc;
    }
    
}
