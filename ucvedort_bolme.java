import java.util.Scanner;

public class ucvedort_bolme {
    public static void main(String[] args) {
        System.out.println("İstediğiniz sayıyı girin:");
        Scanner sc = new Scanner(System.in);
        int sayi=sc.nextInt();
        int sayac=0;
        int sonuc=0;
        for(int i=0;i<=sayi;i++){
            if(sayi%4==0||sayi%3==0){
                sayac++;
                sonuc+=i;
            }




        }
        double ort = sonuc/sayac;
        System.out.println("3 ve 4 ün katı ortalaması = "+ort);
    }
}
