package threads.concurrency;

public class WithdrawMoney implements Runnable{
    private ATM atmQueue;

    public WithdrawMoney(ATM atmQueue){
        this.atmQueue= atmQueue;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + 
        ": - about to withdraw money after acquiring the permit");

        atmQueue.withdrawMoney();
    }
}
