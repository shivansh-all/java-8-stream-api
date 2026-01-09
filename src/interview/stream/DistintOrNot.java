package interview.stream;

import java.util.Arrays;

public class DistintOrNot {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        if(Arrays.stream(arr).boxed().distinct().toList().size()==arr.length){
            System.out.println(true);
        }else System.out.println(false);

        //or

        if(Arrays.stream(arr).boxed().distinct().count()==arr.length){
            System.out.println(true);
        }else System.out.println(false);
    }
}
