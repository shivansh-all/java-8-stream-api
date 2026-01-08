package interview.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        * remove duplicate from the string and return in the same order
        * I/P : dabcadefg
        * O/P: dabcefg
        * */

        String s="dabcadefg";
        //s.chars().forEach(System.out::println);
        s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
        //or
        System.out.println();
        Arrays.stream(s.split("")).distinct().forEach(System.out::print);
    }
}
