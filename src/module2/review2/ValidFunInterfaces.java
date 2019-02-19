package module2.review2;

import java.nio.file.DirectoryStream;
import java.util.function.*;

public class ValidFunInterfaces {
    public static void main(String[] args) {

        Function<Climb, Integer> climb = Climb::climb;
        Climb climb1 = ()->10;
        Swim swim = (int a,  double b) -> null;
        Function<MountainClimb, Integer> climb3 = MountainClimb::climb;
//        Object swim2 = Swim::swim;//COMPILE TIME ERROR

        BiPredicate<MyPredicate, Number> test = MyPredicate::test;
        Predicate<MyPredicate> myPredicateFilter = (MyPredicate p) -> false;

    }

    private boolean bi(BiPredicate<MyPredicate, Number> biPredicate){
return true;
    }

    private void b(Function<Climb, Integer> climb){
        climb.apply(() -> 0);
    }

    public interface MyPredicate{
        boolean test(Number n);
    }

    public interface Climb {
        int climb();
    }

    public interface Swim {
        Object swim(int a, double b);
    }

    public interface ArcticMountainClimb extends MountainClimb {
//        public default int getSpeed();
    }

    public interface MountainClimb extends Climb {
    }


}
