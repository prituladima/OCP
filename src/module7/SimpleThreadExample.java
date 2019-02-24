package module7;

public class SimpleThreadExample {

    public static void main(String[] args) {

        //round-robin schedule
        //context switch

        boolean b = Thread.MIN_PRIORITY == 1;
        boolean b1 = Thread.NORM_PRIORITY == 5;
        boolean b2 = Thread.MAX_PRIORITY == 10;

        Runnable runnable1 = () -> System.out.println("Hello world!");
        Runnable runnable2 = () -> {int i = 0;i++;};
        Runnable runnable3 = () -> {return;};
        Runnable runnable4 = () -> {};//will compile
//        Runnable runnable5 = () -> 5;//will not compile
//        Runnable runnable6 = () -> "";//will not compile
//        Runnable runnable7 = () -> {return new Object();};//will not compile




    }

}
