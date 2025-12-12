public class SalesPerson extends Employee{
    double commission;

    public SalesPerson(String name, int id, double baseSalary, double commission) {
        super(name, id, baseSalary);
        this.commission = commission;
    }


    public double calculateSalary() {
        return getBaseSalary() + commission;
    }
}
