package MergeSortUsingThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arr = new ArrayList<>();
    private ExecutorService executorService;

    //Create a constructor
    public MergeSorter(List<Integer> arr, ExecutorService executorService) {
        this.arr = arr;
        this.executorService = executorService;
    }


    @Override
    public List<Integer> call() throws Exception {
        //We need to sort the array
        //First check the array size
        if(arr.size()<=1){
            return arr;
        }
        //Create two array out of it
        int mid = arr.size()/2;
        List<Integer> leftArray = arr.subList(0,mid);
        List<Integer> rightArray = arr.subList(mid,arr.size());

        //Now create a task for executor service
        //First create an object of merge sorter
        Future<List<Integer>> leftSortedFuture = executorService.submit(new MergeSorter(leftArray, executorService));
        Future<List<Integer>> rightSortedFuture = executorService.submit(new MergeSorter(rightArray, executorService));

        //Lets extract the value of sorted array
        List<Integer> leftSortedResult = leftSortedFuture.get();
        List<Integer> rightSortedResult = rightSortedFuture.get();

        //Now merge the sorted array
        return mergeSortedArray(leftSortedResult, rightSortedResult);
    }

    private List<Integer> mergeSortedArray(List<Integer> leftSortedResult, List<Integer> rightSortedResult) {
        List<Integer> result = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < leftSortedResult.size() && pointer2 < rightSortedResult.size()) {
            if(leftSortedResult.get(pointer1) <= rightSortedResult.get(pointer2)) {
                result.add(leftSortedResult.get(pointer1));
                pointer1++;
            }else{
                result.add(rightSortedResult.get(pointer2));
                pointer2++;
            }
        }
        while (pointer1 < leftSortedResult.size()) {
            result.add(leftSortedResult.get(pointer1));
            pointer1++;
        }
        while (pointer2 < rightSortedResult.size()) {
            result.add(rightSortedResult.get(pointer2));
            pointer2++;
        }
        return result;
    }
}
