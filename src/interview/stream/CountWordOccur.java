package interview.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CountWordOccur {
    public static void main(String[] args) {
        String s="I am learning streams api in java";
        Map map=Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        //or
        Map map2=Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map2);
    }
}
