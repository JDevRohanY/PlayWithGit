package MergeSortUsingThreads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arr = List.of(5,1,3,9,8,4,7,2,6);
        //We need to sort the array using thread pool
        //Create an executor service
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Create an object
        MergeSorter mergeSorter = new MergeSorter(arr, executorService);
        Future<List<Integer>> futureResult = executorService.submit(mergeSorter);
        List<Integer> result = futureResult.get();
        System.out.println(result);
        executorService.shutdown();
    }
}
