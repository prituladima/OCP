package test5;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path p1 = Paths.get("\\photos\\vacation");
        Path p2 = Paths.get("\\yellowstone");
        System.out.println(p1.resolve(p2) + "  " + p1.relativize(p2));

        new Object() {
            @Override
            protected Object clone() {
                throw new NullPointerException();
            }
        };
    }
}
