import java.time.LocalDate;

public final class Manager extends Employee {
    private double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, LocalDate hireDate, String companyName, double salary, double bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", hireDate=" + getHireDate() +
                ", companyName='" + getCompanyName() + '\'' +
                ", salary=" + getSalary() +
                ", bonus=" + bonus +
                '}';
    }


}
