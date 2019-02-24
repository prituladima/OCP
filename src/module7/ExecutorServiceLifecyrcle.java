package module7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class ExecutorServiceLifecyrcle {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(() -> System.out.println("---"));

        System.out.println("isShutdown - " + service.isShutdown());
        System.out.println("isTerminated - " + service.isTerminated());

        service.shutdown();

        System.out.println("isShutdown - " + service.isShutdown());
        System.out.println("isTerminated - " + service.isTerminated());

        try {
            service.submit(() -> System.out.println("---"));
        } catch (RejectedExecutionException e) {
            System.err.println(e);
        }

        System.out.println("isShutdown - " + service.isShutdown());
        System.out.println("isTerminated - " + service.isTerminated());


    }
}
