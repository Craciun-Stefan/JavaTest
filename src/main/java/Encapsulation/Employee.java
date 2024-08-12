package Encapsulation;

public class Employee {
    // Create Employee ID and Salary in the Encapsulation.Employee class
    // Using Encapsulation, give values to Employee ID and Salary in a different class (ExEncaps), then print those new values
    private String ID;
    private double Salary;
    public Employee(String ID, double Salary) {
        this.ID = ID;
        this.Salary = Salary;
    }
    public String getID() {
        return ID;
    }
    public double getSalary() {
        return Salary;
    }

}
