package Employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double sumsalary;
    double sumsalary2;




    // Şuan ki yılı 2021 olarak alın.

    void raiseSalary(){
        int workTime=0;
        workTime = 2021-hireYear;
        double incSalary = 0;

        if ((workTime>9)&&(workTime<20)){

            //setSalary(salary=salary+(salary*0.10));
            incSalary=salary*0.10;

        }
        if(workTime<10){

            //setSalary(salary=salary+(salary*0.05));
            incSalary=0.05;
        }
        if(workTime>19){
            //setSalary(salary=salary+(salary*0.15));
            incSalary=salary*0.15;



        }
        System.out.println(this.name+" kişisi "+workTime+" yıl çalışmış ve  maaş artışı = "+incSalary);
        sumsalary2+=incSalary;
    }

    void bonus ()
    {
        int addtime=0;


        if (this.workHours<=40)
        {
            System.out.println("40 saatten az çalışmışsınız");


        }
        if(this.workHours>40)
        {
            addtime=workHours-40;
            workHours=addtime*30;
            System.out.println(this.name+" kişisinin bonus miktarı= "+workHours);
            sumsalary+=workHours;
        }
    }
    void print()
    {

        sumsalary+=salary;
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+ sumsalary);
        sumsalary2+=sumsalary;
        System.out.println("Toplam maaş= "+sumsalary2);
    }
void tax (){
    double tax=0;
    if (this.salary>1000)
    {
        tax= (double) (salary*0.03);
        System.out.println(this.name+" kişisinin vergi miktarı= "+tax);
        sumsalary-=tax;



    }
    else {
        System.out.println("Kesinti olmamıştır");

    }


}

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
