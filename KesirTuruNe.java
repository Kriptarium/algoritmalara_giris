import java.util.Scanner;

public class KesirTuruNe {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.print("Pay değerini giriniz: ");
        int pay = klavye.nextInt();

        System.out.print("Payda değerini giriniz: ");
        int payda = klavye.nextInt();

        if(pay < payda)
            System.err.println("Basit kesir girdiniz..");
        else if(pay == payda)
            System.err.println("Bir tam sayı girdiniz..");
        else{
            int x = pay / payda;
            int y = pay % payda;
            System.err.println("Bileşik bir kesir girdiniz...");
            System.err.println("Kesir Değeri = " + x + " tam " + y + "/" + payda);
        }

        klavye.close();
    }
}
