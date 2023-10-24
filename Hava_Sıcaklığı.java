import java.util.Scanner;

public class Hava_Sıcaklığı {
    public static void main(String[] args) {
        /**
         * Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
         * Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
         * Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
         * Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
         */

        System.out.println("Öneri Etkinliğiniz için Hava Sıcaklığını giriniz");
        Scanner sc = new Scanner(System.in);
        int hava = sc.nextInt();
        if(hava<5)
            System.out.println("Kayak yapabilirsiniz");

         else if((hava>5)&&(hava<15))
            System.out.println("Sinema yapabilirsiniz");
        else if((hava>15)&&(hava<25))
            System.out.println("Piknik Yapabilirsiniz");
        else
            System.out.println("Yüzmeye Gidebilirsiniz");


    }
}
