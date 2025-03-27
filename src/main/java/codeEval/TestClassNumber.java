package codeEval;

public class TestClassNumber {
    public static void main(String[] args){
        Numbers n = new Numbers();
        int[] arr = new int[]{1,334,5,56,7,87,989,879,78};
        System.out.println("1 - Pass two ints as parameter and return the sum of numbers - 10 and 25 : " + n.sumOfTheNumbers(10,25));
        System.out.println("2 - Check the given number is odd or even " + " - 157 is : " + n.evenOrOdd(157));
        System.out.println("3 - Test whether the number is divisible by 7 or not " + " - 157 is : " + n.numberDivisibleBy7(157));
        System.out.println("4 - Return true if the given non-negative number " +
                "is a multiple of 3 or a multiple of 5 " + " - number 157 is : " + n.multipleOfThreeOrFive(157));
        System.out.println("4 - Return true if the given non-negative number " +
                "is a multiple of 3 or a multiple of 5 " + " - number 155 is : " + n.multipleOfThreeOrFive(155));
        System.out.println("4 - Return true if the given non-negative number " +
                "is a multiple of 3 or a multiple of 5 " + " - number 342 is : " + n.multipleOfThreeOrFive(342));
        System.out.println("5 - Given an array of 'N' elements .Return the sum of all array elements- "+n.sumOfArrayElements(arr));
        System.out.println("6 - Pass an int array and an int and do a " +
                "search of the second parameter in the first - "+n.elementSearchInIntArray(arr,7));
        System.out.println("7 - Pass an int array and an int and do a " +
                "search of the second parameter in the first - "+n.elementSearchInIntArray(arr,4));
        System.out.println("7 - Given an array of ints, return true if one of the first 4 " +
                "elements in the array is a 9 - "+n.elementSearch9(new int[]{1, 2, 9, 3, 4}));
        System.out.println("8 - Given an array of ints, return true if one of the first 4 " +
                "elements in the array is a 9 - "+n.elementSearch9(new int[]{1, 2, 3, 4, 9}));
        System.out.println("8 - Given an array of ints, return true if one of the first 4 " +
                "elements in the array is a 9 -"+n.elementSearch9(new int[]{1, 2, 3, 4, 5}));
        System.out.println("8 - Pass an int as parameter. " +
                "Find the sum of the digits in the number and return it. -"+n.elementSearch9(new int[]{1, 2, 3, 4, 5}));
        System.out.println("9 - Pass an int as parameter. " +
                "Find the sum of the digits in the number and return it -"+n.sumOfDigitsInNum(1234));
        System.out.println("9 - Pass an int as parameter. " +
                "Find the sum of the digits in the number and return it -"+n.sumOfDigitsInNum(789512));
        System.out.println("10 - Return true if the array contains, somewhere," +
                " three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25 -"+n.tripleUp(new int[]{1,0,2,3,4,8}));
        System.out.println("10 - Return true if the array contains, somewhere, " +
                "three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25 - "+n.tripleUp(new int[]{1,0,2,4,8}));
        System.out.println("11 - Given an array of ints, return true if the sum of all the 2's in the array is exactly 8. "
                +n.sum28(new int[]{1,2,2,4,8,85,2}));
        System.out.println("12 - Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other - "
                +n.haveThree(new int[]{1,2,3,3,85,2}));
        System.out.println("13  - Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other - "
                +n.modThree(new int[]{1,2,3,3,3,85,2}));
        System.out.println("14 - Given an array of ints, return true if every element is a 1 or a 4 - "
                +n.only14(new int[]{1,2,3,3,3,85,2}));
        System.out.println("14 - Given an array of ints, return true if every element is a 1 or a 4 - "
                +n.only14(new int[]{1,4,1}));
        System.out.println("15 - Given an array of ints, return true if the number of 1's is greater than the number of 4's - "
                +n.more14(new int[]{1,4,1,4}));
        System.out.println("15 - Given an array of ints, return true if the number of 1's is greater than the number of 4's - "
                +n.more14(new int[]{1,4,1}));
        System.out.println("16 - Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length will be at least - ");
        int[] out =n.swapEnds(new int[]{1,5,1,0,4,85});
        for(int i : out)
            System.out.print(i + " ");
        System.out.println("17 - Given an array of ints, return the number of times that two 6's are next to each other in the array.\n" +
                "Also count instances where the second \"6\" is actually a 7 - "
                +n.array667(new int[]{1,6,6,7,71,9,3}));

        System.out.println("18 - Given three ints, a b c, return true if it is possible to add two of the ints to get the third - "
                +n.twoAsOne(1,2,4));
        System.out.println("18 - Given three ints, a b c, return true if it is possible to add two of the ints to get the third - "
                +n.twoAsOne(1,2,3));

    }
}
