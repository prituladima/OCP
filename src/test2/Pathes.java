package test2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathes {

    public static void main(String[] args) {
        Path p1 = Paths.get("/photos/goa");
        Path p2 = Paths.get("/index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);

        p1 = Paths.get("photos/goa");
        p2 = Paths.get("index.html");
        p3 = p1.relativize(p2);
        System.out.println(p3);

        p1 = Paths.get("/photos/goa");
        p2 = Paths.get("index.html");
        p3 = p1.relativize(p2);
        System.out.println(p3);
    }

}
