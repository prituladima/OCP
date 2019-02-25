package module7;

import java.util.concurrent.*;

public class CheckResults2 {

    private static int counter = 0;

    public static void main(String[] args) {

        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> future = service.submit(() -> {
                //for (int i = 0; i < Integer.MAX_VALUE; i++) counter++;

                Thread.sleep(20_000L);
                return "";
            });
            future.get(10, TimeUnit.SECONDS);
            System.out.println("REACHED");
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }


    }

}
