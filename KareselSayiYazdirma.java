public class KareselSayiYazdirma {
    public static void main(String[] args) {
        double pay = 1;
        double payda = 2;

        int i = 0;
        while(i < 6){
            System.out.print(pay + "/" + payda + " ");
            pay = payda;
            payda = payda * payda;
            i++;
        }
    }
}
