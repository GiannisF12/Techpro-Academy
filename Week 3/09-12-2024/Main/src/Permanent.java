
public class Permanent extends Employee{
    private double salary;
    private static double tax = 0.35;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Permanent(String name, double salary){
        //call the constructor of Employee
        super(name);
        this.salary = salary;
    }

    public double getPay(){
        return this.salary - getTaxes();
    }

    public double getTaxes(){
        return this.salary*tax;
    }
}
