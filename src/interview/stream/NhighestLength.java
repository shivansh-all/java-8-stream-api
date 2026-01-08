package interview.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class NhighestLength {
    public static void main(String[] args) {
        /*
        * Given a Sentence , find the word that has the 2nd (Nth) highest length
        * I/O : I am learning streams api in java
        * O/P  : streams
        * */

        String s="I am learning streams api in java";
        int high=2;
        String res=Arrays.stream(s.split(" ")).sorted(Comparator.comparing(String::length)
                .reversed()).skip(high-1).findFirst().get();
        System.out.println(res);
    }
}
