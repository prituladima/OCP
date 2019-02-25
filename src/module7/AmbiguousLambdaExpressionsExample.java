package module7;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class AmbiguousLambdaExpressionsExample {

    public static void main(String[] args) {
        useCallable(() -> {
            throw new Exception();
        });
//        useSupplier(() -> {throw new Exception();});
        useSupplier(() -> "");

//        use(()->"");//WILL NOT COMPILE DUE TO Ambiguous method call
//        use(null);//the SAME SITUATION
        use((Supplier<?>) null);

    }


    private static void use(Supplier<?> supplier) {

    }

    private static void use(Callable<?> callable) {

    }

    private static void useSupplier(Supplier<?> supplier) {

    }

    private static void useCallable(Callable<?> callable) {

    }


}
