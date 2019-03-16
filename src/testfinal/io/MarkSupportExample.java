package testfinal.io;

import java.io.*;

public class MarkSupportExample {

    public static void main(String[] args) throws IOException {

        File inputfile = new File("input.txt");
        File outputfile = new File("output.txt");


//        ABCBCD if supported
//        ABCD if not supported
        try (InputStream is =
                     new BufferedInputStream(
                new FileInputStream(inputfile)
        )
        ) {
            // TODO: 3/15/2019 472
            System.out.print ((char)is.read());
            if(is.markSupported()) {
                is.mark(0);
                System.out.print((char)is.read());

                System.out.print((char)is.read());
                is.reset();
            }
            System.out.print((char)is.read());
            System.out.print((char)is.read());
            System.out.print((char)is.read());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
