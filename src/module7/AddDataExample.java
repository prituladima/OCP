package module7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AddDataExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<Integer> future = service.submit(() -> 10 * 50);
            System.out.println(future.get());
        } finally {
            if (service != null)
                service.shutdown();
        }
    }
}
