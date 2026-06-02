//Given a list of transactions, find total transaction amount per category.

package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamQ12 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("Food", 100),
            new Transaction("Food", 200),
            new Transaction("Food", 150),
            new Transaction("Shopping", 300),
            new Transaction("Shopping", 250),
            new Transaction("Shopping", 100),
            new Transaction("Utilities", 400),
            new Transaction("Utilities", 300),
            new Transaction("Entertainment", 500),
            new Transaction("Entertainment", 200),
            new Transaction("Travel", 700),
            new Transaction("Travel", 300)
        );

        // Group by category and sum amounts
        Map<String, Integer> totalPerCategory = transactions.stream()
            .collect(Collectors.groupingBy(txn -> txn.getCategory(),
                    Collectors.summingInt(txn -> txn.getAmount())));

        // Print results
        totalPerCategory.forEach((category, total) ->
            System.out.println(category + " : " + total));
    }
}
