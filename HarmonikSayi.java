import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        System.out.println("Sayı Girin");
        int sayi = new Scanner(System.in).nextInt();
        double sum=0.0;
        for(double i=1;i<=sayi;i++){
            sum+= (1/i);
        }
        System.out.println(sum);
    }
}
