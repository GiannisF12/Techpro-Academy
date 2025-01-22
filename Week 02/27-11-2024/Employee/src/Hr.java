public class Hr {
    private Employee[] employees;

    public Hr(int size) {
        this.employees = new Employee[size];
    }

    public void hire(Employee e) {
        if(index > employees.length) {
            System.out.println("no more budget");
        }
        else {
            employees[index] = e;
            index++;
        }
    }
    public Employee findById(int id) {
        for(Employee temp: employees) {
            if(temp.getId() == id) {
                return temp;
            }
        }
    }
}
