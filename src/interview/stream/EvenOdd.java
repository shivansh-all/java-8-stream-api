package interview.stream;

import java.util.*;

import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};

        //boxed() -> is used to convert primitive type to its wrapper class
        List<Integer> mainArr= Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Boolean,List<Integer>> seperatedList = mainArr.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()));
        //or
        Map<Boolean,List<Integer>> seperatedList2 = mainArr.stream().collect(Collectors.partitioningBy( x->x%2==0,Collectors.toList()));

        List<List<Integer>> collect = seperatedList.entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
        System.out.println(seperatedList);
        System.out.println(collect);

    }
}
