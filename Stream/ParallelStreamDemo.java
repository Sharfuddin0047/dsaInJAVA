import java.util.*;
import java.util.stream.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        // Create a large list of integers
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000)
                                         .boxed()
                                         .collect(Collectors.toList());

        // Sequential stream
        long startSeq = System.currentTimeMillis();
        long sumSeq = numbers.stream()
                             .mapToLong(n -> n * n) // square each number
                             .sum();
        long endSeq = System.currentTimeMillis();

        System.out.println("Sequential sum = " + sumSeq +
                           " in " + (endSeq - startSeq) + " ms");

        // Parallel stream
        long startPar = System.currentTimeMillis();
        long sumPar = numbers.parallelStream()
                             .mapToLong(n -> n * n)
                             .sum();
        long endPar = System.currentTimeMillis();

        System.out.println("Parallel sum   = " + sumPar +
                           " in " + (endPar - startPar) + " ms");
    }
}
