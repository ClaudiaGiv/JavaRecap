package advanced.concurrency;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        SynchClass synchClass = new SynchClass();

//        IntStream.range(0, 10000)
//                .forEach(i -> executor.submit(synchClass::increment));
        ArrayList<Thread> workers = new ArrayList<>();
        for (int i=0; i<100000; i++){
            workers.add(new Thread(synchClass));
        }

        workers.forEach(t -> t.start());
        workers.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
//        Thread worker1 = new Thread(synchClass);
//        Thread worker2 = new Thread(synchClass);
//        worker1.start();
//        worker2.start();
//        worker1.join();
//        worker2.join();

        //executor.shutdown();
        System.out.println(synchClass.getCount());
    }
}
