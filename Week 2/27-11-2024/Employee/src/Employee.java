import java.time.LocalDate;

public abstract class Employee {
    private static int nextId = 1;

    protected String name;
    protected LocalDate hireDate;
    protected LocalDate fireDate;
    protected int id;
    protected boolean active;

    //constructor
    public Employee(String name) {
        this.name = name;
        hireDate = LocalDate.now();
        this.id = nextId++;
        this.active = true;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public LocalDate getFireDate() {
        return fireDate;
    }
    public boolean isActive() {
        return active;
    }

    public void fire() {
        this.fireDate = LocalDate.now();
        active = false;
    }

    public abstract double getPay();
    public abstract double getTaxes();

    public void print() {
        System.out.println("Employee: "+this.name+"ID: "+this.id);
        System.out.println("Hire Date: "+this.hireDate);
    }
}
