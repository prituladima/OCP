package module1.review1;

public class Browsers {
    static class Browser {
        public int x = 1;
        public void go() {
            System.out.println("Inside Browser");
        }
    }

    static class Firefox extends Browser {
        public int x = 2;
        public void go() {
            System.out.println("Inside Firefox");
        }
    }

    static class IE extends Browser {

        public int x = 3;
        @Override
        public void go() {
            System.out.println("Inside IE");
        }
    }

//    While method inheritance Java uses the most concrete method.
//    While field inheritance Java uses reference type.


    public static void main(String[] args) {
        Browser b = new Firefox();
//        b = (Browser) b;
        ((Browser)b).go();
        System.out.println(((Firefox) b).x);
    }
}