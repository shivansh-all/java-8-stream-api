package interview.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductAlternativeNumber {
    public static void main(String[] args) {
        int arrInt[]={1,2,3,4,5,6,7,5,6};

        // there is no direct wat to get index in strem

        int reduce = IntStream.range(0, arrInt.length).filter(x -> x % 2 == 0)
                .map(x -> arrInt[x]).reduce(1, (a, b) -> a * b);

        System.out.println(reduce);
    }
}
