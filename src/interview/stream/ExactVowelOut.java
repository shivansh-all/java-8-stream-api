package interview.stream;

import java.util.Arrays;

public class ExactVowelOut {
    public static void main(String[] args) {

        /*
        * Given a sentence, find the words with a specific number of vowel
        * No. of vowel : 2
        * I/P: I am learning streams api in java
        * O/P: STREAMS ,JAVA , API
        * */
        String s="I am learning streams api in java";
        Arrays.stream(s.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);

    }
}
