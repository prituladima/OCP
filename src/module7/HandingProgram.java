package module7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HandingProgram {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(()-> System.out.println("0"));

    }

}
