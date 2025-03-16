package arraysClass;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35, 87, 52, 33};
        System.out.println(Arrays.toString(Arrays.copyOf(intArr,10)));
        System.out.println(Arrays.toString(Arrays.copyOfRange(intArr,1,3)));
    }
}
