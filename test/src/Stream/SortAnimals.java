package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortAnimals {
    public static void main(String[] args) {
        List<String> animals = List.of(
                "Lion",
                "Tiger",
                "Elephant",
                "Giraffe",
                "Zebra",
                "Kangaroo",
                "Panda",
                "Penguin",
                "Dolphin",
                "Eagle"
        );

        List<String> sortAnimals = sortAnimalOnLength(animals);
        System.out.println(sortAnimals);

    }

    private static List<String> sortAnimalOnLength(List<String> animals) {
        Stream<String> animalStream = animals.stream();
        return animalStream.
                                        sorted(new Comparator<String>() {
                                            @Override
                                            public int compare(String o1, String o2) {
                                                return o2.length() - o1.length();
                                            }
                                        }).
                                        collect(Collectors.toList());
    }
}
