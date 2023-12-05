package Employee;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sırayla ad / maaş bilgisi / çalışma saati / çalışma yılını giriniz ");
        Employee employee= new Employee(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());


        employee.bonus();
        employee.tax();
        employee.raiseSalary();
        employee.print();

        System.out.println(employee.toString());
    }



}