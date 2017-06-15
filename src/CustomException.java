/**
 * Created by ahoy on 3/6/17.
 */
public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }
}

class Test123 {
    public static void main(String[] args) throws Exception {
        throw new CustomException("Custom Exception");
    }
}
