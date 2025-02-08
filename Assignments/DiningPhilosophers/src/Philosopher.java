import java.util.concurrent.Semaphore;

public class Philosopher implements Runnable{


    private final Semaphore leftFork;
    private final Semaphore rightFork;
    private final Semaphore max = new Semaphore(4);
    private final boolean isLastPhilosopher;

    public Philosopher(Semaphore leftFork, Semaphore rightFork, boolean isLastPhilosopher) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.isLastPhilosopher = isLastPhilosopher;
    }


    private void doAction(String action) throws InterruptedException {
        System.out.println(
          Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }

    @Override
    public void run() {
        try {
            while(true){
                doAction("Thinking..");

                max.acquire();
                if(isLastPhilosopher){
                    rightFork.acquire();
                    doAction("picked up right fork.");

                    leftFork.acquire();
                    doAction("picked up left fork - Eating.");
                } else {
                    leftFork.acquire();
                    doAction("picked up left fork.");

                    rightFork.acquire();
                    doAction("picked up right fork - Eating.");
                }

                doAction("is eating...");
                Thread.sleep(((int) (Math.random() * 100)));

                rightFork.release();
                doAction("put down right fork.");

                leftFork.release();
                doAction("put down left fork.");

                // Allow another philosopher to eat
                max.release();

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
