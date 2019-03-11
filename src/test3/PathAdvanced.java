package test3;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAdvanced {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\temp\\.\\test.txt");
        Path p2 = Paths.get("c:\\report.pdf");

        //if other path is absolute -> return it
        //not p1 + p2
        System.out.println(p1.resolve(p2));
        System.out.println(p1.resolveSibling(p2));


        //must be the same type both relative or both absolute
        System.out.println(p1.relativize(p2));

        System.out.println(p1.normalize());

        System.out.println(p1.subpath(0, 2));

    }
}
