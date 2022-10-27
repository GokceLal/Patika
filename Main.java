import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a,b;
        double c,alan,u;
        System.out.print("Üçgenin a sayısını giriniz");
        a=inp.nextInt();
        System.out.print("Üçgenin b sayısını giriniz");
        b=inp.nextInt();
        System.out.print("Üçgenin c sayısını giriniz");
        c=inp.nextInt();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Alan: "+alan);

    }
}