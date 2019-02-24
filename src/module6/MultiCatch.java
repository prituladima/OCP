package module6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class MultiCatch {

    public static void main(String[] args) {
        if(true) try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (final DateTimeParseException | IOException e) {//will compile
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        if(true) try {
            Path path = Paths.get("dolphinsBorn.txt");
            String text = new String(Files.readAllBytes(path));
            LocalDate date = LocalDate.parse(text);
            System.out.println(date);
        } catch (DateTimeParseException | IOException  e) {//will compile
            e.printStackTrace();
//            e = null;//final by default
            throw new RuntimeException(e);
        }



        if (true) try {

        }
//        catch (NullPointerException | Exception  e){  }will not compile
        finally { }



    }

}
