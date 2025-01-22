package threads.concurrency;

public class Main {
    public static void main(String[] args) {
        ATM atmQueue = new ATM();

        Thread thread[] = new Thread[11];

        for(int i = 0; i<11;i++){
            thread[i] = new Thread(new WithdrawMoney(atmQueue), "Thread "+i);
        }

        for(int i = 0; i<11;i++){
            thread[i].start();
        }
    }
}
