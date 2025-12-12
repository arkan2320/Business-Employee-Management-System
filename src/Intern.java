public class Intern extends Employee{

    public Intern(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    public double calculateSalary() {
        return getBaseSalary() + 3000;
    }
}
