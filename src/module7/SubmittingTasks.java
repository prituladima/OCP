package module7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class SubmittingTasks {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Runnable runnable = () -> System.out.println("0");
        Callable<String> callable = () -> "Res";

        service.execute(runnable);//NON BLOCKING
        Future<?> submit = service.submit(runnable);//NON BLOCKING
        Future<String> submit1 = service.submit(callable);//NON BLOCKING

        List<Future<String>> futures = service.invokeAll(Arrays.asList(callable));//BLOCKING
        String futures2 = service.invokeAny(Arrays.asList(callable));//BLOCKING


        service.shutdown();
    }

}
