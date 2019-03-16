package testfinal.exception;

public class ExceptionReachExample {
    public static void main(String[] args) throws Exception{

        try{
            //will compile
        }catch (Error | Exception e){

        }

    }
}
