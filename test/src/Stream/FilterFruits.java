package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterFruits {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Alpine", "Orange", "Avocado", "Almond");
        List<String> fruitsStartWithA = filterFruitsByStartName(fruits);
        System.out.println(fruitsStartWithA);
    }

    public static List<String> filterFruitsByStartName(List<String> fruits) {
//        Stream<String> fruitStream = fruits.stream();
//        List<String> filteredFruits = fruitStream.
//                                        filter((x)->x.startsWith("A")).
//                                        collect(Collectors.toList());
//        return filteredFruits;
        return fruits.stream().
                filter((x)->x.startsWith("A")).
                collect(Collectors.toList());

    }
}
