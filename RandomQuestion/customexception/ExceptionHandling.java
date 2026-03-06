package RandomQuestion.customexception;

public class ExceptionHandling {

    public static int printNumber() {
        try {
            return 3;
        } catch (Exception e) {
            return 4;
        } finally {
            return 5;
        }
    }
    public static void main(String[] args) {
        // try {
        //     int myInt = Integer.parseInt("1");
        //     System.out.println("After parsing pants..");
        // } catch (NumberFormatException | NullPointerException e) {
        //     System.out.println("You can't make int out of that... Stop Trying");
        // } finally {
        //     System.out.println("Inside the finally block");
        // }
        // System.out.println("Program End");
        System.out.println(printNumber());

    }
}
