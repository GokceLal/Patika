import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        double a;
        System.out.print("Yarıçapı girin :");
        Scanner inp =new Scanner(System.in);
        r=inp.nextInt();
        System.out.print("a açısını giriniz: ");
        Scanner inpa =new Scanner(System.in);
        a=inpa.nextInt();
        double alan =(pi*(r*r)*a/360);
        System.out.println("Daire diliminin alanı :"+alan);

    }
}