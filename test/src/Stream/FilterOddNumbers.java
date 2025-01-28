package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOddNumbers {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 6 ,2, 3, 9, 4, 7, 5, 8);
        List<Integer> filteredNumbers = filterOddNumbers(number);
        System.out.println(filteredNumbers);

    }

    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        /*
            Stream<Integer> numberStream = numbers.stream();
            List<Integer> filteredNumber = numberStream.
                                                filter((x)->x%2==1).
                                                toList();
            return filteredNumber;
         */
        return numbers.stream().
                filter((x)->x%2==1).
                collect(Collectors.toList());
    }
}
