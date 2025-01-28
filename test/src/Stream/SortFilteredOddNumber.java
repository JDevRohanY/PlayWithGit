package Stream;

import java.util.List;

public class SortFilteredOddNumber {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 6 ,2, 3, 9, 4, 7, 5, 8);
        List<Integer> filteredNumbers = filterAndSortOddNumbers(number);
        System.out.println(filteredNumbers);

    }

    public static List<Integer> filterAndSortOddNumbers(List<Integer> numbers) {
        /*
            Stream<Integer> numberStream = numbers.stream();
            List<Integer> filteredNumber = numberStream.
                                                filter((x)->x%2==1).
                                                sorted().
                                                toList();
            return filteredNumber;
         */
        return numbers.stream().
                filter((x)->x%2==1).
                sorted().
                toList();
    }
}
