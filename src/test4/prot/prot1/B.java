package test4.prot.prot1;

import test4.prot.A;

public class B  extends A {
    public void get(A a){
        ((B)a).i = 0;
//        a.i = 0;
    }

    enum AAAA{
        AB(5), BC(6);
        int i;
        static int b;
        AAAA(int i){
            this.i = i
//                    + b
            ;
        }
    }
}
