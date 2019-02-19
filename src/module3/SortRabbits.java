package module3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortRabbits {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
//        Collections.sort(rabbits); // DOES NOT COMPILE
    }
}
