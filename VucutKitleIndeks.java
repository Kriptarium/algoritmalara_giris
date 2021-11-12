import java.util.Scanner;

public class VucutKitleIndeks{
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Vücut Kitle Endeksi Programına Hoşgeldiniz");
        System.out.println("*********************************");


        System.out.print("Lütfen boyunuzu cm olarak giriniz: ");
        int boy = klavye.nextInt();

        System.out.print("Lütfen kilonuzu kg olarak giriniz: ");
        int kilo = klavye.nextInt();

        double oran = boy / kilo;

        if(oran < 2)
          System.err.println("Şişmansınız");
        else if(oran > 2.0 && oran <= 2.5)
          System.err.println("Normal Kiloya Sahipsiniz");
        else
          System.err.println("Zayıfsınız");

        klavye.close();
    }
}