package test5;

public class OuterClazz {
    public class A {
    }

    public static class B {
    }

    public  void useClasses() {
        new OuterClazz().new A();
        new OuterClazz.B();
        new A();
        new OuterClazz.A();
    }
}
