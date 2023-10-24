import java.util.Scanner;

public class Kucukten_Buyuge {
    public static void main(String[] args) {
        int a,b,c,min=0,max=0,ort=0;
        System.out.println("Sıra ile 3 sayıyı giriniz");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c= sc.nextInt();
        if((a>b)&&(a>c)){
            max=a;
            if(b>c){
                min=c;
                ort=b;
            }

            else{
                min=b;ort=c;
            }

        }
        else if ((b>a)&&(b>c)){
            max=b;
            if(a>c){
                min=c;
                ort=a;
            }

            else {
                min=b;ort=a;
            }


        } else if ((c>a)&&(c>b)) {
            max=c;
            if(a<b){
                min=a;
                ort=b;
            }

            else {
                min=b;
                ort=a;
            }

        }

        System.out.println("Küçükten Büyüğe Sıralama"+min +ort +max );


    }
}
