package HR;

public class Permanent extends Employee{
    public static final double DEFAULT_SALARY = 2000;
    public double salary;
    private static double tax = 0.35;

    public Permanent(){
        this(DEFAULT_NAME,DEFAULT_SALARY);
    }
    public Permanent(String name){
        this(name, DEFAULT_SALARY);
    }
    public Permanent(double salary){
        this(DEFAULT_NAME,salary);
    }
    public Permanent(String name, double salary){
        //call the constructor of Employee
        super(name);
        System.out.println(name);
        this.salary = salary;
    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPay(){
        return this.salary - getTaxes();
    }

    public double getTaxes(){
        return this.salary*tax;
    }

  
    
    public void print(){
        System.out.println("This is a permanent employee");
       
    }
}
