package codeEval;

public class TestClassNumber {
    public static void main(String[] args){
        Numbers n = new Numbers();
        int[] arr = new int[]{1,334,5,56,7,87,989,879,78};
        System.out.println("Pass two ints as parameter and return the sum of numbers - 10 and 25 : " + n.sumOfTheNumbers(10,25));
        System.out.println("Check the given number is odd or even " + " - 157 is : " + n.evenOrOdd(157));
        System.out.println("Test whether the number is divisible by 7 or not " + " - 157 is : " + n.numberDivisibleBy7(157));
        System.out.println("Return true if the given non-negative number " +
                "is a multiple of 3 or a multiple of 5 " + " - number 157 is : " + n.multipleOfThreeOrFive(157));
        System.out.println("Return true if the given non-negative number " +
                "is a multiple of 3 or a multiple of 5 " + " - number 155 is : " + n.multipleOfThreeOrFive(155));
        System.out.println("Return true if the given non-negative number " +
                "is a multiple of 3 or a multiple of 5 " + " - number 342 is : " + n.multipleOfThreeOrFive(342));
        System.out.println("Given an array of 'N' elements .Return the sum of all array elements- "+n.sumOfArrayElements(arr));
        System.out.println("Pass an int array and an int and do a " +
                "search of the second parameter in the first - "+n.elementSearchInIntArray(arr,7));
        System.out.println("Pass an int array and an int and do a " +
                "search of the second parameter in the first - "+n.elementSearchInIntArray(arr,4));
        System.out.println("Given an array of ints, return true if one of the first 4 " +
                "elements in the array is a 9 - "+n.elementSearch9(new int[]{1, 2, 9, 3, 4}));
        System.out.println("Given an array of ints, return true if one of the first 4 " +
                "elements in the array is a 9 - "+n.elementSearch9(new int[]{1, 2, 3, 4, 9}));
        System.out.println("Given an array of ints, return true if one of the first 4 " +
                "elements in the array is a 9 -"+n.elementSearch9(new int[]{1, 2, 3, 4, 5}));
        System.out.println("Pass an int as parameter. " +
                "Find the sum of the digits in the number and return it. -"+n.elementSearch9(new int[]{1, 2, 3, 4, 5}));

        System.out.println("Pass an int as parameter. " +
                "Find the sum of the digits in the number and return it -"+n.sumOfDigitsInNum(1234));
        System.out.println("Pass an int as parameter. " +
                "Find the sum of the digits in the number and return it -"+n.sumOfDigitsInNum(789512));

        System.out.println("Return true if the array contains, somewhere," +
                " three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25 -"+n.tripleUp(new int[]{1,0,2,3,4,8}));

        System.out.println("Return true if the array contains, somewhere, " +
                "three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25 - "+n.tripleUp(new int[]{1,0,2,4,8}));

    }
}
