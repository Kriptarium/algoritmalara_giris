package apss.pkg2_.navigasyon;

public class APSS2_NAVİGASYON {

    public static void main(String[] args) {
        // TODO code application logic here
        int harita[][] = {{1, 1, 0, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}};
        //System.out.print((harita));
        String yol = YolBul(harita);
        System.out.println(yol);

    }

    public static String YolBul(int[][] veri) {
        String sonuc = "";
        int satir = veri.length;
        int sutun = veri[0].length;

        int i = 0;
        while (i < satir) {
            int j = 0;
            while (j < sutun) {
                if (veri[i][j] == 1) {
                    sonuc = sonuc + " " + i + j;
                }
                j = j + 1;
            }
            i = i + 1;
        }
        return sonuc;
    }

}
