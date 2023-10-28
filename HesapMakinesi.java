import java.util.Locale;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "İŞLEM NUMARANIZI SEÇİNİZ :\n" +
                        "1- Toplama İşlemi\n" +
                        "2- Çıkarma İşlemi\n" +
                        "3- Çarpma İşlemi\n" +
                        "4- Bölme işlemi\n" +
                        "5- Üslü Sayı Hesaplama\n" +
                        "6- Faktoriyel Hesaplama\n" +
                        "7- Mod Alma\n" +
                        "8- Dikdörtgen Alan ve Çevre Hesabı\n" +
                        "0-Çıkış");

        int select;
        do {
            select = sc.nextInt();
            System.out.println("ilk sayıyı giriniz");
            int sayi1 = sc.nextInt();
            System.out.println("ikinci sayıyı giriniz");
            int sayi2 = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Toplam: " + toplam(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 2:
                    System.out.println("Çıkartma: " + cikartma(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 3:
                    System.out.println("Çarpma: " + carpma(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 4:
                    System.out.println("Bölme: " + bolma(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 5:
                    System.out.println("Üstlü: " + uslu(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 6:
                    System.out.println("Faktoriyel: " + fact(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 7:
                    System.out.println("Mod: " + mod(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 8:
                    System.out.println("Dikdörtgen: " + dikdortgen(sayi1, sayi2));
                    System.out.println("Yeni işlem sayısı giriniz");
                    break;
                case 0:
                    System.out.println("Sistem durdurulmuştur");
                    break;
            }
        } while (select != 0);

    }
    public static int toplam(int a,int b){
        return a+b;
    }
    public static void ekran(){

    }
    static int cikartma(int a,int b){
        int sum=0;
        if(a<b)
            return b-a;
        else
            return a-b;
    }
    static int carpma(int a,int b){
        return a*b;
    }
    static int bolma(int a,int b){
        return a/b;
    }
    static int uslu(int a,int b ){
        int sum=1;
        for(int i=1;i<=b;i++)
        {
            sum*=a;
        }
        return sum;
    }
    static int fact(int a,int b){
        int sum=1;
        for (int i=1;i<=b;i++){
            sum*=i;
        }
        return sum;
    }
    static int mod(int a,int b){
        return a%b;
    }
    static int dikdortgen(int a,int b){

        System.out.println("Dikdörtgenin alanı için 'a' harfine çevresi için 'c' harfine basın");
        String secim= new Scanner(System.in).nextLine();
        if (secim.equals("a")||secim.equals("A")){
            return a*b;

        }
        else
            return 2*(a+b);

    }

}
