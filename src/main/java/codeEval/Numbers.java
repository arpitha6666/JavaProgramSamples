package codeEval;
//

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
    public boolean numberDivisibleBy7(int number){
        if(number%7==0)
            return true;
        else
            return false;
    }

    //Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator
    public boolean multipleOfThreeOrFive(int num){
        if((num%3==0)||(num%5==0))
            return true;
        else
            return false;

    }
    //Given an array of 'N' elements .Return the sum of all array elements

    public int sumOfArrayElements(int[] num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        return sum;
    }
    //Pass an int array and an int and do a search of the second parameter in the first, and return true/false.
    public boolean elementSearchInIntArray(int [] arr, int ele){
        boolean flag=false;
        for(int i =0;i<arr.length;i++){
            if(ele==arr[i]){
                flag=true;
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
    public boolean elementSearch9(int [] arr){
        boolean flag=false;
        for(int i =0;i<4;i++){
            if(arr[i]==9){
                flag=true;
                break;
            }
        }
        return flag;
    }

    //Pass an int as parameter. Find the sum of the digits in the number and return it.
    public int sumOfDigitsInNum(int num){
        //1234
        int sum=0;
        while(num!=0) {
            sum = sum+(num % 10); //4,3, 2
            num=num/10; //123, 12,1
        }
        return sum;
    }

    //Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
    public boolean tripleUp(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i + 1] == nums[i] + 1 )&& (nums[i + 2] == nums[i] + 2))
                flag = true;
        }
        return flag;
    }
    //Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
    public boolean sum28(int[] nums) {
        int sum=0;
        for(int i : nums){
            if (i==2){
                sum+=i;
            }
        }
        if (sum==8)
            return true;
        else
            return false;
    }
    //Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
    public boolean haveThree(int[] nums) {
        int apperance=0;
        for(int i : nums){
            if (i==3)
                apperance++;
        }
        if(apperance==3)
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
        for(int i : nums){
            if (i == 1 || i ==4){
                flag=true;
            } else
                flag = false;
        }
        return flag;
    }

    //Given an array of ints, return true if the number of 1's is greater than the number of 4's
    public boolean more14(int[] num) {
        int countOne=0;
        int countFour=0;
        for(int i : num){
            if(i==1)
                countOne++;
            if(i==4)
                countFour++;
        }
        if(countOne > countFour)
            return true;
        else
            return false;
    }

    //Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least 1.
    public int[] swapEnds(int[] num){
        int[] out = new int[num.length];
        out[0]=num[num.length-1];
        for(int i =1;i<num.length-1;i++){
            out[i]= num[i];
        }
        out[num.length-1]=num[0];
        return out;
    }

    /*
    Given an array of ints, return the number of times that two 6's are next to each other in the array.
    Also count instances where the second "6" is actually a 7.
     */
    public int array667(int[] num) {
        int count=0;
        for(int i=0;i<num.length-1;i++){
            if((num[i]==6 && num[i+1]==6) || (num[i]==6 && num[i+1]==7)){
                count++;
            }
        }
        return count;
    }

    //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
    public boolean twoAsOne(int a, int b, int c) {
        if(((a+b) == c) || ((b+c) == a)  || ((a+c) == b) )
            return true;
        else return false;
    }





}
