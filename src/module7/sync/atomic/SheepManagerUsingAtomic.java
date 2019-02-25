package module7.sync.atomic;

import module7.sync.SheepManager;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerUsingAtomic {

    private AtomicInteger sheepCount = new AtomicInteger();
    private AtomicInteger MAX = new AtomicInteger();

    private void incrementAndReport() {
//        System.out.print((sheepCount.incrementAndGet()) + " ");
        //Max using Atomic
        System.out.println(MAX.accumulateAndGet(sheepCount.incrementAndGet(), Integer::max));
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            SheepManagerUsingAtomic manager = new SheepManagerUsingAtomic();
            for (int i = 0; i < 1000_000; i++)
                service.submit(manager::incrementAndReport);
        } finally {
            if (service != null) service.shutdown();
        }
    }

}
