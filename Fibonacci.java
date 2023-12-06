public class Fibonacci {
    public static void main(String[] args) {
        int sayi =0,sum=1;
        int esum=1;
        for (int i=0;i<8;i++)
        {
            esum=sayi+sum;
            System.out.println(sayi+"+"+sum+"="+esum);
            sayi=sum;
            sum=esum;


        }
    }
}
