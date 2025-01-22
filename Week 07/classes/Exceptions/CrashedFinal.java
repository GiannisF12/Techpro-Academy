package Exceptions;
import java.util.HashMap;
import java.util.Map;
import HR.*;
public class CrashedFinal {
    public static void main(String[] args) {
       Employee temp = new Permanent("Nasos");
       System.out.println(temp.getNextId());
    //region Temp
        Employee X = new Permanent("test");
        System.out.println(X.getNextId());
        X = null;
        System.gc();
        System.runFinalization();
    //endregion
    System.out.println(temp.getNextId());
        // rest of the code
    }

}
