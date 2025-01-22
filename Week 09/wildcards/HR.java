package wildcards;

import java.util.List;
import java.util.function.Predicate;

public class HR {

    public static void printEmpNames(List<? extends Employee> employees){
        employees.parallelStream()
            .map(Employee::getName)
            .forEach(System.out::println);
    }

    public static void printAllFiltered(
            List<? extends Employee> employees, Predicate<? super Employee> predicate){
                for(Employee e:employees){
                    if(predicate.test(e)){
                        System.out.println(e.getName());
                    }
                }
    }

}
