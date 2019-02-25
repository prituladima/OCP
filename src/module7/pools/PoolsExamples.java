package module7.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class PoolsExamples {
    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service1 = Executors.newCachedThreadPool();
        ExecutorService service2 = Executors.newFixedThreadPool(10);

        ScheduledExecutorService scheduledService1 = Executors.newSingleThreadScheduledExecutor();

        ScheduledExecutorService scheduledService3 = Executors.newScheduledThreadPool(10);



    }
}
