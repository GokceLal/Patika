package StatikExample;

public class Runner {
    public static void main(String[] args) {
Course course = new Course("Mat","Mat276",45);
        Avarage avarage = new Avarage(67,56,98);

        System.out.println(course);
        System.out.println(avarage.toString());
    }
}
