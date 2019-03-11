package module8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

    public static void main(String[] args) throws IOException {
        //Correct pipeline
        File f = new File("");
        FileReader x1 = new FileReader(f);//BufferedFileReader
        BufferedReader x2 = new BufferedReader(x1);

        String x3 = x2.readLine();

        while (x3 != null) {
            System.out.println(x3);
            x3 = x2.readLine();
        }


    }
}
