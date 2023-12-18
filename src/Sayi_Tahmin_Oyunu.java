import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sayi_Tahmin_Oyunu {
    //Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı
    // kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
    public static void main(String[] args) {
        System.out.println("Oyuna Hoşgeldiniz");
        System.out.println("Oyun boyunca 5 adet tahmin hakkınız olucaktır");
        Random random = new Random();
        int number = random.nextInt(0,100);
        int right=0;
        boolean isWin = false;
        int[] wrong = new int [5];



        while(right<5)
        {
            Scanner sc = new Scanner(System.in);
            int newNumber = sc.nextInt();
            if ((newNumber>0)&&(newNumber<100)){
                if(number==newNumber){
                    System.out.println("Tebrikler Kazandınız");
                    isWin=true;
                    break;
                }
                else {
                    System.out.println("Malesef bilemediniz");
                    System.out.println("Kalan hakkınız: "+(5-right));
                    wrong [right] = newNumber;
                    right++;
                    if(number>newNumber)
                        System.out.println("Tahmin sayınızı büyültün");
                     if (newNumber>number)
                        System.out.println("Tahmin sayınızı küçültün");

                }

            }
            else {
                System.out.println("Seçim yapıcağınız sayı 0 ile 100 arasında olmalıdır");

            }

        }
        if(!isWin)
        {
            System.out.println("Tahmin haklarınız bitmiştir");
            System.out.println("Tahmin sayımız : "+number);
            System.out.println("Yaptığınız yanlış tahminler");
            System.out.println(Arrays.toString(wrong));
        }



    }
}
