import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private LocalDate hireDate;
    private String companyName;
    private double salary;

    public Employee(String firstName, String lastName, int birthdayYear, LocalDate hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public String getCompanyName() {
        return companyName;
    }
}
