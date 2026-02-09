import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeManagement {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Print Employees");
            System.out.println("3. Remove Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    printEmployees();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addEmployee() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        employees.add(new Employee(name, id, salary));
        System.out.println("Employee added successfully.");
    }

    private static void printEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        System.out.println("\nEmployee Details:");
        System.out.println("ID\tName\tSalary");
        for (Employee emp : employees) {
            System.out.println(emp.getId() + "\t" + emp.getName() + "\t" + emp.getSalary());
        }
    }

    private static void removeEmployee() {
        if (employees.isEmpty()) {
            System.out.println("No employees to remove.");
            return;
        }
        System.out.print("Enter employee ID to remove: ");
        int idToRemove = scanner.nextInt();
        boolean removed = false;
        for (Employee emp : employees) {
            if (emp.getId() == idToRemove) {
                employees.remove(emp);
                System.out.println("Employee with ID " + idToRemove + " removed successfully.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Employee with ID " + idToRemove + " not found.");
        }
    }
}
