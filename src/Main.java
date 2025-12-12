import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\nCompany System Menu");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View Total Payroll");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Select Type: 1. Manager | 2. SalesPerson | 3. Intern");
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter ID: ");
                int id = scanner.nextInt();

                System.out.print("Enter Base Salary: ");
                double baseSalary = scanner.nextDouble();

                if (type == 1) {
                    System.out.print("Enter Bonus: ");
                    double bonus = scanner.nextDouble();
                    employees.add(new Manger(name, id, baseSalary, bonus));
                } else if (type == 2) {
                    System.out.print("Enter Commission: ");
                    double commission = scanner.nextDouble();
                    employees.add(new SalesPerson(name, id, baseSalary, commission));
                } else if (type == 3) {
                    employees.add(new Intern(name, id, baseSalary));
                } else {
                    System.out.println("Invalid type selected.");
                }
                System.out.println("Employee added successfully.");

            } else if (choice == 2) {
                if (employees.isEmpty()) {
                    System.out.println("No employees found.");
                } else {
                    for (Employee emp : employees) {
                        emp.displayEmployeeInfo();

                        if (emp instanceof Manger) {
                            System.out.println("Role: Project Manager");
                        } else if (emp instanceof SalesPerson) {
                            System.out.println("Role: Sales Person");
                        } else if (emp instanceof Intern) {
                            System.out.println("Role: Intern");
                        }

                        System.out.println("Total Employees Count: " + Employee.getEmployeeCount());
                        System.out.println("-------------------------");
                    }
                }

            } else if (choice == 3) {
                double totalPayroll = 0;
                for (Employee emp : employees) {
                    totalPayroll += emp.calculateSalary();
                }
                System.out.println("Total Employees Created: " + Employee.getEmployeeCount());
                System.out.println("Total Monthly Payroll: " + totalPayroll);

            } else if (choice == 4) {
                System.out.println("Exiting System.");
                break;
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
        scanner.close();
    }
}