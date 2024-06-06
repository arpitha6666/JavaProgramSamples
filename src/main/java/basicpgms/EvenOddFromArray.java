package basicpgms;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a[]= {5,2,9,7,6,16};
		System.out.println("Even numbers :");
		for(int i : a) {
			if (i%2==0)
				System.out.println(i);		
		}
		System.out.println("Odd numbers :");
		for(int i : a) {
			if (i%2!=0)
				System.out.println(i);		
		}

	}

}
