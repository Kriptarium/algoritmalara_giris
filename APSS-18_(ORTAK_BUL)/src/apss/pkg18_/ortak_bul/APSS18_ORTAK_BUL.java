package apss.pkg18_.ortak_bul;

public class APSS18_ORTAK_BUL {

    public static void main(String[] args) {
      int[] veri_1={12,13,24,54,67,87,89};
      int[] veri_2={12,43,35,54,56,87,89};
      
      int[] sonuc=ortakBul(veri_1,veri_2);
      System.err.println("ortak elemanlar: ");
      for(int indis=0; indis<sonuc.length;indis++){
          System.out.print(sonuc[indis]+" ");
      }
    }
    
public static int[] ortakBul(int[] dizi_1,int[] dizi_2){
    int[] ortakELemanlar=new int[dizi_1.length];
    int pozisyon=0;
    for(int i=0; i<dizi_1.length; i++){
        if(dizi_1[i]==dizi_2[i]){
            ortakELemanlar[pozisyon]=dizi_1[i];
            pozisyon++;
        }
    }
    if(pozisyon!=dizi_1.length){
        for(int k=pozisyon; k<dizi_1.length; k++){
            ortakELemanlar[k]=-1;
        }
        
    }
    return ortakELemanlar;
}
}
