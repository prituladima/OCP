package module3;

import java.util.TreeSet;

public class CeilingInTreeSet {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
        for (String s : tree) {
            System.out.println(s);
        }
        for (char i = '1'; i <= 'z'; i++) {
            System.out.println(i);
        }

//        "1-9" -> "A-Z" -> "twoArgs-z"
    }
}
