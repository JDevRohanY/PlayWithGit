package Generics;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayElements <T>{

    public static <T> void printArray(List<T> array) {
        for(T item : array){
            System.out.print(item + " ");
        }
    }
}
