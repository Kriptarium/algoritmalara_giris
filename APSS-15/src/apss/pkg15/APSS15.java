package apss.pkg15;

public class APSS15 {

    public static void main(String[] args) {
        int[] veri={6, 21, 17, 64, 97, 102, 197};
        System.out.println("değiştirilen eleman: "+Değiş(veri,3));
    }
public static int Değiş(int[] dizi, int pozisyon){
    int sonuc=dizi[pozisyon];
    dizi[pozisyon]=-1;
    return sonuc;
}   
}
