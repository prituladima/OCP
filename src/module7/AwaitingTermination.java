package module7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitingTermination {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            for (int i = 0; i < 200; i++) {
                service.submit(() -> System.out.print("-"));
            }


        } finally {
            if (service != null) service.shutdown();
        }

        if (service != null) {
            service.awaitTermination(1, TimeUnit.MINUTES);
            System.out.println();
            if (service.isTerminated()) {
                System.out.println("All tasks finished!!!");
            } else {
                System.out.println("At least one task is still running");
            }
        }


    }

}
