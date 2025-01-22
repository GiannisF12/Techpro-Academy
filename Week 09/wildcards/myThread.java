package wildcards;

public class myThread extends Thread{

    @Override
    public void run(){
        Thread.currentThread().setName("myThread");
        System.out.println(Thread.currentThread().getName()+" is running");
    }

}
