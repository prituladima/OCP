package module2;

import java.io.IOException;

public class Interfaces {

    private static interface A{
        abstract void a();
        default void b(){}
    }

    private static interface B{
        void a() throws IOException;
//        default void b(){}//WILL NOT COMPILE
    }

    @FunctionalInterface
    private static interface Z{
        void a();
//        void b();WILL NOT COMPILE
    }

    private static class C implements A, B{
        @Override
        public void a() {

        }
    }

    public static void main(String[] args) {

    }

}
