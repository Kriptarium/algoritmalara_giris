public class Navigasyon {

    public static String yolBul(int [][] veri){
        String sonuc = "";
        int satir = veri.length;
        int sutun = veri[0].length;

        int i = 0; 
        
        while(i < satir){
            int j = 0;
            while(j < sutun){
                if(veri[i][j] == 1){
                    sonuc = sonuc + " " + i + j; 
                }
                j++;
            }
            i++;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        int harita [][] = {{1,1,0,0,0},{0,1,1,0,0},{0,0,1,1,0},{0,0,0,1,1}};
        String yol = yolBul(harita);
        System.out.println(yol);
    }
}
