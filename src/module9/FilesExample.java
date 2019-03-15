package module9;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
    public static void main(String[] args) {

        Path path1 = Paths.get("pandas","cuddly.png");
        Path path2 = Paths.get("c:","zooinfo","November","employees.txt");
        Path path3 = Paths.get("/","home","zoodirector");

    }
}
