import java.util.Scanner;

public class N_TaneSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç adet sayı giriceksiniz ");
        int sayi = sc.nextInt();
        int i =1;
        int enBuyuk=Integer.MIN_VALUE, enKucuk=Integer.MAX_VALUE;

        while (i<=sayi)
        {
            System.out.println(i+". sayıyı girin: ");
            int yeniSayi= sc.nextInt();

           if (enBuyuk<yeniSayi)
               enBuyuk = yeniSayi;
           if(enKucuk>yeniSayi)
               enKucuk = yeniSayi;
            i++;

        }
        System.out.println("En büyük sayı : "+enBuyuk);
        System.out.println("En küçük sayı : "+enKucuk);
    }
}
