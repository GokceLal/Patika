import java.util.Scanner;

public class Ciftkat4 {
    public static void main(String[] args) {
        /**
         * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
         * kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana
         * basan programı yazıyoruz.
         */
            Scanner sc = new Scanner(System.in);

            boolean a = false;
            int total =0;

        do{
            System.out.println("Lütfen sayı giriniz ");
            int sayi= sc.nextInt();
            if (sayi%2==0){
                System.out.println("girilen sayi çifttir");
                a=true;
                if(sayi%4==0){
                    total+=sayi;
                }

            }
            else
            {
                System.out.println("Girilen sayı tektir");
                System.out.println("Program sonlanıyor");
                a=false;
            }


        }while(a==true);
        System.out.println("Girilen çift sayıların toplamı = "+total);

    }
}
