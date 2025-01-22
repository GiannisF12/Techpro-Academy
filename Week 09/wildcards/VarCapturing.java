package wildcards;

import java.util.List;

interface MyInterface{
    void myFunction(List<Integer> ls);
}

public class VarCapturing {

    static int  data =170;
    public static void main(String[] args) {
        
        String n="temp";
        
        MyInterface intface = (List<Integer> ls) ->
            {
                System.out.println("Data :" +data);
                data +=500;
                System.out.println("Data :" +data);
                System.out.println("Variable n :"+n);
                System.out.println("Variable n :"+n+" Hello");
                //n = "new";
            };

            Runnable myThread = () -> {
                Thread.currentThread().setName("myThread");
                System.out.println(Thread.currentThread().getName()+" is running");
            }; 
            
            Thread run = new Thread(myThread);
            run.start();
           
            //Seperate class approach

            // myThread run = new myThread();
            // run.start();


            intface.myFunction(null);

    }



}
