package module6;

public class ExceptionOrderExample implements AutoCloseable {
    int num;

    ExceptionOrderExample(int num) {
        this.num = num;
    }

    public void close() {
        System.out.println("Close: " + num);
    }

    public static void main(String[] args) {
        try (ExceptionOrderExample a1 = new ExceptionOrderExample(1);
             ExceptionOrderExample a2 = new ExceptionOrderExample(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }
}
