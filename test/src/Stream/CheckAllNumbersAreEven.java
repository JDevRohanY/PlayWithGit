package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckAllNumbersAreEven {
    public static void main(String[] args) {
        List<Integer> number = List.of(1, 6 ,2, 3, 9, 4, 7, 5, 8);
        boolean allNumbersAreEven = checkAllEven(number);
        System.out.println(allNumbersAreEven);
        System.out.println(number);
        if(!allNumbersAreEven){
            List<Integer> filterEven = filterEven(number);
            System.out.println(filterEven);
            // check are all even
            System.out.println(checkAllEven(filterEven));
        }
    }

    private static boolean checkAllEven(List<Integer> number) {
        Stream<Integer> stream = number.stream();
        return stream.
                    allMatch(i -> i%2 ==0);
    }

    private static List<Integer> filterEven(List<Integer> number) {
        return number.stream().
                filter((i)->i%2==0).
                collect(Collectors.toList());
    }
}
