import java.util.Scanner;

public class UsHesap {
    public static void main(String[] args) {
        /**
         * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
         */
int total=1;
        System.out.println("Sayı girin");
        int sayi= new Scanner(System.in).nextInt();
        System.out.println("Üst Girin");
        int us = new Scanner(System.in).nextInt();
        for(int i=1;i<=us;i++){
            total*=sayi;
        }
        System.out.println("Sonuc....."+total);
    }
}
