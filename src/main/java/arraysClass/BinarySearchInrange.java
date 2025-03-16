package arraysClass;

import java.util.Arrays;

public class BinarySearchInrange {
    public static void main(String[] args) {
        int intArr[] = {10, 20, 15, 22, 35,87,52,33};
        Arrays.sort(intArr);
        int key = 20;
        System.out.println(key + " found at  " + Arrays.binarySearch(intArr,1,2, key));
    }
}
