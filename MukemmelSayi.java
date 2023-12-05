import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        //mükemmel sayı bul
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        int sayi = sc.nextInt();
        int toplam =0;
        for(int i = 1; i<sayi; i++){
            if (sayi%i==0)
            {
                toplam +=i;
            }
        }
        if (sayi == toplam)
            System.out.println("Bu sayı mükemmel sayıdır");
        else
            System.out.println("Bu sayı mükemmel sayı değildir");

    }
}
