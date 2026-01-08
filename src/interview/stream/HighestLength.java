package interview.stream;

import java.util.Arrays;
import java.util.Comparator;

public class HighestLength {
    public static void main(String[] args) {
        /*
        * Given a sentence , find the word that has the highest length
        * I/P: I am learning Stream API in java
        * O/P: learning
        * */

        String s="I am learning Stream API in java";
        String res=Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(res);
    }
}
