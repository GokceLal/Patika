import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlıcan, tutar;
        System.out.print("Kaç kilogram armut :");
        Scanner input = new Scanner(System.in);
        armut = input.nextInt();
        System.out.print("Kaç kilogram elma :");
        Scanner inputelma = new Scanner(System.in);
        elma = inputelma.nextInt();
        System.out.print("Kaç kilogram domates :");
        Scanner inputdomates = new Scanner(System.in);
        domates = inputdomates.nextInt();
        System.out.print("Kaç kilogram muz :");
        Scanner inputmuz = new Scanner(System.in);
        muz = inputmuz.nextInt();
        System.out.print("Kaç kilogram patlıcan :");
        Scanner inputpatlıcan = new Scanner(System.in);
        patlıcan = inputpatlıcan.nextInt();
        tutar =((armut * 2.14)+(elma * 3.67)+(domates * 1.11)+(muz * 0.95)+(patlıcan * 5.00));
        System.out.println("Toplam Tutar: " + tutar );

    }
    }