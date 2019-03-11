package module8;

import java.io.File;

public class IO {
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator"));
        System.out.println(java.io.File.separator);
        File file_ = new File("/home/smith/data/zoo.txt");
        System.out.println(file_.exists());

        File parent = new File("/home/smith");
        File child = new File(parent,"data/zoo.txt");

        File file = new File("C:\\data\\zoo.txt");
        System.out.println("File Exists: "+file.exists());
        if(file.exists()) {
            System.out.println("Absolute Path: "+file.getAbsolutePath());
            System.out.println("Is Directory: "+file.isDirectory());
            System.out.println("Parent Path: "+file.getParent());
            if(file.isFile()) {
                System.out.println("File size: "+file.length());
                System.out.println("File LastModified: "+file.lastModified());
            } else {
                for(File subfile: file.listFiles()) {
                    System.out.println("\t"+subfile.getName());
                }
            }
        }
    }
}
