package test2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:\\temp\\test.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
//        bfw.writeUTF("hello");  //1
        bfw.newLine();  //2
        bfw.write("world");  //3
    }
}
