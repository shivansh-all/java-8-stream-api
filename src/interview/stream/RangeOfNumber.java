package interview.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RangeOfNumber {
    /*
    * I/P : arr=[1,2,10,14,20,24,32,36,..]
    * O/P : [0=[1.2],10=[10,14],20=[20,24],30=[32,36]]
    * */
    public static void main(String[] args) {
        int arr[]={1,2,10,14,20,24,32,36,45,46,50,55};
        Map<Integer, List<Integer>> map=Arrays.stream(arr).boxed().collect(Collectors.toList())
                .stream().collect(Collectors.groupingBy(x->x/10*10, LinkedHashMap::new,Collectors.toList()));

        System.out.println(map);
    }



}
