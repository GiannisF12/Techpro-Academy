import java.time.LocalDate;
import java.util.Arrays;

public class Hr {
    
    //Array to store Employee objects
    private Employee[] employees;
    private int index = 0;

    public Hr(int size){
        this.employees = new Employee[size];
    }

    public void hire(Employee e){
        if(index > employees.length){
            System.out.println("No more budget");
        } else {
            employees[index] = e;
            index++;
        }
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

    //sort the array based on compareTo method - Employee class
    public void sort(){
        Arrays.sort(employees);
    }

    public void print(){
        for(Employee temp:employees){
            temp.print();
            System.out.println();
        }
    }

}
