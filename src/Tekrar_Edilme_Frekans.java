import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tekrar_Edilme_Frekans {

            public static void main(String[] args) {
                int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

                int[] tekrarSayilari = new int[dizi.length];
                Arrays.fill(tekrarSayilari, -1);

                for (int i = 0; i < dizi.length; i++) {
                    int sayi = dizi[i];
                    int sayac = 1;

                    for (int j = i + 1; j < dizi.length; j++) {
                        if (dizi[j] == sayi) {
                            sayac++;
                            tekrarSayilari[j] = 0;
                        }
                    }

                    if (tekrarSayilari[i] != 0) {
                        tekrarSayilari[i] = sayac;
                    }
                }

                System.out.println("Tekrar Sayıları");
                for (int i = 0; i < dizi.length; i++) {
                    if (tekrarSayilari[i] != 0) {
                        System.out.println(dizi[i] + " sayısı " + tekrarSayilari[i] + " kere tekrar edildi.");
                    }
                }
            }
        }


