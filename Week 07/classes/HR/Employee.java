package HR;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;

public abstract class Employee implements Comparable<Employee>, Comparator<Employee>{
    public static final String DEFAULT_NAME = "UNKNOWN";
    private static Integer nextId=1;

    protected String name;
    protected LocalDate hireDate;
    protected LocalDate fireDate;
    protected Integer id;
    protected boolean active;
    //Constructor
    public Employee(String name){
        this.name=name;
        name = name + " Changed";
        System.out.println(name);
        hireDate = LocalDate.now();
        this.id = nextId++;
        this.active = true;
    }

    public Employee(){
        this(DEFAULT_NAME);
    }

    public Integer getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public LocalDate getHireDate(){
        return hireDate;
    }

    public LocalDate getFireDate(){
        return fireDate;
    }

    public boolean isActive(){
        return active;
    }

    public void fire(){
        this.fireDate = LocalDate.now();
        active = false;
    }

    public abstract double getPay();
    public abstract double getTaxes();

    public void print(){
        System.out.println("Employee: "+this.name+" ID: "+this.id);
        System.out.println("Hire Date: "+this.hireDate);
    }

    
    @Override
    public String toString(){
        String result = "Employee{id="+id+", name="+name+", hireDate="+hireDate+"}";
        return result;
        // return String.format("Employee{id=%d, name='%s', hireDate=%s}", id,name,hireDate);
    }

    // compareTo based on name and id
    @Override
    public int compareTo(Employee e){
        try {
            //compare names
            int result = 0;
            try {
                result =  this.name.compareTo(e.getName());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            //if equal compare ids
            if(result == 0){
                return this.id - e.getId();
            } 
            return result;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return ex.hashCode();
        }
        
    }
    
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getName().compareTo(e2.getName());
    }

    protected void finalize(){
        --nextId;
    }
    public int getNextId(){
        return nextId;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if(!(o instanceof Employee)) return false;
        
        Employee employee = (Employee) o;

        if (this.id != null ? !this.id.equals(employee.getId()) : employee.getId() !=null) return false;
        if (this.name !=null ? !this.name.equals(employee.getName()) : employee.getName() !=null) return false;
        return hireDate != null ? hireDate.equals(employee.getHireDate()) : employee.getHireDate() == null;
    }
    
    @Override
    public int hashCode(){
        int result = id != null? id.hashCode() : 0;
        result = 31 * result + (name != null? name.hashCode() : 0);
        result = 31 * result + (hireDate !=null ? hireDate.hashCode() :0 );
        return result;
    }

}
