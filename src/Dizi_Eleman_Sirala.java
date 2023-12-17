import java.util.Arrays;
import java.util.Scanner;

public class Dizi_Eleman_Sirala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        int n = sc.nextInt();
        System.out.println("Dizinin elemanlarını girin: ");
        int [] list = new int [n];
        for(int i=0; i<n;i++)
        {
            System.out.println((i+1)+" . Eleman :");
            int sayi = sc.nextInt();
            list[i]=sayi;


        }
        Arrays.sort(list);
        System.out.println("Dizideki elemanlar küçükten büyüğe sıralandı");
        for(int j=0; j<list.length;j++)
        {
            System.out.print(list[j]+" ");
        }

    }
}
