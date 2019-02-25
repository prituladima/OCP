package module7;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledFixedRateAndDelayExample {
    public static void main(String[] args) {

        ScheduledExecutorService service = null;
        try{
            service = Executors.newSingleThreadScheduledExecutor();

            Runnable runnable = () -> System.out.println("-");

            service.scheduleAtFixedRate(runnable, 0, 1000L, TimeUnit.SECONDS);//DANGEROUS
            service.scheduleWithFixedDelay(runnable, 0, 1000L, TimeUnit.SECONDS);

        }finally {
            if (service!=null) {
                service.shutdown();
            }
        }


    }
}
