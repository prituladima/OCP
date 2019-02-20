package module3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchingAndSorting <T>{

//    static <T> T t;

    public static <T> List<T> get(){ //without T will not compile
        System.out.println("ksk");
        return new ArrayList<>();
    }

    private static <T> T get(String a){
        return (T)a.toCharArray();
    }



    public static void main(String[] args) {

        char[] o = SearchingAndSorting.<char[]>get("dksafnsjndf;twoArgs");
        System.out.println(Arrays.toString(o));

        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 5};
        //will find first from the middle

        Arrays.sort(numbers);
        System.out.println(numbers.length);

        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 4));



        A<String, Integer> a = new A<>("sdfas", 5);
        a.n = a.n + a.n;
        System.out.println(a.n);

        List list = new ArrayList();
        System.out.println(a instanceof A);
    }

    static class A<T, N>{
        public T t;
        public N n;

        public A(T t, N n) {
            this.t = t;
            this.n = n;
        }
    }

}
