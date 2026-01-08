package interview.stream;

import java.util.Arrays;

public class firstRepeatingChar {
    public static void main(String[] args) {
        String s="hello world";
        String ans= Arrays.stream(s.split("")).filter(x->s.indexOf(x)!=s.lastIndexOf(x)).findFirst().get();
        System.out.println(ans );
    }

}
