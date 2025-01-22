package threads;

public class ThreadExample extends Thread{
    private int id;

    public ThreadExample(int id){
        this.id=id;
    }

    @Override
    public void run() {

        for(int i=0; i < 2; i++){
            try{
                Thread.sleep(500);
                System.out.println("Current Thread"+Thread.currentThread().getName());
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
        
        
    }

    @Override
    public String toString(){
        return String.format("MyThread{id = %d}",id);
    }
}
