package interview.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroToBeg {

    /*
    * I/P : {0,1,2,0,2,0,3,0}
    * O/P : {0,0,0,0,1,2,2,3}
    * */

    public static void main(String[] args) {

        int arr[]={0,1,2,0,2,0,3,0};

        List zero=Arrays.stream(arr).boxed().filter(x->x==0).collect(Collectors.toList());
        List nonzero= Arrays.stream(arr).boxed().filter(x->x!=0).collect(Collectors.toList());
        List finalList = new ArrayList();
        finalList.addAll(zero);
        finalList.addAll(nonzero);
        System.out.println(finalList);

        // or

        List finalList2 = Stream.concat(Arrays.stream(arr).boxed().filter(x->x==0),
                Arrays.stream(arr).boxed().filter(x->x!=0)).toList();
        System.out.println(finalList2);

        //or
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(x->x!=0)).
                values().stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        Collection<List<Integer>> values = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(x -> x != 0)).values();

        List<Integer> list = values.stream().flatMap(Collection::stream).toList();

        System.out.println(list);

    }
}
