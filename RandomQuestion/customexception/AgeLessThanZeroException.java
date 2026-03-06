package RandomQuestion.customexception;

public class AgeLessThanZeroException extends Exception{
    AgeLessThanZeroException(){}
    AgeLessThanZeroException(String msg){
        super(msg);
    }

    AgeLessThanZeroException(Throwable cause){
        super(cause);
    }

    AgeLessThanZeroException(String msg, Throwable cause){
        super(msg,cause);
    }
}
