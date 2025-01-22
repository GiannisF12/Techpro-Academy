package wildcards;

public class Permanent  extends Employee{
    public static final double DEFAULT_SALARY = 120000;
    private double salary = DEFAULT_SALARY;

    public Permanent(String name){
        this(name, DEFAULT_SALARY);
        
    }

    public Permanent(String name, double salary){
        super(name);
        this.salary= salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return String.format("Permanent { name=%s salary=%s} %s", getName(), salary, super.toString());
    }

}
