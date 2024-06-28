import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2010, 5, 15);
        Manager manager = new Manager("John", "Doe", 1990, hireDate, "PJATK", 2000, 100);

        System.out.println("Manager details:");
        System.out.println(manager);
        System.out.println("Manager age: " + manager.getAge());
        System.out.println("Job seniority: " + manager.getJobSeniority() + " years");
        System.out.println("Total salary: " + manager.getSalary());
    }
}
