import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) throws Exception {
        Philosopher[] philosophers = new Philosopher[5];
        Semaphore[] forks = new Semaphore[philosophers.length];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Semaphore(1);
        }

        for (int i = 0; i < philosophers.length; i++) {
            Semaphore leftFork = forks[i];
            Semaphore rightFork = forks[(i + 1) % forks.length];

            boolean isLastPhilosopher = (i == 5 - 1);
            philosophers[i] = new Philosopher(leftFork, rightFork,isLastPhilosopher);
            
            Thread t 
              = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}
