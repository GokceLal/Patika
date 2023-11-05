import java.util.Scanner;

public class BasamakSayiToplam {
    public static void main(String[] args) {
        /**
         * Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
         *
         * Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */

        int basNumber=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı girin");
        int sayi = sc.nextInt();
        int tempNumber = sayi;
        int basValue;
        while (sayi!=0){
          sayi= sayi/10;
          basNumber++;

        }
        int total =0;
        while (tempNumber!=0){
            basValue=tempNumber%10;
            System.out.println(basValue);
            tempNumber/=10;
            total+=basValue;
        }
        //System.out.println("Basamak sayısı:  "+basNumber);
        System.out.println("Toplam Değişkenimiz:  "+total);
    }
}
