import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        System.out.println("Yılı Giriniz: ");
        Scanner sc= new Scanner(System.in);
        int yil = sc.nextInt();
        if(yil%4==0)
        {
            System.out.println(yil+" Artık yıl");
        }
        else
            System.out.println(yil+" Artık yıl değil");
    }
}
