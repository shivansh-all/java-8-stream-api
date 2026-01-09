package interview.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        String s[]={"pat","tap","meat","team","tree"};
        List<String> sList=Arrays.asList(s);
        Collection<List<String>> values = sList.stream().collect(
                Collectors.groupingBy(x ->
                        Arrays.stream(x.toLowerCase().split(""))
                                .sorted().collect(Collectors.toList()))).values();

        System.out.println(values);
    }
}
