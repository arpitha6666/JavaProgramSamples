package wiproCodingQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddTwoNumsRepresenetedAsArrays{
    public static int[] findSum(int[] A, int[] B) {
        int i= A.length-1;
        int j= B.length-1;
        int carry =0;
        List<Integer> result = new ArrayList<>();
        while(i>=0 || j>=0||carry!=0){
            int sum = carry;

            if(i>=0){
                sum=sum+A[i];
                i--;
            }
            if(j>=0){
                sum=sum+B[j];
                j--;
            }
            result.add(sum%10); //store digit
            carry=sum/10;//update carry
        }
        Collections.reverse(result);
        int[] resultArr= result.stream().mapToInt(Integer::intValue).toArray();
        return resultArr;

    }

    //add two numbers represented as arrays
    public static void main(String[] args){
        int[] A = {1, 2, 3};  // 123
        int[] B = {9, 8};     // 98

        int[] sum = findSum(A, B);

        System.out.println(Arrays.toString(sum)); // Output: [2, 2, 1]
    }
}
