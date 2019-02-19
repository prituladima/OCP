package module3;

import java.util.ArrayList;
import java.util.List;

import static module3.LegacyDragons.*;

public class LegacyUnicorns {
    public static void main(String[] args) {
        List<Unicorn> unicorns = new ArrayList<>();
        addUnicorn(unicorns);
        Unicorn unicorn = unicorns.get(0); // ClassCastException
    }

    private static void addUnicorn(List unicorn) {
        unicorn.add(new Dragon());//COMPILING WARNING AS WELL
    }
}
