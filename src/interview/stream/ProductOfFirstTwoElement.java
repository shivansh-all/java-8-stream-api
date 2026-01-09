package interview.stream;

import java.util.Arrays;

public class ProductOfFirstTwoElement {
    public static void main(String[] args) {
        int arr[]={4,2,3,4,5,6};

        System.out.println(Arrays.stream(arr).limit(2).reduce(1,(a,b)->a*b));

        System.out.println(Arrays.stream(arr).limit(2).reduce((a,b)->a+b).getAsInt());

    }
}
