abstract class Employee {

    // Private fields (Encapsulation)
    private int employeeId;
    private String employeeName;

    // Getter and Setter methods
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Abstract method (Abstraction)
    abstract double calculateSalary();

    // Concrete method
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

// Subclass FullTimeEmployee
class FullTimeEmployee extends Employee {

    private double monthlySalary;

    // Getter and Setter
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Implement abstract method
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass PartTimeEmployee
class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double hourlyRate;

    // Getters and Setters
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // Implement abstract method
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
public class EmployeePayrollSystem {
    public static void main(String[] args) {
         FullTimeEmployee emp1 = new FullTimeEmployee();
        emp1.setEmployeeId(101);
        emp1.setEmployeeName("Astha");
        emp1.setMonthlySalary(50000);

        System.out.println("Full Time Employee Details:");
        emp1.displayEmployeeInfo();
        System.out.println("Salary: " + emp1.calculateSalary());

        System.out.println();
        PartTimeEmployee emp2 = new PartTimeEmployee();
        emp2.setEmployeeId(102);
        emp2.setEmployeeName("Rahul");
        emp2.setHoursWorked(80);
        emp2.setHourlyRate(500);

        System.out.println("Part Time Employee Details:");
        emp2.displayEmployeeInfo();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
