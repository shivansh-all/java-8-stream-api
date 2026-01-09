package interview.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfInFromStr {
    public static void main(String[] args) {
        String s[]={"s","1235","dsad","255","dsad","2"};
        List list=Arrays.stream(s).filter(xx-> xx.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list);
    }
}
