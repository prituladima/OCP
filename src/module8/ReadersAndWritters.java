package module8;

import java.io.*;

public class ReadersAndWritters {
    public static void main(String[] args) {
        try (Reader reader = new BufferedReader(new FileReader(""))) {



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
