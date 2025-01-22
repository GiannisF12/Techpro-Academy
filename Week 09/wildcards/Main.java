package wildcards;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Permanent> employees = 
            Arrays.asList(new Permanent("Bart"), new Permanent("Homer"),
                          new Permanent("Lisa"), new Permanent("Maggie"));

        //HR.printEmpNames(employees);

        HR.printAllFiltered(employees,
             e -> e.getName().length() % 2 ==0 );
    }
}
