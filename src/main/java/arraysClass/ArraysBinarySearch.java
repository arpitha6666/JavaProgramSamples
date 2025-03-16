package arraysClass;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35,87,52,33};
        Arrays.sort(intArr);
        int key = 33;
        System.out.println(key + " found at  " + Arrays.binarySearch(intArr, key));
    }
}
