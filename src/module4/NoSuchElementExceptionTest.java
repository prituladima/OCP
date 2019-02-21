package module4;

import java.util.Optional;

public class NoSuchElementExceptionTest {

    public static void main(String[] args) {
        Optional.empty().get();
    }

}
