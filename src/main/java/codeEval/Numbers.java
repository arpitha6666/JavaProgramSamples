package codeEval;
//

import java.util.Arrays;
import java.util.Collections;

public class Numbers {
    //Pass two ints as parameter and return the sum of numbers.
    public int sumOfTheNumbers(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    //Check the given number is odd or even ,
    // The definition of an "even" number is that the number is divisible by "2" without a remainder.
    // Mathematicians would write an even number: E = (2xN). Then E is always divisible by "2".
    // The definition applies to all integers, positive and negative, including 0. 77 ->odd , 42 ->even

    public String evenOrOdd(int number) {
        if (number % 2 == 0)
            return "even";
        else
            return "odd";
    }

    //Pass an int as parameter. Test whether the number is divisible by 7 or not . 77-->true , 17-->false
    public boolean numberDivisibleBy7(int number) {
        if (number % 7 == 0)
            return true;
        else
            return false;
    }

    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
    public boolean multipleOfThreeOrFive(int num) {
        if ((num % 3 == 0) || (num % 5 == 0))
            return true;
        else
            return false;

    }
    //Given an array of 'N' elements .Return the sum of all array elements

    public int sumOfArrayElements(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        return sum;
    }

    //Pass an int array and an int and do a search of the second parameter in the first, and return true/false.
    public boolean elementSearchInIntArray(int[] arr, int ele) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    /*
    Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length will be greater than 4. arrayFront9({1, 2, 9, 3, 4})-->true ,
    arrayFront9({1, 2, 3, 4, 9})-->false , arrayFront9({1, 2, 3, 4, 5})-->false
     */
    public boolean elementSearch9(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < 4; i++) {
            if (arr[i] == 9) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //Pass an int as parameter. Find the sum of the digits in the number and return it.
    public int sumOfDigitsInNum(int num) {
        //1234
        int sum = 0;
        while (num != 0) {
            sum = sum + (num % 10); //4,3, 2
            num = num / 10; //123, 12,1
        }
        return sum;
    }

    //Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
    public boolean tripleUp(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i + 1] == nums[i] + 1) && (nums[i + 2] == nums[i] + 2))
                flag = true;
        }
        return flag;
    }

    //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            if (i == 2) {
                sum += i;
            }
        }
        if (sum == 8)
            return true;
        else
            return false;
    }

    //Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
    public boolean haveThree(int[] nums) {
        int apperance = 0;
        for (int i : nums) {
            if (i == 3)
                apperance++;
        }
        if (apperance == 3)
            return true;
        else return false;
    }

    //Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
    public boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0) && (nums[i + 1] % 2 == 0) && (nums[i + 2] % 2 == 0)
                    || (nums[i] % 2 == 1) && (nums[i + 1] % 2 == 1) && (nums[i + 2] % 2 == 1))
                return true;
        }
        return false;
    }

    //Given an array of ints, return true if every element is a 1 or a 4.
    public boolean only14(int[] nums) {
        boolean flag = false;
        for (int i : nums) {
            if (i == 1 || i == 4) {
                flag = true;
            } else
                flag = false;
        }
        return flag;
    }

    //Given an array of ints, return true if the number of 1's is greater than the number of 4's
    public boolean more14(int[] num) {
        int countOne = 0;
        int countFour = 0;
        for (int i : num) {
            if (i == 1)
                countOne++;
            if (i == 4)
                countFour++;
        }
        if (countOne > countFour)
            return true;
        else
            return false;
    }

    //Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
    public int[] swapEnds(int[] num) {
        int[] out = new int[num.length];
        out[0] = num[num.length - 1];
        for (int i = 1; i < num.length - 1; i++) {
            out[i] = num[i];
        }
        out[num.length - 1] = num[0];
        return out;
    }

    /*
    Given an array of ints, return the number of times that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.
     */
    public int array667(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length - 1; i++) {
            if ((num[i] == 6 && num[i + 1] == 6) || (num[i] == 6 && num[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    public boolean twoAsOne(int a, int b, int c) {
        if (((a + b) == c) || ((b + c) == a) || ((a + c) == b))
            return true;
        else return false;
    }

    //Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.
    public boolean either24(int[] num) {
        boolean res2 = false;
        boolean res4 = false;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == 2 && num[i + 1] == 2)
                res2 = true;
            if (num[i] == 4 && num[i + 1] == 4)
                res4 = true;
        }
        if (res2 != res4)
            return true;
        else
            return false;
    }

    //Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and
    // extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
    public int sum67(int[] num) {
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 6) {
                flag = true;
            }
            if (flag == false)
                sum += num[i];
            if (num[i] == 7)
                flag = false;
        }
        return sum;
    }

    //Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.
    public boolean in3050(int a, int b) {
        if ((a >= 30 && b <= 40) || (a >= 40 && b <= 50))
            return true;
        else
            return false;
    }

    //Given an array of 'n ' ints, return the sum of the first 2 elements in the array.
    // If the array length is less than 2, just sum up the elements that exist.
    public int sum2(int[] arr) {
        int sum = 0;
        if (arr.length < 2) {
            sum = sum + arr[0];
        } else {
            sum = sum + arr[0] + arr[1];
        }
        return sum;
    }

    //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
    public int[] middleWay(int[] a, int[] b) {
        int[] res = new int[2];
        res[0] = a[a.length / 2];
        res[1] = b[b.length / 2];
        return res;
    }

    //Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
    // The original array will contain at least "count" even numbers.
    public int[] copyEvens(int[] num, int count) {
        int[] out = new int[count];
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                out[j] = num[i];
                j++;
                count--;

                if (count == 0)
                    break;
            }

        }
        return out;
    }

    //Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
    // Note that Math.abs(n) returns the absolute value of a number.
    public int close10(int a, int b) {
        if ((Math.abs(10 - a)) == (Math.abs(10 - b)))
            return 0;
        else if ((Math.abs(10 - a)) < (Math.abs(10 - b)))
            return a;
        else
            return b;
    }

    //TODO:
    //Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
    // If there is no odd value to the right of the zero, leave the zero as a zero.
    public int[] zeroMax(int[] num) {
        int[] out = new int[num.length];
        for (int i = 0; i < num.length - 1; i++) {
            if ((num[i] == 0) && (num[i + 1] % 2 != 0)) {
                out[i] = num[i + 1];
            } else {
                out[i] = num[i];
            }
        }
        return out;
    }
    /*
    We'll say that an element in an array is "notalone" if there are values before and after it,
    and those values are different from it. Return a version of the given array where every instance
    of the given value which is notalone is replaced by whichever value to its left or right is larger.
     */

    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (val == nums[i]) {
                if (nums[i - 1] > nums[i + 1]) {
                    nums[i] = nums[i - 1];
                } else
                    nums[i] = nums[i + 1];
            }
        }
        return nums;

    }

    /*
    Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
    except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
    ignore just one copy, and likewise for the largest value.
     Use int division to produce the final average. You may assume that the array is length 3 or more.
     */
    public int centeredAverage(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int count = nums.length;
        for (int i = 1; i < count - 1; i++) {
            sum = sum + nums[i];

        }
        return sum / (nums.length - 2);
    }

    //Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
    public boolean has12(int[] nums) {
        boolean oneflag = false;
        boolean twoFalg = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                oneflag = true;
            if (nums[i] == 2)
                twoFalg = true;
        }
        if (oneflag && twoFalg)
            return true;
        else return false;
    }

    //Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come
    // before all the odd numbers.You can make a new array and return it.Note:Retain the order of other elements.
    // {1,2,3,4,5,6} -> {2,4,6,1,3,5}
    public int[] evenOdd(int[] nums) {
        int res[] = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[k] = nums[i];
                k++;
            }
        }//even {2,4,6} with k =3
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                res[k] = nums[i];
                k++;
            }
        }
        return res; //{2,4,6,1,3,5}
    }

    //We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
    // Return true if the given array contains an unlucky 1 any where in the array.
    public boolean unlucky1(int[] num) {
        boolean unlucky = false;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == 1 && num[i + 1] == 3) {
                unlucky = true;
            }
        }
        return unlucky;
    }

    //Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    // Return the changed array.Otherwise returned the same array.

    public int[] fix23(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == 2 && num[i + 1] == 3) {
                num[i + 1] = 0;
            }
        }
        return num;
    }

    //Return an array that contains the exact same numbers as the given array,
    // but rearranged so that all the zeros are grouped at the start of the array.
    // So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
    // You can return a new array.please preserve the order of other elements as it is.

    public int[] zeroFront(int[] num) {
        int[] res = new int[num.length];
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                res[j] = num[i];
                j++;
            }
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                res[j] = num[i];
                j++;
            }
        }
        return res;
    }

    //Given an array of scores, return true if each score is equal or greater than the one before.
    // The array will be length 2 or more.
    public boolean scoresIncreasing(int[] scores) {
        boolean score = false;
        int max = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            if (!(scores[i] < scores[i + 1])) {
                score = false;
                break;
            } else
                score = true;
        }
        return score;
    }

    //Given an int N,return the absolute difference between N and 21,
    // except return double the absolute difference if N is over 21.
    // diff21(19) --> 2 , diff21(10)--> 11 , diff21(21)-->0 , diff21(23)--> 4
    public int diff21(int n) {
        int newN = Math.abs(n);
        if(newN ==21 || newN<21)
            return 21-newN;
        else
            return Math.abs(21-newN)*2;
    }

    //Given an array of 'n' ints .Arrange the array elements in reverse order.
    public int[] reverseArray(int[] b){
        int[] res = new int[b.length];
        int j=0;
        for(int i =b.length-1;i>=0;i--){
            res[i]=b[j];
            j++;
        }
        return res;
    }


    //Given an array of 'N' ints .The method which returns the min from the elements.
    public int findMinimum(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
}
