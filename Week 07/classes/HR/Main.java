package HR;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        System.out.println();
        
        // Hr myHr = new Hr();
        // myHr.hire( new Contractor("nasos", 100, 40) );
        // myHr.hire( new Contractor("Stella", 100, 40) );
        // myHr.hire( new Contractor("George", 100, 40) );
        // myHr.hire( new Contractor("Nikos", 100, 40) );
        // myHr.hire( new Contractor("Giannis", 100, 40) );
        // System.out.println();
        // myHr.print();

        Employee employee1 = new Contractor("nasos", 100, 40);
        Employee employee2 = new Permanent("nasos", 10000);
        // if (employee1.equals(employee2)){
        //     System.out.println("Same employee");
        // } else {
        //     System.out.println("Not same");
        // }

        NavigableSet<Employee> treeset = new TreeSet<Employee>();
        treeset.add(employee1);
        treeset.add(employee2);
        
        Iterator<Employee> it = treeset.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }

        Map<Integer, Employee> hmap = new HashMap<Integer, Employee>();
        hmap.put(employee1.hashCode(), employee1);
        hmap.put(employee2.hashCode(), employee2);
        System.out.println(hmap.get(employee1.hashCode()));
        hmap.remove(employee1.hashCode());
        System.out.println(hmap.get(employee1.hashCode()));

        Set<Employee> hash = new HashSet<Employee>();
        hash.add(employee1);
        hash.add(employee2);
        hmap.containsKey(employee1.hashCode());

    }

}
