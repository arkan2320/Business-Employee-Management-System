public  abstract class Employee {

    private String name;
    private int id;
    private double baseSalary;
    private static int employeeCount = 0;

    public static int getEmployeeCount() {
        return employeeCount;
    }



    public Employee() {
    }

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        employeeCount++;


    }
    public String getName() {
        return name;
    }
    public String SetName(String name) {
        return this.name = name;
    }
    public int getId() {
        return id;
    }
    public int SetId(int id) {
        return this.id = id;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double SetBaseSalary(double baseSalary) {
        return this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }

}
