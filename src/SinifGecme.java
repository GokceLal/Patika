import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int toplam=0,dersSayısı=0;
        System.out.println("Matematik Notunuz");
        mat = sc.nextInt();
        System.out.println("Fizik Notunuz");
        fizik= sc. nextInt();
        System.out.println("Türkçe Notunuz");
        turkce= sc.nextInt();
        System.out.println("Kimya Notunuz");
        kimya = sc.nextInt();
        System.out.println("Müzik Notunuz");
        muzik =sc.nextInt();


        if((mat<=100)&&(mat>0)){
            toplam+=mat;
            dersSayısı++;
        }
        else {
            System.out.println("Geçersiz not");

        }
        if((fizik<=100)&&(fizik>0)){
            toplam+=fizik;
            dersSayısı++;
        }
        else {
            System.out.println("Geçersiz not");

        }
        if((turkce<=100)&&(turkce>0)){
            toplam+=turkce;
            dersSayısı++;
        }
        else {
            System.out.println("Geçersiz not");

        }
        if((kimya<=100)&&(kimya>0)){
            toplam+=kimya;
            dersSayısı++;
        }
        else {
            System.out.println("Geçersiz not");

        }
        if((muzik<=100)&&(muzik>0)){
            toplam+=muzik;
            dersSayısı++;
        }
        else {
            System.out.println("Geçersiz not");

        }

            double ort = (double) toplam /dersSayısı;
            if(ort>55){
                System.out.println("Ortama  "+ort+"  GEÇTİNİZ ");

            }
            else
                System.out.println("Ortalama  "+ort+ "   KALDINIZ");




    }
    }
