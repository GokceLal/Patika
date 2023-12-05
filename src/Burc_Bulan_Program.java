import java.util.Scanner;

public class Burc_Bulan_Program {
    public static void main(String[] args) {


                Scanner burc = new Scanner(System.in);
                int month, day;

                System.out.print("Doğduğunuz ay: ");
                month = burc.nextInt();
                System.out.print("Doğduğunuz gün: ");
                day = burc.nextInt();

                if (month == 1){
                    if (day >= 1) {
                        if (day < 22) {
                            System.out.println("Burcunuz Oğlak.");
                        } else if ((day >= 22 && day <= 31)) {
                            System.out.println("Burcunuz Kova.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 2){
                    if (day >= 1) {
                        if (day < 20) {
                            System.out.println("Burcunuz Kova.");
                        } else if ((day >= 20 && day <= 29)) {
                            System.out.println("Burcunuz Balık.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 3){
                    if (day >= 1) {
                        if (day < 21) {
                            System.out.println("Burcunuz Balık.");
                        } else if ((day >= 21 && day <= 31)) {
                            System.out.println("Burcunuz Koç.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 4){
                    if (day >= 1) {
                        if (day < 21) {
                            System.out.println("Burcunuz Koç.");
                        } else if ((day >= 21 && day <= 30)) {
                            System.out.println("Burcunuz Boğa.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 5){
                    if (day >= 1) {
                        if (day < 22) {
                            System.out.println("Burcunuz Boğa.");
                        } else if ((day >= 22 && day <= 31)) {
                            System.out.println("Burcunuz İkizler.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 6){
                    if (day >= 1) {
                        if (day < 23) {
                            System.out.println("Burcunuz İkizler.");
                        } else if ((day >= 23 && day <= 30)) {
                            System.out.println("Burcunuz Yengeç.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 7){
                    if (day >= 1) {
                        if (day < 23) {
                            System.out.println("Burcunuz Yengeç.");
                        } else if ((day >= 23 && day <= 31)) {
                            System.out.println("Burcunuz Aslan.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 8){
                    if (day >= 1) {
                        if (day < 23) {
                            System.out.println("Burcunuz Aslan.");
                        } else if ((day >= 23 && day <= 31)) {
                            System.out.println("Burcunuz Başak.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 9){
                    if (day >= 1) {
                        if (day < 23) {
                            System.out.println("Burcunuz Başak.");
                        } else if ((day >= 23 && day <= 30)) {
                            System.out.println("Burcunuz Terazi.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 10){
                    if (day >= 1) {
                        if (day < 23) {
                            System.out.println("Burcunuz Terazi.");
                        } else if ((day >= 23 && day <= 31)) {
                            System.out.println("Burcunuz Akrep.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 11){
                    if (day >= 1) {
                        if (day < 22) {
                            System.out.println("Burcunuz Akrep.");
                        } else if ((day >= 22 && day <= 30)) {
                            System.out.println("Burcunuz Yay.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }

                if (month == 12){
                    if (day >= 1) {
                        if (day < 22) {
                            System.out.println("Burcunuz Yay.");
                        } else if ((day >= 22 && day <= 31)) {
                            System.out.println("Burcunuz Oğlak.");
                        } else {
                            System.out.println("Geçersiz bir gün girdiniz.");
                        }
                    }
                }
            }
        }

