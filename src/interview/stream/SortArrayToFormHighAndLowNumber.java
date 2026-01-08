package interview.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayToFormHighAndLowNumber {
    public static void main(String[] args) {
        int arr[] = {172,2,3,4,5};
        List<Integer> mainArr=Arrays.stream(arr).boxed().collect(Collectors.toList());
        mainArr.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
        System.out.println("");
        mainArr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::print);


    }
}
