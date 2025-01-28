package Stream;

import java.util.List;

public class DistinctNumberUsingLambdaAndStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 12, 5, 9, 3, 15, 6, 8, 7, 2, 11, 14, 1, 5, 10, 13, 4, 12, 1);
        //Now we need to filter all the distinct numbers, but we also need to maintain the order
        List<Integer> distinctNumber = numbers.stream().
                                            distinct().
                                            toList();
        System.out.println(distinctNumber);

    }
}
