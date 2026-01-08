package interview.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurenceCOunt {
    public static void main(String[] args) {
        String s="Mississippi";
       Map<String ,Long> map= Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(map);

    }
}
