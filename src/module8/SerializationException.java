package module8;

import java.io.Serializable;

public class SerializationException {

    private class Tup implements Serializable {
        private Integer i;
        private StrictMath s;
        private transient String df;
    }

    public static void main(String[] args) {

        // TODO: 09.03.2019

    }

}
