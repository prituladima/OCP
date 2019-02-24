package module6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithResourcesExample {
    public static void main(String[] args) throws Exception {
        try (AutoCloseable a = new MyDangAutoClocable();//CLOSABLE IS ALSO ALLOWED
             AutoCloseable b = new MyAutoClocable()) {
            throw new NullPointerException();//exception from close has less priority than this
        } catch (NullPointerException n) {
            System.out.println(n);
            for (Throwable throwable : n.getSuppressed()) {//suppressed exception
                System.out.println(throwable);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("My finally");
        }
    }



    //RECOMMENDED NOT TO THROW ANYTHING
    //AND DO CLOSE IDEMPOTENT
    //WHY AUTOCLOSEBLEWAS MADE WITH EXCEPTION???
    private static class MyAutoClocable implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Closing " + MyAutoClocable.class.getSimpleName());
        }
    }

    private static class MyDangAutoClocable implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("Closing and Throwign" + MyDangAutoClocable.class.getSimpleName());
            throw new RuntimeException();
        }
    }


    public void oldApproach(Path path1, Path path2) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {//resource management off
            in = Files.newBufferedReader(path1);
            out = Files.newBufferedWriter(path2);
            out.write(in.readLine());
        } finally {
            if (in != null) in.close();
            if (out != null) out.close();
        }
    }

    public void newApproach(Path path1, Path path2) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(path1);
             BufferedWriter out = Files.newBufferedWriter(path2)) {
            out.write(in.readLine());
        }
    }
}
