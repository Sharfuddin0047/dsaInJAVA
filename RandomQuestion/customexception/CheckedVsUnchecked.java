package RandomQuestion.customexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        } catch (Exception e) {
            System.out.println("String Cannot be null");
        }
    }

    public static void main(String[] args){
        printLength(null);
    }
}
