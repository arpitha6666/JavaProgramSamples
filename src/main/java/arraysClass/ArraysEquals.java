package arraysClass;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35, 87, 52, 33};
        int arr2[] = {10, 20, 15, 22, 35, 87, 52, 33,66};
        System.out.println(Arrays.equals(intArr,arr2));
    }
}
