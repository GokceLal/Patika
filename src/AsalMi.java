import java.util.Scanner;

public class AsalMi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi= sc.nextInt();
        asalMı(sayi);

    }
    public static void asalMı(int a){
        int sum =0,sayac=0;
        for (int i=2;i<a;i++){
            if(a%i==0)
                sayac++;
        }
        if(sayac==0){
            System.out.println(a+" Asal Sayıdır");

        }
        else
            System.out.println(a+" Asal sayı değildir");

    }

}
