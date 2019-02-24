package module6;

public enum Seasons {
    SPRING, SUMMER, FALL, ERR;

    public static void main(String[] args) {
        test(ERR);
    }

    public static void test(Seasons s) {
        switch (s) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
                break;
            case SUMMER:
                System.out.println("Longer hours");
                break;
            default:
                assert false : "Invalid season";
        }
    }


}
