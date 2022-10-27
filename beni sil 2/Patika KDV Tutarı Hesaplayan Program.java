import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double tutar, kdvOrani1 = 0.18, kdvOrani2 = 0.08, kdvliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Para tutarını giriniz:");
        tutar = inp.nextDouble();

        kdvliTutar = tutar < 1000 ? (tutar * kdvOrani1 + tutar) : (tutar * kdvOrani2 + tutar);

        System.out.println("Tutar: " + tutar);
        System.out.println("1000 TL'ye kadar KDV Oranı: " + kdvOrani1);
        System.out.println("1000 TL ve sonrası için KDV Oranı: " + kdvOrani2);
        System.out.println("Girilen tutar için KDV'li fiyat: " + kdvliTutar);
    }
}