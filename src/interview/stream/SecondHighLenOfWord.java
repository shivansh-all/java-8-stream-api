package interview.stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighLenOfWord {
    public static void main(String[] args) {
        /*
        * Find the 2nd Highest length word in a sentence
        * I/P : I am learning streams api in java
        * O/P : 7
        * */

        String s="I am learning streams api in java";
        int high=2;
        int smax=Arrays.stream(s.split(" ")).map(x->x.length()).sorted(Comparator.reverseOrder())
                .skip(high-1).findFirst().get();

        System.out.println(smax);
    }
}
