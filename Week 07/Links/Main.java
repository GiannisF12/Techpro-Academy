package Links;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<String> clicks = new ArrayList<String>();
        for (int i = 0 ; i < 500; i++){
            if(i/2==0){
                clicks.add("Contact us");
            } else if (i/3==0) {
                clicks.add("Services");
            } else {
                clicks.add("Home");
            }
        }

        Map<String, Integer> results = new HashMap<String, Integer>();
        for(String temp : clicks){
            results.put(temp, (results.getOrDefault(temp , 0))+1);
        }

        System.out.println(results);

    }

}
