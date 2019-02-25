package module7;

import java.util.concurrent.*;

public class ScheduledExecutorServiceExampe {
    public static void main(String[] args) {

        ScheduledExecutorService service = null;
        try {
            service = Executors.newSingleThreadScheduledExecutor();
            Runnable task1 = () -> System.out.println("Hello Zoo");
            Callable<String> task2 = () -> {
                System.out.println("Hello Zoo");
                return "Monkey";
            };

            ScheduledFuture<?> future
                    = service.schedule(task1, 2, TimeUnit.SECONDS);
            ScheduledFuture<String> future2
                    = service.schedule(task2, 1, TimeUnit.SECONDS);

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }

    }
}
