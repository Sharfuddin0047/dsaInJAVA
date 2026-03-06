package RandomQuestion.customexception;

public class CustomExceptionTutorial {
    private static void validateAge(int age) throws AgeLessThanZeroException {
        if(age<0) {
            // throw new AgeLessThanZeroException();
            // throw new AgeLessThanZeroException("Age cannot be negetive");
            throw new AgeLessThanZeroException("Age cannot be negetive",new RuntimeException());
        }
    }
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(-1);
    }
}
