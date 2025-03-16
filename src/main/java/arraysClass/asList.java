package arraysClass;

import java.util.Arrays;
import java.util.List;

public class asList {

    public static void main(String args[])
    {
        Integer[] arr = {1,2,3,4,5};
        List<Integer> mylist = Arrays.asList(arr);
        System.out.println(mylist);
    }
}
