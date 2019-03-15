package testfinal.io;

import java.io.File;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileApiExample {
    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        System.out.println(outputFile.exists());

        System.out.println(outputFile.getName());

        System.out.println(outputFile.getAbsolutePath());

        System.out.println(Paths.get(outputFile.getAbsolutePath()));

        System.out.println(outputFile.isDirectory());
        System.out.println(outputFile.isFile());
        System.out.println(outputFile.length());
        System.out.println(outputFile.lastModified());
        System.out.println(outputFile.delete());
        System.out.println(outputFile.renameTo(outputFile));

//        System.out.println(outputFile.mkdir());
//        System.out.println(outputFile.mkdirs());

        System.out.println(Arrays.toString(outputFile.listFiles()));

    }

    // TODO: 3/15/2019 USE THIS APPROACH IN CODEFORCES CONTESTS
    private static class System {
        public static PrintStream out = java.lang.System.out;
        public static InputStream in = java.lang.System.in;
    }
}