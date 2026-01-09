package interview.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MiddleChar {
    public static void main(String[] args) {
        String arr[]={"qwe","asd","ert","gjh","swe"};

        List<Character> list = Arrays.stream(arr).map(x -> x.charAt(x.length() / 2)).toList();

        System.out.println(list);

        // or
        System.out.println(Arrays.stream(arr)
                .collect(Collectors.groupingBy(x->x.charAt(x.length()/2))));

    }
}
