package RandomQuestion.customexception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void readFile(String fileName) throws FileNotFoundException {

        FileReader reader = new FileReader(fileName);

    }

    public static void main(String[] args) throws FileNotFoundException{
        readFile("myFile.txt");
    }
}
