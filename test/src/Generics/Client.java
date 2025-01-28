package Generics;

import java.io.Serializable;
import java.util.List;

public class Client<T> {

    public static <T> void main(String[] args) {
        List<String> l1 = List.of("ABC", "CDF", "AFS");
        List<? extends Serializable> l2 = List.of("ABC", 123);
        PrintArrayElements.printArray(l1);
        PrintArrayElements.printArray(l2);
    }
}
