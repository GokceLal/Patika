import java.util.Scanner;

public class Kullanici_Sifre {
    public static void main(String[] args) {
        String userName, password, passwordnew ;
        int secim =1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Kullanıcı adınızı giriniz");
            userName = sc.nextLine();
            System.out.println("Şifrenizi Giriniz");
            password = sc.nextLine();
            if (userName.equals("patika") && password.equals("1234")) {
                System.out.println("Girdiğniz bilgiler doğrudur");
                secim = 0;

            }
            else {
                System.out.println("Girdiğiniz Bilgiler yanlıştır");
                System.out.println("Şifrenizi değiştirmek için 1 'e basın değiştirmek istemiyorsanız 2 ye basın");
                secim= sc.nextInt();

                switch(secim) {
                    case 1:

                        System.out.println("Yeni şifrenizi girin");
                        passwordnew= sc.next();
                        if (passwordnew.equals("1234")) { //== diyince hata veriyor
                            System.out.println("Şifreniz önceki şifreniz ile aynı olamaz");
                            break;
                        }

                        if(!passwordnew.equals("1234") ){
                        System.out.println("Şifreniz değiştirilmiştir");
                        break;
                    }

                    case 2:
                        System.out.println("Şifreniz değiştirilmedi");
                        break;

                }

            }

    }}
