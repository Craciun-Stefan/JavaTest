package Encapsulation;

public class ExEncaps {
    public static void main(String[] args) {
        Employee E1 = new Employee("C038483", 9238.3);
        Employee E2 = new Employee("D8303", 41049.4);
        System.out.println("Empoyee ID is: " + E1.getID());
        System.out.println("Employee salar is: " + E1.getSalary());

        System.out.println("Empoyee ID is: " + E2.getID());
        System.out.println("Employee salar is: " + E2.getSalary());

    }
}
