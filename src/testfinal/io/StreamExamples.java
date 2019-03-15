package testfinal.io;

import java.io.*;

public class StreamExamples {

    public static class System {
        public static BufferedReader in;
        public static BufferedWriter out;
    }

    public static void main(String[] args) throws IOException {

        File inputfile = new File("input.txt");
        File outputfile = new File("output.txt");
        try (FileReader fileReader = new FileReader(inputfile);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(outputfile);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);) {
            System.in = bufferedReader;
            System.out = bufferedWriter;

            String s = null;
            while ((s = System.in.readLine()) != null) {
                System.out.write(s);
                System.out.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}
