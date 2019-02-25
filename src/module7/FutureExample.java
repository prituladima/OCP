package module7;

import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService service = null;
        Callable<String> runnable = null;
        try {
            service = Executors.newSingleThreadExecutor();
            runnable = () -> {
                Thread.sleep(5000);
                return "Result from future";
            };
            Future<String> future = service.submit(runnable);
//        future.cancel(true);
//        future.cancel(true);
            //            while (!future.isDone()) {

//            }
            System.out.println(future.get());

        } finally {
            if (service != null)
                service.shutdown();
        }


    }

}
