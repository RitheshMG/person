import java.text.ParseException;

public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) throws ParseException {
        super(name, dob);  // Calling Person's constructor
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        displayPersonDetails();  // Display Person details first
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) throws ParseException {
        Employee emp = new Employee("Alice", "15-08-1990", 101, 75000);
        emp.displayEmployeeDetails();  // Display employee details
    }
}
