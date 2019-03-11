package module8;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NoSuchfileExceptionTest {

    public static void main(String[] args) {
        Path myfile = Paths.get("test.txt");
        try (BufferedReader bfr = Files.newBufferedReader(myfile, Charset.forName("US-ASCII"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Error | Exception e) {
//            e = null;
            System.out.println(e);
//            java.nio.file.NoSuchFileException: test.txt
        }
    }

}
