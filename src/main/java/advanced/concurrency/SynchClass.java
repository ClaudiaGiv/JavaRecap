package advanced.concurrency;

public class SynchClass implements Runnable {
    int count = 0;

     void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        String currentName = Thread.currentThread().getName();
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread: " + currentName + ", count = " + this.count);
            this.increment();
        }
    }
}
