package module6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.NotSerializableException;
import java.sql.SQLException;
import java.text.ParseException;

public class CheckedExceptionsExample {
    public static void main(String[] args) {
        Exception exception1 = new IOException();
        exception1 = new FileNotFoundException();
        exception1 = new NotSerializableException();

        Exception exception2 = new ParseException("", 0);

        Exception exception3 = new SQLException();

    }
}
