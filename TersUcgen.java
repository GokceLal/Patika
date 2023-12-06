import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SAYI GİRİNİZ");
        int sayi = sc.nextInt();
        int i,j,k;

        for (i=sayi; 0<=i; i=i-2) {
            for(j=i; j<sayi;j++) {
                System.out.print(" ");
            }
            for (k=0; k<=i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}

