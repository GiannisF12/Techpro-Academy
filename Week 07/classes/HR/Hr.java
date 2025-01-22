package HR;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Hr {
    
    //Array to store Employee objects
    private List<Employee> employees = new ArrayList<Employee>();
    // private Employee[] employees;

    
    public void hire(Employee e){
        
        if(employees.add(e)) 
            System.out.println("Success");
        else 
            System.out.println("Can't hire");
    }

    public void fire(Employee e){
        employees.remove(e);
    }

    public void iterate(){
        Iterator<Employee> iter = employees.iterator();
        while(iter.hasNext()){
            Employee employee = iter.next();
            employee.setName(employee.getName()+" old");
            System.out.println(employee.toString());
        }

        // for(int i=0; i< employees.size(); i++){
        //     employees.get(i).setName(employees.get(i).getName()+" old");
        // }
    }

    public Employee findEmployee(int id){
        for(Employee temp: employees){
            if(temp.getId() == id)
                return temp;
        }
        return null;
    }

    public Employee findEmployee(String name){
        for(Employee temp: employees){
            if(temp.getName() == name)
                return temp;
        }
        return null;
    }

    public Employee findEmployee(LocalDate hireDate){
        for(Employee temp: employees){
            if(temp.getHireDate() == hireDate)
                return temp;
        }
        return null;
    }



    public void print(){
        // for(Employee temp:employees){
        //     temp.print();
        //     System.out.println();
        // }
        System.out.println(employees);
    }

    public boolean searchByID(Employee employee){
        if(employees.contains(employee))
            return true;
        else 
            return false;
       
    }

    //sort the array based on compareTo method - Employee class
    public void sort(){
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2){
                return e1.getName().compareTo(e2.getName());
            }
        });
    }

}
