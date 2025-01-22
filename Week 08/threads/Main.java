package threads;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample(1);
        ThreadExample t2 = new ThreadExample(2);
        ThreadExample t3 = new ThreadExample(3);

        t1.start();

        try{
            System.out.println("Current Thread"+Thread.currentThread().getName());
            t1.join();
        } catch(Exception e) {
            System.out.println(e);
        }

        t2.start();

        try{
            System.out.println("Current Thread"+Thread.currentThread().getName());
            t2.join();
        } catch(Exception e) {
            System.out.println(e);
        }

        t3.start();
        try{
            System.out.println("Current Thread"+Thread.currentThread().getName());
            t3.join();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
