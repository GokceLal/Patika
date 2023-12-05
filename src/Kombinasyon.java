import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        /**
         * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı
         * grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li
         * kombinasyonu C(n,r) şeklinde gösterilir.
         *
         * Java ile kombinasyon hesaplayan program yazınız.
         *
         * Kombinasyon formülü
         * C(n,r) = n! / (r! * (n-r)!)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Küme eleman sayısını giriniz(N)");
        int n= sc.nextInt();
        System.out.println("Grup sayısını giriniz (R)");
        int r = sc.nextInt();
        int n_faktoriel=1;
        int r_faktoriel=1;
        int nr_faktoriel=1;

        for (int i=1;i<=n;i++){
            n_faktoriel*=i;
        }
        for(int i=1;i<=r;i++){
            r_faktoriel*=i;
        }
        int fark =n-r;
        for (int i=1;i<=fark;i++){
            nr_faktoriel*=i;
        }

        int total = (n_faktoriel/(r_faktoriel*nr_faktoriel));
        System.out.println("Kombinasyon Sonuç = "+total);

    }
}
