package module5.review;

import java.util.Properties;

public class Question17 {
    private static void print(Properties props) {
        System.out.println(props.get("veggies")
                + " " + props.get("omni"));

        props.keySet().stream().map(props::get)
                .forEach(System.out::println);
    }
}
