import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int boy,kilo;
        double index;
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        Scanner input =new Scanner(System.in);
        boy=input.nextInt();
        System.out.print("Lütfen kilonuzu giriniz :");
        Scanner inputa = new Scanner(System.in);
        kilo=inputa.nextInt();
        index=kilo*(boy*boy);
        System.out.println("Vucut index: "+index);


    }
}