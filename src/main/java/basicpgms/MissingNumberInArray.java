package basicpgms;

public class MissingNumberInArray {

	//Array should not have Duplicates
	//Array need not be sorted
	//Value should be in range
	//Find the missing natural number in the Array 
	
	/*Approach :1. Find the sum of the elements in the array
	 * 2. Find the sum of the numbers in natural order 
	 * 3.Find the difference between the sum calculated in step2 and step1., this is the missing number in the array
	 */
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,7,8};
		int sum_arr=0,sum=0, result=0;
		
		for(int i:a)
			sum_arr=sum_arr+i;
		
		int max_value=a[a.length-1];
		for(int i=1;i<=max_value;i++) {
			sum=sum+i;
		}
		result=sum-sum_arr;
		System.out.println("Missing number is "+result);

	}

}
