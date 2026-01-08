package interview.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfUniqueElement {
    public static void main(String[] args) {

        int arr[] = {1,1,2,3,4,5,8,9,7,5};
        System.out.println(Arrays.stream(arr).distinct().sum());
    }
}
