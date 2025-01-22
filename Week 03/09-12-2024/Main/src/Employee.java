

import java.time.LocalDate;

public abstract class Employee implements Comparable<Employee> {
    private static int nextId = 1;

    protected String name;
    protected LocalDate hireDate;
    protected LocalDate fireDate;
    protected int id;
    protected boolean active;

    //Constructor
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
        System.out.println("Employee: " + this.name + " ID: " + this.id);
        System.out.println("Hire Date: " + this.hireDate);
    }

    // compareTo based on name and id
    public int compareTo(Employee e) {
        //compare names
        int result = this.name.compareTo(e.getName());
        //if equal compare ids
        if (result == 0) {
            return this.id - e.getId();
        }
        return result;
    }
}
