package threads.concurrency;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class ATM {
    private boolean[] freeATMs;
    private Semaphore semaphore;

    public ATM(){
        freeATMs = new boolean[2];
        Arrays.fill(freeATMs, true);
        semaphore = new Semaphore(2);
    }

    public void withdrawMoney() {
        try {
            // Try to acquire a semaphore.
            // If none are available, thread will block here
            // till a semaphore becomes available
            semaphore.acquire();
             // Check for available ATM machine
            int atmMachine = getAvailableATM();

            System.out.println(Thread.currentThread().getName()
            + ":-Withdrawing money from ATM number :-"+atmMachine);

            System.out.println("--------------------------------");

            Thread.sleep((long)(Math.random() * 1000));
            
            System.out.println(Thread.currentThread().getName()
            + ":-done withdrawing money");
            releaseATM(atmMachine);
            System.out.printf("ATM machine : - %s is now available\n", atmMachine);

            System.out.println("--------------------------------");
            semaphore.release();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void releaseATM(int atmNumber){
        // We are making specific atm machine free for use
        synchronized(freeATMs){
            freeATMs[atmNumber]=true;
        }
        
    }

    private int getAvailableATM() {
        int freeAtm = -1;

        // We are using synchronized to ensure that only 1
        // thread can access and modify the shared boolean
        // array freeAtms
        synchronized(freeATMs){
            for(int i =0; i<freeATMs.length;i++){
                if(freeATMs[i]){
                    freeATMs[i] = false;
                    freeAtm = i;
                    break;
                }
            }
        }

        return freeAtm;
    }
}
