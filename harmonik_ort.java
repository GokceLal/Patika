import java.util.Scanner;

public class harmonik_ort {
    public static void main(String[] args) {
        /**
         * Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
         *
         * Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi = scanner.nextInt();
        System.out.println("Elemanlar");
        double[] arr = new double[sayi];
        double seri =0;
        for ( int i=1;i< arr.length;i++)
        {
          seri= 1 / i;

        }
        double ort = (arr.length/seri);
        System.out.println("Harmonik Ortalama :" +ort);


    }
}
