import java.util.Scanner;

public class RecursiveMetotlarileUsluSayiHesapama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int taban = sc.nextInt();
        System.out.println("Üst Değerini Giriniz: ");
        int us = sc.nextInt();
        System.out.print("Sonuc: "+sonuc(taban,us));


    }
    public static int sonuc (int a,int b){
        int sum =1;
        if(b==0){

        }
        else {
            for(int i =1;i<=b;i++){
                sum*=a;

            }
        }

            return sum;
}
}
