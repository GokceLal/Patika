import java.util.Scanner;

public class Kuvvet4Ve5 {
    public static void main(String[] args) {
        /**
         *
         Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        int sayi,sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");

        sayi = input.nextInt();
        for(int i=1,j=i;i<=sayi;i*= 4){
            System.out.println("4 ün " + sayac + ".kuvveti" + " " + i);
            System.out.println("5 in " + sayac + ".kuvveti" + " " +(j*=5));
            sayac++;
        }
    }
}

