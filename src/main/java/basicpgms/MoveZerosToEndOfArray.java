package basicpgms;

public class MoveZerosToEndOfArray {

	/*
	 * Time complexity must be O(n) - You can iterate only once. Extra space
	 * complexity must be O(1) - You cannot create extra array.
	 * 
	 * 
	 * Steps to be followed :
	 * 
	 * Iterate through array & maintain a count of non-zero elements. Whenever we
	 * encounter a non-zero element put at count location in array & also increase
	 * the count. Once array is iterated completely put the zeros at end of array
	 * till the count reach to original length of array.
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 0, 3, 0, 0, 4, 0, 6, 0, 9 };
		// Maintaining the count of non zero elements
		int count = -1;
		// Iterating through array and copying non zero elements in front of the array;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				arr[++count] = arr[i];
		}
		while(count<arr.length-1)
			arr[++count]=0;
		  for (int i = 0; i < arr.length; i++) {
		      System.out.print(arr[i] + " ");
	}
	}

}
