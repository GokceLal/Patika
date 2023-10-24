import java.util.Scanner;

public class Ucak_Bileti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km,yas,tip;
        double tutar=1,indirim=1,total=1;
        System.out.println("Mesafeyi KM olarak giriniz");
        km = sc.nextInt();
        System.out.println("Yaşınızı girin");
        yas = sc.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip=sc.nextInt();

        if(tip==1||tip==2){
        if(yas<12){
            tutar=km*0.10;
            indirim=tutar*0.50;
            total=tutar-indirim;
        }
        else if(yas>12&&(yas<24)){
            tutar=km*0.10;
            indirim=tutar*0.10;
            total=tutar-indirim;


        }
        else if(yas>65){
            tutar=km*0.10;
            indirim=tutar*0.30;
            total=tutar-indirim;
        }
        else if(yas>24&&yas<65) {
                tutar=km*0.10;
                total=tutar;
            }
        if(tip==2){

            tutar=total*0.20;

            total=(total-tutar)*2;
            System.out.println("Toplam tutar : "+total +"TL");
        }
        if(tip==1)
        {
            System.out.println("Toplam tutar : "+total+"TL");
        }



    }    else if(!((tip==1||tip==2)))
            System.out.println("Hatalı veri girdiniz !");
}}
