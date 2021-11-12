package apss.pkg7_.karesel.sayı;

public class APSS7_KARESELSAYI {

    public static void main(String[] args) {
        long pay = 1;
        long payda = 2;
        
        for (int i = 0; i < 6; i++) {
            System.out.print(pay + "/" + payda + "   ");
            pay = payda;
            payda = payda * payda;
        }
    }
}
