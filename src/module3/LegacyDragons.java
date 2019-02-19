package module3;

import java.util.ArrayList;
import java.util.List;

public class LegacyDragons {

    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        printDragons(unicorns);
    }

    //if pass raw type like List to m(List<Any> )it will work

    private static void printDragons(List<Dragon> dragons) {//will compile and run with no exception
        for (Dragon dragon : dragons) { // ClassCastException
            System.out.println(dragon);
        }
    }

    static class Dragon {
    }

    static class Unicorn {
    }

}
