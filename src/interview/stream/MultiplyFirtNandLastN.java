package interview.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MultiplyFirtNandLastN {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        if(arr.length%2==0)
             IntStream.range(0,arr.length/2).map(x->arr[x]*arr[arr.length-x-1]).forEach(System.out::println);
        else
             IntStream.range(0,(arr.length/2)+1).map(x->arr[x]*arr[arr.length-x-1]).forEach(System.out::println);

    }
}
